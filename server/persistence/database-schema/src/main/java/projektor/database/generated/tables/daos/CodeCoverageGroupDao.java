/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import projektor.database.generated.tables.CodeCoverageGroup;
import projektor.database.generated.tables.records.CodeCoverageGroupRecord;

import java.util.List;
import java.util.Optional;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeCoverageGroupDao extends DAOImpl<CodeCoverageGroupRecord, projektor.database.generated.tables.pojos.CodeCoverageGroup, Long> {

    /**
     * Create a new CodeCoverageGroupDao without any configuration
     */
    public CodeCoverageGroupDao() {
        super(CodeCoverageGroup.CODE_COVERAGE_GROUP, projektor.database.generated.tables.pojos.CodeCoverageGroup.class);
    }

    /**
     * Create a new CodeCoverageGroupDao with an attached configuration
     */
    public CodeCoverageGroupDao(Configuration configuration) {
        super(CodeCoverageGroup.CODE_COVERAGE_GROUP, projektor.database.generated.tables.pojos.CodeCoverageGroup.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.CodeCoverageGroup object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CodeCoverageGroup.CODE_COVERAGE_GROUP.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchById(Long... values) {
        return fetch(CodeCoverageGroup.CODE_COVERAGE_GROUP.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.CodeCoverageGroup fetchOneById(Long value) {
        return fetchOne(CodeCoverageGroup.CODE_COVERAGE_GROUP.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchOptionalById(Long value) {
        return fetchOptional(CodeCoverageGroup.CODE_COVERAGE_GROUP.ID, value);
    }

    /**
     * Fetch records that have <code>code_coverage_run_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchRangeOfCodeCoverageRunId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CodeCoverageGroup.CODE_COVERAGE_GROUP.CODE_COVERAGE_RUN_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>code_coverage_run_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchByCodeCoverageRunId(Long... values) {
        return fetch(CodeCoverageGroup.CODE_COVERAGE_GROUP.CODE_COVERAGE_RUN_ID, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(CodeCoverageGroup.CODE_COVERAGE_GROUP.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchByName(String... values) {
        return fetch(CodeCoverageGroup.CODE_COVERAGE_GROUP.NAME, values);
    }

    /**
     * Fetch records that have <code>stats_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchRangeOfStatsId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CodeCoverageGroup.CODE_COVERAGE_GROUP.STATS_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stats_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageGroup> fetchByStatsId(Long... values) {
        return fetch(CodeCoverageGroup.CODE_COVERAGE_GROUP.STATS_ID, values);
    }
}
