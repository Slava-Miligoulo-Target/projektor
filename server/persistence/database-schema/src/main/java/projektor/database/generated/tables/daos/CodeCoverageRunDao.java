/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import projektor.database.generated.tables.CodeCoverageRun;
import projektor.database.generated.tables.records.CodeCoverageRunRecord;

import java.util.List;
import java.util.Optional;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeCoverageRunDao extends DAOImpl<CodeCoverageRunRecord, projektor.database.generated.tables.pojos.CodeCoverageRun, Long> {

    /**
     * Create a new CodeCoverageRunDao without any configuration
     */
    public CodeCoverageRunDao() {
        super(CodeCoverageRun.CODE_COVERAGE_RUN, projektor.database.generated.tables.pojos.CodeCoverageRun.class);
    }

    /**
     * Create a new CodeCoverageRunDao with an attached configuration
     */
    public CodeCoverageRunDao(Configuration configuration) {
        super(CodeCoverageRun.CODE_COVERAGE_RUN, projektor.database.generated.tables.pojos.CodeCoverageRun.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.CodeCoverageRun object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageRun> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CodeCoverageRun.CODE_COVERAGE_RUN.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageRun> fetchById(Long... values) {
        return fetch(CodeCoverageRun.CODE_COVERAGE_RUN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.CodeCoverageRun fetchOneById(Long value) {
        return fetchOne(CodeCoverageRun.CODE_COVERAGE_RUN.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<projektor.database.generated.tables.pojos.CodeCoverageRun> fetchOptionalById(Long value) {
        return fetchOptional(CodeCoverageRun.CODE_COVERAGE_RUN.ID, value);
    }

    /**
     * Fetch records that have <code>test_run_public_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageRun> fetchRangeOfTestRunPublicId(String lowerInclusive, String upperInclusive) {
        return fetchRange(CodeCoverageRun.CODE_COVERAGE_RUN.TEST_RUN_PUBLIC_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_run_public_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.CodeCoverageRun> fetchByTestRunPublicId(String... values) {
        return fetch(CodeCoverageRun.CODE_COVERAGE_RUN.TEST_RUN_PUBLIC_ID, values);
    }
}
