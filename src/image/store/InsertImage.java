package image.store;

import java.io.*;
import java.sql.*;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InsertImage {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sbtest";
        String user = "root";
        String password = "sekhar";

        String filePath = "C:/img/firebase.png";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO imgtable (photo) values (LOAD_FILE(?))";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, filePath);

            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("A contact was inserted with photo image.");
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }






