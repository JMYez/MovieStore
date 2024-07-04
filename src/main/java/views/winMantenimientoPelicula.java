
package views;

import controllers.PeliculaController;
import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controllers.AccessFilePelicula;
import java.util.Vector;

public class winMantenimientoPelicula extends javax.swing.JPanel {
    DefaultTableModel model;
    PeliculaController peliCont;
    AccessFilePelicula file;
    
    public winMantenimientoPelicula() {
        initComponents();
        InitStyles();
        file = new AccessFilePelicula();
        peliCont = new PeliculaController();
        model = new DefaultTableModel(new String[]{"Código", "Título", "Género","Sinopsis ", "Fecha E","Fecha A", "Stock"}, 0);
        tblPeli.setModel(model);
        
        tblPeli.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = tblPeli.getSelectedRow();
                if (selectedRow != -1) {
                // Obtener los valores de la fila seleccionada y ponerlos en los JTextField
                txtCodP.setText(model.getValueAt(selectedRow, 0).toString());
                txtPeli.setText(model.getValueAt(selectedRow, 1).toString());
                txtGen.setText(model.getValueAt(selectedRow, 2).toString());
                txtSinp.setText(model.getValueAt(selectedRow, 3).toString());
                txtFechE.setText(model.getValueAt(selectedRow, 4).toString());
                txtFechA.setText(model.getValueAt(selectedRow, 5).toString());
                txtStock.setText(model.getValueAt(selectedRow, 6).toString());
                }
            }
        }
      });       
    }
    
    private void InitStyles() {
        //labelInput.setForeground(Color.black);
        catalogoSearch.putClientProperty("JTextField.placeholderText", "Ingrese la película a buscar...");
        txtCodP.putClientProperty("JTextField.placeholderText", "Codigo de pelicula");
        txtPeli.putClientProperty("JTextField.placeholderText", "Titulo");
        txtGen.putClientProperty("JTextField.placeholderText", "Genero");
        txtSinp.putClientProperty("JTextField.placeholderText", "Sinópsis");
        txtFechE.putClientProperty("JTextField.placeholderText", "Fecha Estreno");
        txtFechA.putClientProperty("JTextField.placeholderText", "Fecha Agregada");
        txtStock.putClientProperty("JTextField.placeholderText", "Stock");
       
        // Cambiar los estilos y colores de otros componentes aquí
    
        // Renderizador personalizado para los encabezados de columna
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(0xE50914)); // Color de fondo #1564c0
        tblPeli.getTableHeader().setDefaultRenderer(headerRenderer);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        labelInput1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtCodP = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        txtPeli = new javax.swing.JTextField();
        txtGen = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtFechE = new javax.swing.JTextField();
        txtSinp = new javax.swing.JTextField();
        catalogoSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPeli = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
        txtFechA = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(780, 600));
        setMinimumSize(new java.awt.Dimension(780, 600));
        setPreferredSize(new java.awt.Dimension(780, 430));
        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        labelInput1.setBackground(new java.awt.Color(255, 255, 255));
        labelInput1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelInput1.setForeground(new java.awt.Color(229, 9, 20));
        labelInput1.setText("MANTENIMIENTO DE PELICULAS");

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(21, 100, 192));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(20, 20, 20));

        txtCodP.setBackground(new java.awt.Color(51, 51, 51));
        txtCodP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCodP.setForeground(new java.awt.Color(204, 204, 204));
        txtCodP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtCodP.setCaretColor(new java.awt.Color(237, 237, 237));
        txtCodP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnConsulta.setBackground(new java.awt.Color(242, 25, 25));
        btnConsulta.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsulta.setText("Consulta");
        btnConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        txtPeli.setBackground(new java.awt.Color(51, 51, 51));
        txtPeli.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPeli.setForeground(new java.awt.Color(204, 204, 204));
        txtPeli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtGen.setBackground(new java.awt.Color(51, 51, 51));
        txtGen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtGen.setForeground(new java.awt.Color(204, 204, 204));
        txtGen.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ingresar los datos de las películas para añadir");

        txtFechE.setBackground(new java.awt.Color(51, 51, 51));
        txtFechE.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFechE.setForeground(new java.awt.Color(204, 204, 204));
        txtFechE.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtSinp.setBackground(new java.awt.Color(51, 51, 51));
        txtSinp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSinp.setForeground(new java.awt.Color(204, 204, 204));
        txtSinp.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        catalogoSearch.setBackground(new java.awt.Color(51, 51, 51));
        catalogoSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        catalogoSearch.setForeground(new java.awt.Color(204, 204, 204));

        tblPeli.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tblPeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Genero", "Sinopsis", "Stock", "Cantidad", "Nuevo Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPeli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPeli.setSelectionBackground(new java.awt.Color(0, 0, 50));
        jScrollPane2.setViewportView(tblPeli);

        btnActualizar.setBackground(new java.awt.Color(0, 51, 51));
        btnActualizar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(0, 51, 0));
        btnListar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");

        btnEliminar.setBackground(new java.awt.Color(102, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 204, 51));
        btnSalir.setText("SALIR");
        btnSalir.setActionCommand("Sa");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtStock.setBackground(new java.awt.Color(51, 51, 51));
        txtStock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtStock.setForeground(new java.awt.Color(204, 204, 204));
        txtStock.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtFechA.setBackground(new java.awt.Color(51, 51, 51));
        txtFechA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFechA.setForeground(new java.awt.Color(204, 204, 204));
        txtFechA.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnGuardar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(229, 9, 20));
        btnGuardar.setText("Añadir");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtSinp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCodP, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(btnConsulta)
                                    .addGap(80, 80, 80))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(219, 219, 219)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGen, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFechA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txtFechE)
                            .addComponent(txtStock))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(catalogoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSinp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catalogoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
       peliCont.consultarPelicula(txtCodP, txtPeli, txtGen, txtSinp, txtFechE, txtFechA, txtStock);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
            peliCont.actualizarPelicula(tblPeli, txtCodP, txtPeli, txtGen, txtSinp, txtFechE, txtFechA,txtStock );
        }catch(Exception e){
            Logger.getLogger(winMantenimientoPelicula.class.getName()).log(Level.SEVERE, null, e);
        }
        limpiarCampos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        peliCont.eliminarPelicula(tblPeli);
        
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Container sal = this.getParent();
        if(sal != null){
            if(!Arrays.asList(sal.getComponents()).contains(new winMantenimiento())){
                sal.removeAll();
                sal.add(new winMantenimiento());
                sal.revalidate();
                sal.repaint();
            }
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       String cod = txtCodP.getText();
       String tit = txtPeli.getText();
       String gen = txtGen.getText();
       String sinp = txtSinp.getText();
       String Sstock = txtStock.getText();
       int stock = Integer.parseInt(Sstock);
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate fechE = LocalDate.parse(txtFechE.getText(),formatter);
       LocalDate fechA = LocalDate.parse(txtFechA.getText(),formatter);
       peliCont.agregarPelicula(tblPeli, cod, tit, gen, sinp, fechE, fechA, stock);
       limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

    }//GEN-LAST:event_btnMostrarActionPerformed

    // METODO PARA LIMPIAR TEXTFIELD
    private void limpiarCampos() {
    txtCodP.setText("");
    txtPeli.setText("");
    txtGen.setText("");
    txtFechE.setText("");
    txtSinp.setText("");
    txtFechA.setText("");
    txtStock.setText("");
    txtCodP.requestFocus();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField catalogoSearch;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelInput1;
    private javax.swing.JTable tblPeli;
    private javax.swing.JTextField txtCodP;
    private javax.swing.JTextField txtFechA;
    private javax.swing.JTextField txtFechE;
    private javax.swing.JTextField txtGen;
    private javax.swing.JTextField txtPeli;
    private javax.swing.JTextField txtSinp;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
