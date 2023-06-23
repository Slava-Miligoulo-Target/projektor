/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import projektor.database.generated.tables.CodeCoverageFile;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeCoverageFileRecord extends UpdatableRecordImpl<CodeCoverageFileRecord> implements Record9<Long, Long, Long, Long, String, String, Integer[], Integer[], String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.code_coverage_file.id</code>.
     */
    public CodeCoverageFileRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.code_coverage_file.code_coverage_run_id</code>.
     */
    public CodeCoverageFileRecord setCodeCoverageRunId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.code_coverage_run_id</code>.
     */
    public Long getCodeCoverageRunId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.code_coverage_file.code_coverage_group_id</code>.
     */
    public CodeCoverageFileRecord setCodeCoverageGroupId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.code_coverage_group_id</code>.
     */
    public Long getCodeCoverageGroupId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.code_coverage_file.stats_id</code>.
     */
    public CodeCoverageFileRecord setStatsId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.stats_id</code>.
     */
    public Long getStatsId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.code_coverage_file.directory_name</code>.
     */
    public CodeCoverageFileRecord setDirectoryName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.directory_name</code>.
     */
    public String getDirectoryName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.code_coverage_file.file_name</code>.
     */
    public CodeCoverageFileRecord setFileName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.file_name</code>.
     */
    public String getFileName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.code_coverage_file.missed_lines</code>.
     */
    public CodeCoverageFileRecord setMissedLines(Integer[] value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.missed_lines</code>.
     */
    public Integer[] getMissedLines() {
        return (Integer[]) get(6);
    }

    /**
     * Setter for <code>public.code_coverage_file.partial_lines</code>.
     */
    public CodeCoverageFileRecord setPartialLines(Integer[] value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.partial_lines</code>.
     */
    public Integer[] getPartialLines() {
        return (Integer[]) get(7);
    }

    /**
     * Setter for <code>public.code_coverage_file.file_path</code>.
     */
    public CodeCoverageFileRecord setFilePath(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.code_coverage_file.file_path</code>.
     */
    public String getFilePath() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Long, String, String, Integer[], Integer[], String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Long, Long, String, String, Integer[], Integer[], String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.ID;
    }

    @Override
    public Field<Long> field2() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.CODE_COVERAGE_RUN_ID;
    }

    @Override
    public Field<Long> field3() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.CODE_COVERAGE_GROUP_ID;
    }

    @Override
    public Field<Long> field4() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.STATS_ID;
    }

    @Override
    public Field<String> field5() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.DIRECTORY_NAME;
    }

    @Override
    public Field<String> field6() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.FILE_NAME;
    }

    @Override
    public Field<Integer[]> field7() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.MISSED_LINES;
    }

    @Override
    public Field<Integer[]> field8() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.PARTIAL_LINES;
    }

    @Override
    public Field<String> field9() {
        return CodeCoverageFile.CODE_COVERAGE_FILE.FILE_PATH;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCodeCoverageRunId();
    }

    @Override
    public Long component3() {
        return getCodeCoverageGroupId();
    }

    @Override
    public Long component4() {
        return getStatsId();
    }

    @Override
    public String component5() {
        return getDirectoryName();
    }

    @Override
    public String component6() {
        return getFileName();
    }

    @Override
    public Integer[] component7() {
        return getMissedLines();
    }

    @Override
    public Integer[] component8() {
        return getPartialLines();
    }

    @Override
    public String component9() {
        return getFilePath();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCodeCoverageRunId();
    }

    @Override
    public Long value3() {
        return getCodeCoverageGroupId();
    }

    @Override
    public Long value4() {
        return getStatsId();
    }

    @Override
    public String value5() {
        return getDirectoryName();
    }

    @Override
    public String value6() {
        return getFileName();
    }

    @Override
    public Integer[] value7() {
        return getMissedLines();
    }

    @Override
    public Integer[] value8() {
        return getPartialLines();
    }

    @Override
    public String value9() {
        return getFilePath();
    }

    @Override
    public CodeCoverageFileRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord value2(Long value) {
        setCodeCoverageRunId(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord value3(Long value) {
        setCodeCoverageGroupId(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord value4(Long value) {
        setStatsId(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord value5(String value) {
        setDirectoryName(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord value6(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord value7(Integer[] value) {
        setMissedLines(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord value8(Integer[] value) {
        setPartialLines(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord value9(String value) {
        setFilePath(value);
        return this;
    }

    @Override
    public CodeCoverageFileRecord values(Long value1, Long value2, Long value3, Long value4, String value5, String value6, Integer[] value7, Integer[] value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CodeCoverageFileRecord
     */
    public CodeCoverageFileRecord() {
        super(CodeCoverageFile.CODE_COVERAGE_FILE);
    }

    /**
     * Create a detached, initialised CodeCoverageFileRecord
     */
    public CodeCoverageFileRecord(Long id, Long codeCoverageRunId, Long codeCoverageGroupId, Long statsId, String directoryName, String fileName, Integer[] missedLines, Integer[] partialLines, String filePath) {
        super(CodeCoverageFile.CODE_COVERAGE_FILE);

        setId(id);
        setCodeCoverageRunId(codeCoverageRunId);
        setCodeCoverageGroupId(codeCoverageGroupId);
        setStatsId(statsId);
        setDirectoryName(directoryName);
        setFileName(fileName);
        setMissedLines(missedLines);
        setPartialLines(partialLines);
        setFilePath(filePath);
    }

    /**
     * Create a detached, initialised CodeCoverageFileRecord
     */
    public CodeCoverageFileRecord(projektor.database.generated.tables.pojos.CodeCoverageFile value) {
        super(CodeCoverageFile.CODE_COVERAGE_FILE);

        if (value != null) {
            setId(value.getId());
            setCodeCoverageRunId(value.getCodeCoverageRunId());
            setCodeCoverageGroupId(value.getCodeCoverageGroupId());
            setStatsId(value.getStatsId());
            setDirectoryName(value.getDirectoryName());
            setFileName(value.getFileName());
            setMissedLines(value.getMissedLines());
            setPartialLines(value.getPartialLines());
            setFilePath(value.getFilePath());
        }
    }
}
