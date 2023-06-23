/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import projektor.database.generated.tables.TestSuiteGroup;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestSuiteGroupRecord extends UpdatableRecordImpl<TestSuiteGroupRecord> implements Record5<Long, Long, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.test_suite_group.id</code>.
     */
    public TestSuiteGroupRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.test_suite_group.test_run_id</code>.
     */
    public TestSuiteGroupRecord setTestRunId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.test_run_id</code>.
     */
    public Long getTestRunId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.test_suite_group.group_name</code>.
     */
    public TestSuiteGroupRecord setGroupName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.group_name</code>.
     */
    public String getGroupName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.test_suite_group.group_label</code>.
     */
    public TestSuiteGroupRecord setGroupLabel(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.group_label</code>.
     */
    public String getGroupLabel() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.test_suite_group.directory</code>.
     */
    public TestSuiteGroupRecord setDirectory(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.test_suite_group.directory</code>.
     */
    public String getDirectory() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TestSuiteGroup.TEST_SUITE_GROUP.ID;
    }

    @Override
    public Field<Long> field2() {
        return TestSuiteGroup.TEST_SUITE_GROUP.TEST_RUN_ID;
    }

    @Override
    public Field<String> field3() {
        return TestSuiteGroup.TEST_SUITE_GROUP.GROUP_NAME;
    }

    @Override
    public Field<String> field4() {
        return TestSuiteGroup.TEST_SUITE_GROUP.GROUP_LABEL;
    }

    @Override
    public Field<String> field5() {
        return TestSuiteGroup.TEST_SUITE_GROUP.DIRECTORY;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getTestRunId();
    }

    @Override
    public String component3() {
        return getGroupName();
    }

    @Override
    public String component4() {
        return getGroupLabel();
    }

    @Override
    public String component5() {
        return getDirectory();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getTestRunId();
    }

    @Override
    public String value3() {
        return getGroupName();
    }

    @Override
    public String value4() {
        return getGroupLabel();
    }

    @Override
    public String value5() {
        return getDirectory();
    }

    @Override
    public TestSuiteGroupRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TestSuiteGroupRecord value2(Long value) {
        setTestRunId(value);
        return this;
    }

    @Override
    public TestSuiteGroupRecord value3(String value) {
        setGroupName(value);
        return this;
    }

    @Override
    public TestSuiteGroupRecord value4(String value) {
        setGroupLabel(value);
        return this;
    }

    @Override
    public TestSuiteGroupRecord value5(String value) {
        setDirectory(value);
        return this;
    }

    @Override
    public TestSuiteGroupRecord values(Long value1, Long value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestSuiteGroupRecord
     */
    public TestSuiteGroupRecord() {
        super(TestSuiteGroup.TEST_SUITE_GROUP);
    }

    /**
     * Create a detached, initialised TestSuiteGroupRecord
     */
    public TestSuiteGroupRecord(Long id, Long testRunId, String groupName, String groupLabel, String directory) {
        super(TestSuiteGroup.TEST_SUITE_GROUP);

        setId(id);
        setTestRunId(testRunId);
        setGroupName(groupName);
        setGroupLabel(groupLabel);
        setDirectory(directory);
    }

    /**
     * Create a detached, initialised TestSuiteGroupRecord
     */
    public TestSuiteGroupRecord(projektor.database.generated.tables.pojos.TestSuiteGroup value) {
        super(TestSuiteGroup.TEST_SUITE_GROUP);

        if (value != null) {
            setId(value.getId());
            setTestRunId(value.getTestRunId());
            setGroupName(value.getGroupName());
            setGroupLabel(value.getGroupLabel());
            setDirectory(value.getDirectory());
        }
    }
}
