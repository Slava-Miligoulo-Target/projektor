/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import projektor.database.generated.tables.ResultsProcessing;
import projektor.database.generated.tables.records.ResultsProcessingRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResultsProcessingDao extends DAOImpl<ResultsProcessingRecord, projektor.database.generated.tables.pojos.ResultsProcessing, String> {

    /**
     * Create a new ResultsProcessingDao without any configuration
     */
    public ResultsProcessingDao() {
        super(ResultsProcessing.RESULTS_PROCESSING, projektor.database.generated.tables.pojos.ResultsProcessing.class);
    }

    /**
     * Create a new ResultsProcessingDao with an attached configuration
     */
    public ResultsProcessingDao(Configuration configuration) {
        super(ResultsProcessing.RESULTS_PROCESSING, projektor.database.generated.tables.pojos.ResultsProcessing.class, configuration);
    }

    @Override
    public String getId(projektor.database.generated.tables.pojos.ResultsProcessing object) {
        return object.getPublicId();
    }

    /**
     * Fetch records that have <code>public_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsProcessing> fetchRangeOfPublicId(String lowerInclusive, String upperInclusive) {
        return fetchRange(ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>public_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsProcessing> fetchByPublicId(String... values) {
        return fetch(ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID, values);
    }

    /**
     * Fetch a unique record that has <code>public_id = value</code>
     */
    public projektor.database.generated.tables.pojos.ResultsProcessing fetchOneByPublicId(String value) {
        return fetchOne(ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID, value);
    }

    /**
     * Fetch a unique record that has <code>public_id = value</code>
     */
    public Optional<projektor.database.generated.tables.pojos.ResultsProcessing> fetchOptionalByPublicId(String value) {
        return fetchOptional(ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID, value);
    }

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsProcessing> fetchRangeOfStatus(String lowerInclusive, String upperInclusive) {
        return fetchRange(ResultsProcessing.RESULTS_PROCESSING.STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsProcessing> fetchByStatus(String... values) {
        return fetch(ResultsProcessing.RESULTS_PROCESSING.STATUS, values);
    }

    /**
     * Fetch records that have <code>error_message BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsProcessing> fetchRangeOfErrorMessage(String lowerInclusive, String upperInclusive) {
        return fetchRange(ResultsProcessing.RESULTS_PROCESSING.ERROR_MESSAGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>error_message IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsProcessing> fetchByErrorMessage(String... values) {
        return fetch(ResultsProcessing.RESULTS_PROCESSING.ERROR_MESSAGE, values);
    }

    /**
     * Fetch records that have <code>created_timestamp BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsProcessing> fetchRangeOfCreatedTimestamp(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ResultsProcessing.RESULTS_PROCESSING.CREATED_TIMESTAMP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_timestamp IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ResultsProcessing> fetchByCreatedTimestamp(LocalDateTime... values) {
        return fetch(ResultsProcessing.RESULTS_PROCESSING.CREATED_TIMESTAMP, values);
    }
}
