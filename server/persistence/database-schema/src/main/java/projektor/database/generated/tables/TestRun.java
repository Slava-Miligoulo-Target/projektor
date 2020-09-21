/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import projektor.database.generated.Indexes;
import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.TestRunRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRun extends TableImpl<TestRunRecord> {

    private static final long serialVersionUID = 178032035;

    /**
     * The reference instance of <code>public.test_run</code>
     */
    public static final TestRun TEST_RUN = new TestRun();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestRunRecord> getRecordType() {
        return TestRunRecord.class;
    }

    /**
     * The column <code>public.test_run.id</code>.
     */
    public final TableField<TestRunRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_run_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_run.public_id</code>.
     */
    public final TableField<TestRunRecord, String> PUBLIC_ID = createField(DSL.name("public_id"), org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>public.test_run.total_test_count</code>.
     */
    public final TableField<TestRunRecord, Integer> TOTAL_TEST_COUNT = createField(DSL.name("total_test_count"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.test_run.total_passing_count</code>.
     */
    public final TableField<TestRunRecord, Integer> TOTAL_PASSING_COUNT = createField(DSL.name("total_passing_count"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.test_run.total_skipped_count</code>.
     */
    public final TableField<TestRunRecord, Integer> TOTAL_SKIPPED_COUNT = createField(DSL.name("total_skipped_count"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.test_run.total_failure_count</code>.
     */
    public final TableField<TestRunRecord, Integer> TOTAL_FAILURE_COUNT = createField(DSL.name("total_failure_count"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.test_run.passed</code>.
     */
    public final TableField<TestRunRecord, Boolean> PASSED = createField(DSL.name("passed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.test_run.cumulative_duration</code>.
     */
    public final TableField<TestRunRecord, BigDecimal> CUMULATIVE_DURATION = createField(DSL.name("cumulative_duration"), org.jooq.impl.SQLDataType.NUMERIC(12, 3).nullable(false), this, "");

    /**
     * The column <code>public.test_run.average_duration</code>.
     */
    public final TableField<TestRunRecord, BigDecimal> AVERAGE_DURATION = createField(DSL.name("average_duration"), org.jooq.impl.SQLDataType.NUMERIC(12, 3).nullable(false), this, "");

    /**
     * The column <code>public.test_run.slowest_test_case_duration</code>.
     */
    public final TableField<TestRunRecord, BigDecimal> SLOWEST_TEST_CASE_DURATION = createField(DSL.name("slowest_test_case_duration"), org.jooq.impl.SQLDataType.NUMERIC(12, 3).nullable(false), this, "");

    /**
     * The column <code>public.test_run.created_timestamp</code>.
     */
    public final TableField<TestRunRecord, Timestamp> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.test_run.wall_clock_duration</code>.
     */
    public final TableField<TestRunRecord, BigDecimal> WALL_CLOCK_DURATION = createField(DSL.name("wall_clock_duration"), org.jooq.impl.SQLDataType.NUMERIC(12, 3), this, "");

    /**
     * Create a <code>public.test_run</code> table reference
     */
    public TestRun() {
        this(DSL.name("test_run"), null);
    }

    /**
     * Create an aliased <code>public.test_run</code> table reference
     */
    public TestRun(String alias) {
        this(DSL.name(alias), TEST_RUN);
    }

    /**
     * Create an aliased <code>public.test_run</code> table reference
     */
    public TestRun(Name alias) {
        this(alias, TEST_RUN);
    }

    private TestRun(Name alias, Table<TestRunRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestRun(Name alias, Table<TestRunRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TestRun(Table<O> child, ForeignKey<O, TestRunRecord> key) {
        super(child, key, TEST_RUN);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_TEST_RUN_PUBLIC_ID);
    }

    @Override
    public Identity<TestRunRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_RUN;
    }

    @Override
    public UniqueKey<TestRunRecord> getPrimaryKey() {
        return Keys.TEST_RUN_PKEY;
    }

    @Override
    public List<UniqueKey<TestRunRecord>> getKeys() {
        return Arrays.<UniqueKey<TestRunRecord>>asList(Keys.TEST_RUN_PKEY, Keys.TEST_RUN_PUBLIC_ID_KEY);
    }

    @Override
    public TestRun as(String alias) {
        return new TestRun(DSL.name(alias), this);
    }

    @Override
    public TestRun as(Name alias) {
        return new TestRun(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestRun rename(String name) {
        return new TestRun(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TestRun rename(Name name) {
        return new TestRun(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, Integer, Integer, Integer, Integer, Boolean, BigDecimal, BigDecimal, BigDecimal, Timestamp, BigDecimal> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
