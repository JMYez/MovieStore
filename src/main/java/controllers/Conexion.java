/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author CUTY
 */  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
  
public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost/proyms";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    // Obtiene una conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new SQLException("Driver not found");
            }
        }
        return connection;
    }
}
}
