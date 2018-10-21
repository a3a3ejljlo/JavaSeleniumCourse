package homework.xml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection conn = null;
        String dbName = "database1";
        String serverip="192.168.100.100";
        String serverport="1433";
        String url = "jdbc:sqlserver://"+serverip+"\\SQLEXPRESS:"+serverport+";databaseName="+dbName+"";
        Statement stmt = null;
        ResultSet result = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String databaseUserName = "admin";
        String databasePassword = "root";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
            stmt = conn.createStatement();
            result = null;
            String pa,us;
            result = stmt.executeQuery("select * from table1 ");

            while (result.next()) {
                us=result.getString("uname");
                pa = result.getString("pass");
                System.out.println(us+"  "+pa);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}