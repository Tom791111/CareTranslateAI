package dao; import java.util.*; import model.SosRecord;
public interface SosDao { List<SosRecord> findAll(); void create(SosRecord r); }
