package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {


        void createDB() {
            try {
                String url = "jdbc:mysql://localhost:3306/";
                String username = "root";
                String password = "Shreya03";
                Connection conn = DriverManager.getConnection(url, username, password);

                Statement stmt = conn.createStatement();

                String query = "Create database xyz";
                stmt.execute(query);

                System.out.println("Database Created");

                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
