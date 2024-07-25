
package controllers;
import controllers.Conexion.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ControladorBD {
    
 public DefaultTableModel getAlquileres(String filtro, String valor) {
        DefaultTableModel model = new DefaultTableModel();
        String query = "SELECT * FROM alquileres"; // Consulta básica

        // Agregar filtro a la consulta
        if (filtro != null && valor != null && !valor.isEmpty()) {
            switch (filtro) {
                case "fecha":
                    query += " WHERE fecha = ?";
                    break;
                case "nombre":
                    query += " WHERE nombre LIKE ?";
                    break;
                case "apellido":
                    query += " WHERE apellido LIKE ?";
                    break;
                case "venta":
                    query += " WHERE venta = ?";
                    break;
                case "codigo":
                    query += " WHERE codigo = ?";
                    break;
                default:
                    break;
            }
        }

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            if (filtro != null && valor != null && !valor.isEmpty()) {
                if (filtro.equals("nombre") || filtro.equals("apellido")) {
                    stmt.setString(1, "%" + valor + "%");
                } else {
                    stmt.setString(1, valor);
                }
            }

            ResultSet rs = stmt.executeQuery();

            // Configura el modelo de la tabla
            model.addColumn("Codigo del cliente");
            model.addColumn("Nombres");
            model.addColumn("Apellidos");
            model.addColumn("DNI");
            model.addColumn("Direccion");
            model.addColumn("Telefono");

            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getString("codigo");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("apellido");
                row[3] = rs.getString("dni");
                row[4] = rs.getString("direccion");
                row[5] = rs.getString("telefono");
                model.addRow(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return model;
    }
}
