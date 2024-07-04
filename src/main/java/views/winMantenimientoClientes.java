
package views;

import controllers.ClienteController;
import java.awt.Color;
import java.awt.Container;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class winMantenimientoClientes extends javax.swing.JPanel {
    
    DefaultTableModel model;
    ClienteController cliCont;
    public winMantenimientoClientes() {
        initComponents();
        InitStyles();
        cliCont = new ClienteController();
        model = new DefaultTableModel(new String[]{"DNI", "Nombre", "Apellido", "Direccion", "Telefono", "Correo"},0);
        tblClie.setModel(model);
        
        tblClie.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = tblClie.getSelectedRow();
                if (selectedRow != -1) {
                // Obtener los valores de la fila seleccionada y ponerlos en los JTextField
                txtDni.setText(model.getValueAt(selectedRow, 0).toString());
                txtNom.setText(model.getValueAt(selectedRow, 1).toString());
                txtApe.setText(model.getValueAt(selectedRow, 2).toString());
                txtDirec.setText(model.getValueAt(selectedRow, 3).toString());
                txtTelef.setText(model.getValueAt(selectedRow, 4).toString());
                txtCorreo.setText(model.getValueAt(selectedRow, 5).toString());
                }
            }
        }
      });
    }
    private void InitStyles() {
        //labelInput.setForeground(Color.black);
        ctlBusc.putClientProperty("JTextField.placeholderText", "Ingrese la cliente a buscar...");
        txtDni.putClientProperty("JTextField.placeholderText", "DNI del Cliente");
        txtNom.putClientProperty("JTextField.placeholderText", "Nombre");
        txtApe.putClientProperty("JTextField.placeholderText", "Apellidos");
        txtDirec.putClientProperty("JTextField.placeholderText", "Direccion");
        txtTelef.putClientProperty("JTextField.placeholderText", "Telefono");
        txtCorreo.putClientProperty("JTextField.placeholderText", "Correo");
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
    
        //setOpaque(false); // Asegurar que el componente es opaco para que el color de fondo sea visible
        //headerRenderer.setForeground(Color.WHITE); // Color del texto en blanco
        headerRenderer.setBackground(new Color(0xE50914)); // Color de fondo #1564c0
        //headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Alinear texto horizontalmente al centro
        //headerRenderer.setVerticalAlignment(JLabel.CENTER); // Alinear texto verticalmente al centro
        //headerRenderer.setFont(getFont().deriveFont(Font.BOLD, 16f)); // Fuente en negrita
  
        // Aplicar el renderizador personalizado al encabezado de la tabla
        tblClie.getTableHeader().setDefaultRenderer(headerRenderer);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        ctlBusc = new javax.swing.JTextField();
        btnBusc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClie = new javax.swing.JTable();
        btnActua = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        btnElim = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnConsul = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setLayout(new java.awt.BorderLayout());

        bg.setBackground(new java.awt.Color(20, 20, 20));

        ctlBusc.setForeground(new java.awt.Color(204, 204, 204));
        ctlBusc.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnBusc.setBackground(new java.awt.Color(0, 0, 50));
        btnBusc.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnBusc.setForeground(new java.awt.Color(255, 255, 255));
        btnBusc.setText("Buscar");
        btnBusc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscActionPerformed(evt);
            }
        });

        tblClie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Apellido", "DNI", "Dirección", "Telefono", "Coreo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblClie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblClie.setSelectionBackground(new java.awt.Color(0, 0, 50));
        jScrollPane1.setViewportView(tblClie);

        btnActua.setBackground(new java.awt.Color(0, 51, 51));
        btnActua.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnActua.setForeground(new java.awt.Color(255, 255, 255));
        btnActua.setText("Actualizar");
        btnActua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresar los datos de los clientes para añadir");

        txtNom.setBackground(new java.awt.Color(51, 51, 51));
        txtNom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNom.setForeground(new java.awt.Color(204, 204, 204));
        txtNom.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtApe.setBackground(new java.awt.Color(51, 51, 51));
        txtApe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApe.setForeground(new java.awt.Color(204, 204, 204));
        txtApe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtDni.setBackground(new java.awt.Color(51, 51, 51));
        txtDni.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(204, 204, 204));
        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtTelef.setBackground(new java.awt.Color(51, 51, 51));
        txtTelef.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelef.setForeground(new java.awt.Color(204, 204, 204));
        txtTelef.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtDirec.setBackground(new java.awt.Color(51, 51, 51));
        txtDirec.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDirec.setForeground(new java.awt.Color(204, 204, 204));
        txtDirec.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnElim.setBackground(new java.awt.Color(102, 0, 0));
        btnElim.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnElim.setForeground(new java.awt.Color(255, 255, 255));
        btnElim.setText("Limpiar");
        btnElim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnAñadir.setBackground(new java.awt.Color(255, 255, 255));
        btnAñadir.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(204, 0, 0));
        btnAñadir.setText("Añadir");
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnConsul.setBackground(new java.awt.Color(255, 0, 0));
        btnConsul.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnConsul.setForeground(new java.awt.Color(255, 255, 255));
        btnConsul.setText("Consulta");
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 204, 51));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTittle.setForeground(new java.awt.Color(229, 9, 20));
        jLabelTittle.setText("MANTENIMIENTO DE CLIENTES");

        jSeparator1.setForeground(new java.awt.Color(21, 100, 192));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(ctlBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnActua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConsul, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(85, 85, 85)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(505, 505, 505)
                                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadir)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctlBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btnActua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(bg, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscActionPerformed

    private void btnActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuaActionPerformed
       try {
            cliCont.actualizarCliente(tblClie, txtDni, txtNom, txtApe, txtDirec, txtTelef, txtCorreo);
        } catch (Exception ex) {
            Logger.getLogger(winMantenimientoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limpiarCampos();
    }//GEN-LAST:event_btnActuaActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        cliCont.eliminarCliente(tblClie);
        
        limpiarCampos();
    }//GEN-LAST:event_btnElimActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String sDni = txtDni.getText();
        String nom = txtNom.getText();
        String ape = txtApe.getText();
        String dir = txtDirec.getText();
        String tel = txtTelef.getText();
        String corr = txtCorreo.getText();
        int dni = Integer.parseInt(sDni);

        cliCont.agregarClientes(tblClie,dni, nom, ape, dir, tel,corr);
        limpiarCampos();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
       cliCont.consultarCliente(tblClie,txtDni, txtNom, txtApe, txtDirec, txtTelef, txtCorreo);
    }//GEN-LAST:event_btnConsulActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Container sal = this.getParent();
        if (sal != null) {
            // Verificar si winMantenimiento ya está agregado
            if (!Arrays.asList(sal.getComponents()).contains(new winMantenimiento())) {
                sal.removeAll();
                sal.add(new winMantenimiento());
                sal.revalidate();
                sal.repaint();
            }
        }
    }//GEN-LAST:event_btnSalirActionPerformed
        // METODO PARA LIMPIAR TEXTFIELD
    private void limpiarCampos() {
    txtDni.setText("");
    txtNom.setText("");
    txtApe.setText("");
    txtDirec.setText("");
    txtTelef.setText("");
    txtCorreo.setText("");
  
}    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActua;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBusc;
    private javax.swing.JButton btnConsul;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField ctlBusc;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTittle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblClie;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTelef;
    // End of variables declaration//GEN-END:variables
}
