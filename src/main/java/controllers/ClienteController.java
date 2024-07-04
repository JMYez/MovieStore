
package controllers;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import models.Cliente;

public class ClienteController 
{
    ArrayList<Cliente> clien;      

    public ClienteController(){
        clien = new ArrayList<>();
    }
    public void agregarClientes(JTable tblClie,int dni, String nom, String ape, String dir, String tel, String corr){
        Cliente cli = new Cliente(dni, nom, ape, dir, tel, corr);
        clien.add(cli);
        DefaultTableModel model = (DefaultTableModel) tblClie.getModel();
        model.addRow(new Object[]{dni, nom, ape, dir, tel, corr});
        JOptionPane.showMessageDialog(null, "Cliente añadido correctamente");
    }
    
    public void actualizarCliente(JTable tblClie, JTextField txtDni, JTextField txtNom, JTextField txtApe,
                              JTextField txtDirec, JTextField txtTelef, JTextField txtCorreo) throws Exception{
        try {
        int dni = Integer.parseInt(txtDni.getText());
        String nom = txtNom.getText();
        String ape = txtApe.getText();
        String dir = txtDirec.getText();
        String tel = txtTelef.getText();
        String corr = txtCorreo.getText();

        // Verificar si existe un cliente con el DNI
        Cliente cli = consultar(dni);
        if (cli == null) {
            throw new Exception("Cliente no encontrado con el DNI: " + dni);
        }

        // Actualizar la información del cliente en la lista
        cli.setNombre(nom);
        cli.setApellidos(ape);
        cli.setDireccion(dir);
        cli.setTelefono(tel);
        cli.setCorreo(corr);
        

        // Actualizar la tabla
        DefaultTableModel model = (DefaultTableModel) tblClie.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            if (Integer.parseInt(model.getValueAt(i, 0).toString()) == dni) {
                model.setValueAt(nom, i, 1);
                model.setValueAt(ape, i, 2);
                model.setValueAt(dir, i, 3);
                model.setValueAt(tel, i, 4);
                model.setValueAt(corr, i, 5);
                txtDni.setEnabled(true);
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Datos del cliente actualizados correctamente");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "DNI debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void eliminarCliente(JTable tblClie){
        int elim = tblClie.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblClie.getModel();
        if(elim >= 0){
            clien.remove(elim);
            model.removeRow(elim);

            JOptionPane.showMessageDialog(null,"Cliente eliminado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona un dato para eliminar" );
        }
    }
    
    public Cliente consultar(int dni){
        for (Cliente clie : clien) {
            if (clie.getDni() == dni) {
                return clie;
            }
        }
        return null;
    }
    
    public void consultarCliente(JTable tblClie, JTextField txtDni, JTextField txtNom, JTextField txtApe,
            JTextField txtDirec, JTextField txtTelef, JTextField txtCorreo){
        try {
            int dni = Integer.parseInt(txtDni.getText());
            Cliente clie = consultar(dni);
            if (clie != null) {
                txtNom.setText(clie.getNombre());
                txtApe.setText(clie.getApellidos());
                txtDirec.setText(clie.getDireccion());
                txtTelef.setText(clie.getTelefono());
                txtCorreo.setText(clie.getCorreo());
                
                txtDni.setEnabled(false);
           
            } else {
                JOptionPane.showMessageDialog(null, "Cliente " + dni + " No existe");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "DNI debe ser un número entero");
        }
    }
}
            
