package util;
import java.sql.*;import java.util.*;import java.io.*;
public class DBUtil {
    private static Properties props = new Properties();
    static { try(InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("db.properties")){ if(in!=null) props.load(in); Class.forName(props.getProperty("driver","com.mysql.cj.jdbc.Driver")); } catch(Exception e){ System.err.println("DB init warning: "+e.getMessage()); } }
    public static Connection getConnection() throws SQLException { return DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password")); }
}
