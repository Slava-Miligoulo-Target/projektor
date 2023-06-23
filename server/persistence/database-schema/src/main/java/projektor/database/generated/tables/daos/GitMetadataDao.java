/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import projektor.database.generated.tables.GitMetadata;
import projektor.database.generated.tables.records.GitMetadataRecord;

import java.util.List;
import java.util.Optional;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GitMetadataDao extends DAOImpl<GitMetadataRecord, projektor.database.generated.tables.pojos.GitMetadata, Long> {

    /**
     * Create a new GitMetadataDao without any configuration
     */
    public GitMetadataDao() {
        super(GitMetadata.GIT_METADATA, projektor.database.generated.tables.pojos.GitMetadata.class);
    }

    /**
     * Create a new GitMetadataDao with an attached configuration
     */
    public GitMetadataDao(Configuration configuration) {
        super(GitMetadata.GIT_METADATA, projektor.database.generated.tables.pojos.GitMetadata.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.GitMetadata object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchById(Long... values) {
        return fetch(GitMetadata.GIT_METADATA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.GitMetadata fetchOneById(Long value) {
        return fetchOne(GitMetadata.GIT_METADATA.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<projektor.database.generated.tables.pojos.GitMetadata> fetchOptionalById(Long value) {
        return fetchOptional(GitMetadata.GIT_METADATA.ID, value);
    }

    /**
     * Fetch records that have <code>test_run_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfTestRunId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.TEST_RUN_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_run_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchByTestRunId(Long... values) {
        return fetch(GitMetadata.GIT_METADATA.TEST_RUN_ID, values);
    }

    /**
     * Fetch records that have <code>repo_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfRepoName(String lowerInclusive, String upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.REPO_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>repo_name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchByRepoName(String... values) {
        return fetch(GitMetadata.GIT_METADATA.REPO_NAME, values);
    }

    /**
     * Fetch records that have <code>is_main_branch BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfIsMainBranch(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.IS_MAIN_BRANCH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_main_branch IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchByIsMainBranch(Boolean... values) {
        return fetch(GitMetadata.GIT_METADATA.IS_MAIN_BRANCH, values);
    }

    /**
     * Fetch records that have <code>branch_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfBranchName(String lowerInclusive, String upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.BRANCH_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>branch_name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchByBranchName(String... values) {
        return fetch(GitMetadata.GIT_METADATA.BRANCH_NAME, values);
    }

    /**
     * Fetch records that have <code>org_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfOrgName(String lowerInclusive, String upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.ORG_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>org_name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchByOrgName(String... values) {
        return fetch(GitMetadata.GIT_METADATA.ORG_NAME, values);
    }

    /**
     * Fetch records that have <code>project_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfProjectName(String lowerInclusive, String upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.PROJECT_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>project_name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchByProjectName(String... values) {
        return fetch(GitMetadata.GIT_METADATA.PROJECT_NAME, values);
    }

    /**
     * Fetch records that have <code>pull_request_number BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfPullRequestNumber(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.PULL_REQUEST_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>pull_request_number IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchByPullRequestNumber(Integer... values) {
        return fetch(GitMetadata.GIT_METADATA.PULL_REQUEST_NUMBER, values);
    }

    /**
     * Fetch records that have <code>commit_sha BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchRangeOfCommitSha(String lowerInclusive, String upperInclusive) {
        return fetchRange(GitMetadata.GIT_METADATA.COMMIT_SHA, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>commit_sha IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitMetadata> fetchByCommitSha(String... values) {
        return fetch(GitMetadata.GIT_METADATA.COMMIT_SHA, values);
    }
}
