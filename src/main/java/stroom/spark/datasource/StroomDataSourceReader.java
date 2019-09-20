package stroom.spark.datasource;

import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.SupportsPushDownFilters;
import org.apache.spark.sql.types.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static stroom.spark.datasource.StroomDataSource.INDEXED_FIELD_METADATA_KEY;
import static stroom.spark.datasource.StroomDataSource.XPATH_METADATA_KEY;

//Could extend SupportsPushDownFilters and/or SupportsPushDownRequiredColumns
//and/or other subinterfaces of DataSourceReader
// https://spark.apache.org/docs/2.4.3/api/java/index.html?org/apache/spark/sql/sources/v2/DataSourceV2.html
public class StroomDataSourceReader implements DataSourceReader, SupportsPushDownFilters {

    private final String eventTimeFieldName;

    private final String host;
    private final String url;
    private final String token;
    private final String protocol;
    private final String destroyUrl;
    private final String indexUUID;
    private final String extractionPipelineUUID;
    private StroomQuery stroomQuery=null;
    private StroomSearcher searcher;
    private StructType schema = null;
    private int numPartitions = 3;
    private int pageSize = 10000;

    StroomDataSourceReader(final StructType initialSchema, final String protocol,
                           final String host, final String url, final String destroyUrl,
                           final String token, final String indexUUID, final String extractionPipelineUUID,
                           final String eventTimeFieldName){
        this.host = host;
        this.url = url;
        this.token = token;
        this.protocol = protocol;
        this.destroyUrl = destroyUrl;
        this.indexUUID = indexUUID;
        this.extractionPipelineUUID = extractionPipelineUUID;
        this.eventTimeFieldName = eventTimeFieldName;

        this.schema = readSchema(initialSchema);
    }

    public StructType readSchema(){
        return readSchema(null);
    }

    public StructType readSchema(final StructType initialSchema) {
        if (schema == null) {
            ArrayList<StructField> fieldList = new ArrayList<>();

            if (initialSchema != null) {
                for (StructField field : initialSchema.fields()) {
                    fieldList.add(field);
                }
            }

            //The Json field that can be used to extract all items using Spark
            fieldList.add(new StructField("json", DataTypes.StringType, true,
                            new MetadataBuilder().putString(XPATH_METADATA_KEY,".").build()));


            fieldList.add(new StructField("idxEventTime", DataTypes.StringType, false,
                    new MetadataBuilder().putString(INDEXED_FIELD_METADATA_KEY, "EventTime").build()));
            fieldList.add(new StructField("idxUserId", DataTypes.StringType, true,
                    new MetadataBuilder().putString(INDEXED_FIELD_METADATA_KEY, "UserId").build()));
            fieldList.add(new StructField("idxSystem", DataTypes.StringType, true,
                    new MetadataBuilder().putString(INDEXED_FIELD_METADATA_KEY, "System").build()));
            fieldList.add(new StructField("idxEnvironment", DataTypes.StringType, true,
                    new MetadataBuilder().putString(INDEXED_FIELD_METADATA_KEY, "Environment").build()));
            fieldList.add(new StructField("idxGenerator", DataTypes.StringType, true,
                    new MetadataBuilder().putString(INDEXED_FIELD_METADATA_KEY, "Generator").build()));

            schema = new StructType(fieldList.toArray(new StructField[fieldList.size()]));
            System.out.println ("Schema initialised.");
        }

        System.out.println ("Schema provided as " + schema);
        return schema;
    }

    public List<InputPartition<InternalRow>> planInputPartitions() {
        searcher = new StroomSearcher(schema,protocol,host,url,destroyUrl,token);

        searcher.performSearch(stroomQuery.createInitialSearchRequest());

        List<InputPartition<InternalRow>> partitions = new ArrayList();

        for (int i = 0; i < numPartitions; i++){
            partitions.add(new StroomInputPartition(schema, protocol, host, url, destroyUrl, token,
                    stroomQuery.getQueryRequestKey(), pageSize, i, numPartitions, indexUUID, extractionPipelineUUID,
                    eventTimeFieldName));
        }


        return partitions;
    }

    @Override
    public Filter[] pushFilters(Filter[] filters) {

        stroomQuery = new StroomQuery(indexUUID, extractionPipelineUUID, schema, filters, eventTimeFieldName);


        for (int i = 0; i < filters.length; i++)
            System.out.println("Filter: " + filters[i]);

        return stroomQuery.getUnpushedFilters();
    }

    @Override
    public Filter[] pushedFilters() {
        return stroomQuery.getPushedFilters();
    }
}
