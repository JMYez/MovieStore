
package controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.Pelicula;

public class PeliculaController {
    ArrayList<Pelicula> peli;
    
    public PeliculaController() {
        peli = new ArrayList<>();
    }
    
    public void agregarPelicula(JTable tblPeli, String cod, String tit, String gen,
        String sinp, LocalDate fechEs, LocalDate fechAgre, int stock){
        Pelicula pel = new Pelicula(cod, tit, gen, sinp, fechEs, fechAgre, stock);
        peli.add(pel);
        DefaultTableModel model = (DefaultTableModel) tblPeli.getModel();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedFechaEstreno = fechEs.format(formatter);
        String formattedFechaAgregacion = fechAgre.format(formatter);
        model.addRow(new Object[]{cod, tit, gen, sinp, formattedFechaEstreno, formattedFechaAgregacion, stock});
        JOptionPane.showMessageDialog(null,"Pelicula añadida correctamente");
    }
    
    public void actualizarPelicula(JTable tblPeli, JTextField txtCodP, JTextField txtPeli, JTextField txtGen,
        JTextField txtSinp, JTextField txtFechE, JTextField txtFechA, JTextField txtStock)throws Exception{
        try{
            String cod = txtCodP.getText();
            String tit = txtPeli.getText();
            String gen = txtGen.getText();
            String fchEs = txtFechE.getText();
            String sinp = txtSinp.getText();
            String fchAgre = txtFechA.getText();
            String stk = txtStock.getText();
            int stock = Integer.parseInt(stk);
            
            Pelicula pel = consultar(cod);
            if(pel == null){
                throw new Exception("Pelicula no encontrada con el el codido: "+cod);
            }
            pel.setTitulo(tit);
            pel.setGenero(gen);
            pel.setSinopsis(sinp);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechEs = LocalDate.parse(fchEs, formatter);
            LocalDate fechAgre = LocalDate.parse(fchAgre, formatter);
            pel.setFechaEstreno(fechEs);
            pel.setFechaAgregacion(fechAgre);
            
            DefaultTableModel model = (DefaultTableModel) tblPeli.getModel();
            int rowCount = model.getRowCount();
            for(int i=0; i < rowCount; i++){
                String codigo = model.getValueAt(i, 0).toString();
                if(codigo.equals(cod)){
                    
                    model.setValueAt(tit, i, 1);
                    model.setValueAt(gen, i, 2);
                    model.setValueAt(sinp, i, 3);
                    model.setValueAt(fechEs.format(formatter), i, 4);
                    model.setValueAt(fechAgre.format(formatter), i, 5);
                    model.setValueAt(stock, i, 6);
                    txtCodP.setEnabled(true);
                }
            }
            JOptionPane.showMessageDialog(null, "Datos de la pelicula actualizados correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verifique todos los campos");
        }
    }
    
    public void eliminarPelicula(JTable tblPeli){
        int elim = tblPeli.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPeli.getModel();
        if(elim >=0){
            peli.remove(elim);
            model.removeRow(elim);
            
            JOptionPane.showMessageDialog(null, "Pelicula eliminada corectamente");
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona un dato para eliminar");
        }
    }
    
    public Pelicula consultar(String cod){
        for (Pelicula pel : peli) {
            if (pel.getCodigo().equals(cod)) {
                return pel;
            }
        }
        return null;
    }
     
     public void consultarPelicula( JTextField txtCodP, JTextField txtPeli, JTextField txtGen,
            JTextField txtSinp, JTextField txtFechE, JTextField txtFechA, JTextField txtStock){
         try{
             String codi = txtCodP.getText();
             Pelicula pel = consultar(codi);
             
             if(pel != null){
                 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String formattedFechaEstreno = pel.getFechaEstreno().format(formatter);
                String formattedFechaAgregacion = pel.getFechaAgregacion().format(formatter);
                 txtPeli.setText(pel.getTitulo());
                 txtGen.setText(pel.getGenero());
                 txtSinp.setText(pel.getSinopsis());
                 txtFechE.setText(formattedFechaEstreno);
                 txtFechA.setText(formattedFechaAgregacion);
                 txtStock.setText(pel.getStock() + "");
                 txtCodP.setEnabled(false);
             }else{
                 JOptionPane.showMessageDialog(null, "Pelicula " + codi + " No existe");
             }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
     }
}
