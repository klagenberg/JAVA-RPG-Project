package DataSource;

import java.sql.Connection;
import java.sql.DriverManager;

//Encapsulates code to connect to DB
//hau
public class DBConnect {

    private static String id = "SYSTEM";						//Insert ORACLE id and password
    private static String pw = "wynny3ll3";

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:MAINDATABASE", id, pw);
        } catch (Exception e) {
            System.out.println("\n*** Remember to insert your Oracle ID and PW in the DBConnector class! ***\n");
            System.out.println("eror in DBConnect.getConnection()");
            System.out.println(e);
        }

        return con;
    }

    public void releaseConnection(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
