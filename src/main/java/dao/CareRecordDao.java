package dao; import java.util.*; import model.CareRecord;
public interface CareRecordDao { List<CareRecord> findAll(); void create(CareRecord r); void update(CareRecord r); void delete(int id); }
