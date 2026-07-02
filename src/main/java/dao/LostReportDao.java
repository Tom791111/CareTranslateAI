package dao; import java.util.*; import model.LostReport;
public interface LostReportDao { List<LostReport> findAll(); void create(LostReport r); }
