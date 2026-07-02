package service; import java.util.*; import model.*;
public interface EmergencyService { void addSos(SosRecord s); void addLost(LostReport r); List<LostReport> lostReports(); }
