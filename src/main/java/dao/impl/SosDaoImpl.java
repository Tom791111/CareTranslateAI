package dao.impl; import dao.SosDao; import model.SosRecord; import util.DBUtil; import java.sql.*; import java.util.*;
public class SosDaoImpl implements SosDao{ private static final List<SosRecord> memory=new ArrayList<>();
 public List<SosRecord> findAll(){return memory;} public void create(SosRecord r){try(Connection c=DBUtil.getConnection();PreparedStatement ps=c.prepareStatement("insert into sos_records(type,phone,note) values(?,?,?)")){ps.setString(1,r.getType());ps.setString(2,r.getPhone());ps.setString(3,r.getNote());ps.executeUpdate();}catch(Exception e){memory.add(r);}}
}
