package OrganisationRelated;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static DBConnection db;
	Connection connection = null;

    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "";
           
            this.connection = DriverManager.getConnection(url, "", "");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static DBConnection getDB() {
        if (db == null) {
        	db = new DBConnection();
        }
        return db;
    }

    public Connection getConnection() {
        return this.connection;
    }
}
