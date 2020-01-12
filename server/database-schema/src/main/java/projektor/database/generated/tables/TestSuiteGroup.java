/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import projektor.database.generated.Indexes;
import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.TestSuiteGroupRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestSuiteGroup extends TableImpl<TestSuiteGroupRecord> {

    private static final long serialVersionUID = 1728755892;

    /**
     * The reference instance of <code>public.test_suite_group</code>
     */
    public static final TestSuiteGroup TEST_SUITE_GROUP = new TestSuiteGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestSuiteGroupRecord> getRecordType() {
        return TestSuiteGroupRecord.class;
    }

    /**
     * The column <code>public.test_suite_group.id</code>.
     */
    public final TableField<TestSuiteGroupRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_suite_group_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_suite_group.test_run_id</code>.
     */
    public final TableField<TestSuiteGroupRecord, Long> TEST_RUN_ID = createField("test_run_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.test_suite_group.group_name</code>.
     */
    public final TableField<TestSuiteGroupRecord, String> GROUP_NAME = createField("group_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.test_suite_group.group_label</code>.
     */
    public final TableField<TestSuiteGroupRecord, String> GROUP_LABEL = createField("group_label", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.test_suite_group</code> table reference
     */
    public TestSuiteGroup() {
        this(DSL.name("test_suite_group"), null);
    }

    /**
     * Create an aliased <code>public.test_suite_group</code> table reference
     */
    public TestSuiteGroup(String alias) {
        this(DSL.name(alias), TEST_SUITE_GROUP);
    }

    /**
     * Create an aliased <code>public.test_suite_group</code> table reference
     */
    public TestSuiteGroup(Name alias) {
        this(alias, TEST_SUITE_GROUP);
    }

    private TestSuiteGroup(Name alias, Table<TestSuiteGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestSuiteGroup(Name alias, Table<TestSuiteGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TestSuiteGroup(Table<O> child, ForeignKey<O, TestSuiteGroupRecord> key) {
        super(child, key, TEST_SUITE_GROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEST_SUITE_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestSuiteGroupRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_SUITE_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestSuiteGroupRecord> getPrimaryKey() {
        return Keys.TEST_SUITE_GROUP_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestSuiteGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<TestSuiteGroupRecord>>asList(Keys.TEST_SUITE_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TestSuiteGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TestSuiteGroupRecord, ?>>asList(Keys.TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY);
    }

    public TestRun testRun() {
        return new TestRun(this, Keys.TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestSuiteGroup as(String alias) {
        return new TestSuiteGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestSuiteGroup as(Name alias) {
        return new TestSuiteGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestSuiteGroup rename(String name) {
        return new TestSuiteGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TestSuiteGroup rename(Name name) {
        return new TestSuiteGroup(name, null);
    }
}
