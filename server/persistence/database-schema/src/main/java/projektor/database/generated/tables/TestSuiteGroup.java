/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.TestSuiteGroupRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestSuiteGroup extends TableImpl<TestSuiteGroupRecord> {

    private static final long serialVersionUID = 1L;

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
    public final TableField<TestSuiteGroupRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.test_suite_group.test_run_id</code>.
     */
    public final TableField<TestSuiteGroupRecord, Long> TEST_RUN_ID = createField(DSL.name("test_run_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.test_suite_group.group_name</code>.
     */
    public final TableField<TestSuiteGroupRecord, String> GROUP_NAME = createField(DSL.name("group_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.test_suite_group.group_label</code>.
     */
    public final TableField<TestSuiteGroupRecord, String> GROUP_LABEL = createField(DSL.name("group_label"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.test_suite_group.directory</code>.
     */
    public final TableField<TestSuiteGroupRecord, String> DIRECTORY = createField(DSL.name("directory"), SQLDataType.CLOB, this, "");

    private TestSuiteGroup(Name alias, Table<TestSuiteGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestSuiteGroup(Name alias, Table<TestSuiteGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
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

    /**
     * Create a <code>public.test_suite_group</code> table reference
     */
    public TestSuiteGroup() {
        this(DSL.name("test_suite_group"), null);
    }

    public <O extends Record> TestSuiteGroup(Table<O> child, ForeignKey<O, TestSuiteGroupRecord> key) {
        super(child, key, TEST_SUITE_GROUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<TestSuiteGroupRecord, Long> getIdentity() {
        return (Identity<TestSuiteGroupRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TestSuiteGroupRecord> getPrimaryKey() {
        return Keys.TEST_SUITE_GROUP_PKEY;
    }

    @Override
    public List<ForeignKey<TestSuiteGroupRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY);
    }

    private transient TestRun _testRun;

    /**
     * Get the implicit join path to the <code>public.test_run</code> table.
     */
    public TestRun testRun() {
        if (_testRun == null)
            _testRun = new TestRun(this, Keys.TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY);

        return _testRun;
    }

    @Override
    public TestSuiteGroup as(String alias) {
        return new TestSuiteGroup(DSL.name(alias), this);
    }

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

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
