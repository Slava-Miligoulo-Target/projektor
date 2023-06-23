/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import projektor.database.generated.tables.ResultsMetadata;
import projektor.database.generated.tables.records.ResultsMetadataRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResultsMetadataDao extends DAOImpl<ResultsMetadataRecord, projektor.database.generated.tables.pojos.ResultsMetadata, Long> {

    /**
     * Create a new ResultsMetadataDao without any configuration
     */
    public ResultsMetadataDao() {
        super(ResultsMetadata.RESULTS_METADATA, projektor.database.generated.tables.pojos.ResultsMetadata.class);
    }

    /**
     * Create a new ResultsMetadataDao with an attached configuration
     */
    public ResultsMetadataDao(Configuration configuration) {
        super(ResultsMetadata.RESULTS_METADATA, projektor.database.generated.tables.pojos.ResultsMetadata.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.ResultsMetadata object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsMetadata> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(ResultsMetadata.RESULTS_METADATA.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsMetadata> fetchById(Long... values) {
        return fetch(ResultsMetadata.RESULTS_METADATA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.ResultsMetadata fetchOneById(Long value) {
        return fetchOne(ResultsMetadata.RESULTS_METADATA.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<projektor.database.generated.tables.pojos.ResultsMetadata> fetchOptionalById(Long value) {
        return fetchOptional(ResultsMetadata.RESULTS_METADATA.ID, value);
    }

    /**
     * Fetch records that have <code>test_run_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsMetadata> fetchRangeOfTestRunId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(ResultsMetadata.RESULTS_METADATA.TEST_RUN_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_run_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsMetadata> fetchByTestRunId(Long... values) {
        return fetch(ResultsMetadata.RESULTS_METADATA.TEST_RUN_ID, values);
    }

    /**
     * Fetch records that have <code>ci BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsMetadata> fetchRangeOfCi(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(ResultsMetadata.RESULTS_METADATA.CI, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ci IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsMetadata> fetchByCi(Boolean... values) {
        return fetch(ResultsMetadata.RESULTS_METADATA.CI, values);
    }

    /**
     * Fetch records that have <code>group BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsMetadata> fetchRangeOfGroup(String lowerInclusive, String upperInclusive) {
        return fetchRange(ResultsMetadata.RESULTS_METADATA.GROUP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>group IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsMetadata> fetchByGroup(String... values) {
        return fetch(ResultsMetadata.RESULTS_METADATA.GROUP, values);
    }
}
