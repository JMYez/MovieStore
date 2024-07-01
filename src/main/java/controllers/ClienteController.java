
package controllers;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.Cliente;

public class ClienteController 
{
    ArrayList<Cliente> clien;      

    public ClienteController(){
        clien = new ArrayList<>();
    }
    public void agregarClientes(int dni, String nom, String ape, String dir, String tel, String corr){
        // Agregar el cliente a la lista
        Cliente cli = new Cliente(dni, nom, ape, dir, tel, corr);
        clien.add(cli);
        JOptionPane.showMessageDialog(null, "Cliente añadido correctamente");
    }
    
    public void actualizarCliente(JTable tblClie,int dni, String nom, String ape, String dir, String tel, String corr) throws Exception{
        try {
            // Verificar que una fila esté seleccionada
            int selectedRow = tblClie.getSelectedRow();
            if (selectedRow == -1) {
            throw new Exception("No hay ninguna fila seleccionada para actualizar");
            }
            Cliente cli = new Cliente(dni, nom, ape, dir, tel, corr);
            clien.set(selectedRow, cli);

            // Actualizar los datos en la tabla
            DefaultTableModel model = (DefaultTableModel) tblClie.getModel();
            model.setValueAt(dni, selectedRow, 0);
            model.setValueAt(nom, selectedRow, 1);
            model.setValueAt(ape, selectedRow, 2);
            model.setValueAt(dir, selectedRow, 3);
            model.setValueAt(tel, selectedRow, 4);
            model.setValueAt(corr, selectedRow, 5);
            
            JOptionPane.showMessageDialog(null, "Datos del cliente actualizados correctamente");
            } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "DNI debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
          
}
            
