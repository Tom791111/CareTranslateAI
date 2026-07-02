package dao.impl; import dao.LostReportDao; import model.LostReport; import util.DBUtil; import java.sql.*; import java.util.*;
public class LostReportDaoImpl implements LostReportDao{ private static final List<LostReport> memory=new ArrayList<>();
 public List<LostReport> findAll(){return memory;} public void create(LostReport r){try(Connection c=DBUtil.getConnection();PreparedStatement ps=c.prepareStatement("insert into lost_reports(name,location,last_time,police_station,phone,status) values(?,?,?,?,?,?)")){ps.setString(1,r.getName());ps.setString(2,r.getLocation());ps.setString(3,r.getTime());ps.setString(4,r.getPoliceStation());ps.setString(5,r.getPhone());ps.setString(6,r.getStatus());ps.executeUpdate();}catch(Exception e){memory.add(r);}}
}
