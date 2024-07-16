/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novisualbd;


import java.sql.Connection;
import java.sql.SQLException;
import java.io.Serializable;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ederd
 */
public class NoVisualBD implements Serializable{
    private String ip;
    private String puerto;
    private String bd;
    private String user;
    private String password;
    private Connection connection;
    public NoVisualBD(){
        
    }
    // Constructor
    public NoVisualBD(String ip, String puerto, String bd, String user, String password) {
        this.ip = ip;
        this.puerto = puerto;
        this.bd = bd;
        this.user = user;
        this.password = password;
    }

    // Getters y Setters
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    }

    // Método para conectar a la base de datos
    public void connect() {
        try {
            connection = DriverManager.getConnection(getUrl(), user, password);
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos!");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos:");
            e.printStackTrace();
        }
    }

    // Método para desconectar de la base de datos
    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
        // Método para imprimir los datos de una tabla
    public void printTableData(String tableName) {
        if (connection == null) {
            System.err.println("No hay conexión a la base de datos.");
            return;
        }

        String query = "SELECT * FROM " + tableName;
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            int columnCount = rs.getMetaData().getColumnCount();
            
            // Imprimir los nombres de las columnas
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getMetaData().getColumnName(i) + "\t");
            }
            System.out.println();

            // Imprimir los datos de las filas
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la conexión
    public Connection getConnection() {
        return connection;
    }
}
