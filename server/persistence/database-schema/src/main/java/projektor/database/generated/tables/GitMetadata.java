/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import projektor.database.generated.Indexes;
import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.GitMetadataRecord;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GitMetadata extends TableImpl<GitMetadataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.git_metadata</code>
     */
    public static final GitMetadata GIT_METADATA = new GitMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GitMetadataRecord> getRecordType() {
        return GitMetadataRecord.class;
    }

    /**
     * The column <code>public.git_metadata.id</code>.
     */
    public final TableField<GitMetadataRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.git_metadata.test_run_id</code>.
     */
    public final TableField<GitMetadataRecord, Long> TEST_RUN_ID = createField(DSL.name("test_run_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.git_metadata.repo_name</code>.
     */
    public final TableField<GitMetadataRecord, String> REPO_NAME = createField(DSL.name("repo_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.git_metadata.is_main_branch</code>.
     */
    public final TableField<GitMetadataRecord, Boolean> IS_MAIN_BRANCH = createField(DSL.name("is_main_branch"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.git_metadata.branch_name</code>.
     */
    public final TableField<GitMetadataRecord, String> BRANCH_NAME = createField(DSL.name("branch_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.git_metadata.org_name</code>.
     */
    public final TableField<GitMetadataRecord, String> ORG_NAME = createField(DSL.name("org_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.git_metadata.project_name</code>.
     */
    public final TableField<GitMetadataRecord, String> PROJECT_NAME = createField(DSL.name("project_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.git_metadata.pull_request_number</code>.
     */
    public final TableField<GitMetadataRecord, Integer> PULL_REQUEST_NUMBER = createField(DSL.name("pull_request_number"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.git_metadata.commit_sha</code>.
     */
    public final TableField<GitMetadataRecord, String> COMMIT_SHA = createField(DSL.name("commit_sha"), SQLDataType.CLOB, this, "");

    private GitMetadata(Name alias, Table<GitMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private GitMetadata(Name alias, Table<GitMetadataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.git_metadata</code> table reference
     */
    public GitMetadata(String alias) {
        this(DSL.name(alias), GIT_METADATA);
    }

    /**
     * Create an aliased <code>public.git_metadata</code> table reference
     */
    public GitMetadata(Name alias) {
        this(alias, GIT_METADATA);
    }

    /**
     * Create a <code>public.git_metadata</code> table reference
     */
    public GitMetadata() {
        this(DSL.name("git_metadata"), null);
    }

    public <O extends Record> GitMetadata(Table<O> child, ForeignKey<O, GitMetadataRecord> key) {
        super(child, key, GIT_METADATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.GIT_METADATA_IS_MAIN_BRANCH_IDX, Indexes.GIT_METADATA_PROJECT_NAME_IDX, Indexes.GIT_METADATA_REPO_NAME_IDX, Indexes.GIT_METADATA_TEST_RUN_ID_IDX);
    }

    @Override
    public Identity<GitMetadataRecord, Long> getIdentity() {
        return (Identity<GitMetadataRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<GitMetadataRecord> getPrimaryKey() {
        return Keys.GIT_METADATA_PKEY;
    }

    @Override
    public List<ForeignKey<GitMetadataRecord, ?>> getReferences() {
        return Arrays.asList(Keys.GIT_METADATA__GIT_METADATA_TEST_RUN_ID_FKEY);
    }

    private transient TestRun _testRun;

    /**
     * Get the implicit join path to the <code>public.test_run</code> table.
     */
    public TestRun testRun() {
        if (_testRun == null)
            _testRun = new TestRun(this, Keys.GIT_METADATA__GIT_METADATA_TEST_RUN_ID_FKEY);

        return _testRun;
    }

    @Override
    public GitMetadata as(String alias) {
        return new GitMetadata(DSL.name(alias), this);
    }

    @Override
    public GitMetadata as(Name alias) {
        return new GitMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GitMetadata rename(String name) {
        return new GitMetadata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GitMetadata rename(Name name) {
        return new GitMetadata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, Boolean, String, String, String, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
