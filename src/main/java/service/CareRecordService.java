package service; import java.util.*; import model.CareRecord;
public interface CareRecordService { List<CareRecord> list(); void add(CareRecord r); void delete(int id); }
