package com.mycompany.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import paqClases.moviestore.Clientes;

public class winMantenimientoClientes extends javax.swing.JPanel {
    
    DefaultTableModel model;
    ArrayList<Clientes> array;
    public winMantenimientoClientes() {
        initComponents();
        InitStyles();
        array = new ArrayList<Clientes>();
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
    
        setOpaque(false); // Asegurar que el componente es opaco para que el color de fondo sea visible
        //headerRenderer.setForeground(Color.WHITE); // Color del texto en blanco
        headerRenderer.setBackground(new Color(0xE50914)); // Color de fondo #1564c0
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Alinear texto horizontalmente al centro
        headerRenderer.setVerticalAlignment(JLabel.CENTER); // Alinear texto verticalmente al centro
        headerRenderer.setFont(getFont().deriveFont(Font.BOLD, 16f)); // Fuente en negrita
    
        // Aplicar el renderizador personalizado al encabezado de la tabla
        tblClie.getTableHeader().setDefaultRenderer(headerRenderer);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedorOpcions = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        ctlBusc = new javax.swing.JTextField();
        btnBusc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClie = new javax.swing.JTable();
        btnActua = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDirec = new javax.swing.JTextField();
        btnElim = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelHeader = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelTittle = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();

        jPanelContenedorOpcions.setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(0, 0, 0));

        ctlBusc.setEnabled(false);

        btnBusc.setBackground(new java.awt.Color(0, 0, 50));
        btnBusc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBusc.setForeground(new java.awt.Color(255, 255, 255));
        btnBusc.setText("Buscar");
        btnBusc.setBorderPainted(false);
        btnBusc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblClie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
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
        tblClie.setShowHorizontalLines(true);
        tblClie.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblClie);

        btnActua.setBackground(new java.awt.Color(14, 71, 161));
        btnActua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActua.setForeground(new java.awt.Color(255, 255, 255));
        btnActua.setText("Actualizar");
        btnActua.setBorderPainted(false);
        btnActua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Ingresar los datos de los clientes para añadir");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(21, 100, 192));

        txtNom.setBackground(new java.awt.Color(51, 51, 51));
        txtNom.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Apellido");

        txtApe.setBackground(new java.awt.Color(51, 51, 51));
        txtApe.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("DNI");

        txtDni.setBackground(new java.awt.Color(51, 51, 51));
        txtDni.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setBorder(null);

        txtTelef.setBackground(new java.awt.Color(51, 51, 51));
        txtTelef.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Dirección");

        txtDirec.setBackground(new java.awt.Color(51, 51, 51));
        txtDirec.setBorder(null);

        btnElim.setBackground(new java.awt.Color(102, 0, 0));
        btnElim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnElim.setForeground(new java.awt.Color(255, 255, 255));
        btnElim.setText("Limpiar");
        btnElim.setBorderPainted(false);
        btnElim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnAñadir.setBackground(new java.awt.Color(255, 255, 255));
        btnAñadir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(204, 0, 0));
        btnAñadir.setText("Añadir");
        btnAñadir.setBorderPainted(false);
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jButton1))
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirec)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(ctlBusc))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ctlBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnActua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContenedorOpcionsLayout = new javax.swing.GroupLayout(jPanelContenedorOpcions);
        jPanelContenedorOpcions.setLayout(jPanelContenedorOpcionsLayout);
        jPanelContenedorOpcionsLayout.setHorizontalGroup(
            jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelContenedorOpcionsLayout.setVerticalGroup(
            jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHeader.setLayout(new java.awt.BorderLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 100, 192));
        jPanelHeader.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        jLabelTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTittle.setForeground(new java.awt.Color(229, 9, 20));
        jLabelTittle.setText("MANTENIMIENTO DE CLIENTES");

        javax.swing.GroupLayout jPanelTittleLayout = new javax.swing.GroupLayout(jPanelTittle);
        jPanelTittle.setLayout(jPanelTittleLayout);
        jPanelTittleLayout.setHorizontalGroup(
            jPanelTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTittleLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabelTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTittleLayout.setVerticalGroup(
            jPanelTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTittleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelHeader.add(jPanelTittle, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
            .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dni = txtDni.getText();
        Clientes clie = buscar(dni);
        if(clie!=null){
            txtDni.setText(clie.getDni());
            txtNom.setText(clie.getNombre());
            txtApe.setText(clie.getApellidos());
            txtDirec.setText(clie.getDireccion());
            txtTelef.setText(clie.getTelefono());
            txtCorreo.setText(clie.getCorreo());
        }else{
            JOptionPane.showMessageDialog(null, "Cliente " + dni + "No existe");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String dni, nom, ape, direc, telef, corr;
        String datos[] = new String[6];

        datos[0] = dni = txtDni.getText();
        datos[1] = nom = txtNom.getText();
        datos[2] = ape = txtApe.getText();
        datos[3] = direc = txtDirec.getText();
        datos[4] = telef = txtTelef.getText();
        datos[5] = corr = txtCorreo.getText();

        try{
            // Verificar que todos los campos estén llenos
            for (String dato : datos) {
                if (dato.isEmpty()) {
                    throw new Exception("Todos los campos deben estar llenos");
                }
            }

            // Verificar que el DNI tenga 8 dígitos
            if (dni.length() != 8) {
                throw new Exception("El DNI debe tener 8 dígitos");
            }

            // Si las verificaciones pasan, se añade el cliente
            model.addRow(datos);
            Clientes clie = new Clientes(dni, nom, ape, direc, telef, corr);
            array.add(clie);
            limpiarCampos();

            JOptionPane.showMessageDialog(this, "Cliente añadido correctamente");
        } catch (Exception e) {
            // Mostrar el mensaje de error correspondiente
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Revise", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        int elim = tblClie.getSelectedRow();
        if(elim >= 0){
            array.remove(elim);
            model.removeRow(elim);

            JOptionPane.showMessageDialog(this,"Cliente eliminado correctamente");
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona un dato para eliminar" );
        }
    }//GEN-LAST:event_btnElimActionPerformed

    private void btnActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuaActionPerformed
        String dni = txtDni.getText();
        String nom = txtNom.getText();
        String ape = txtApe.getText();
        String direc = txtDirec.getText();
        String telef = txtTelef.getText();
        String corr = txtCorreo.getText();

        try {
            // Verificar que todos los campos estén llenos
            if (dni.isEmpty() || nom.isEmpty() || ape.isEmpty() || direc.isEmpty() || telef.isEmpty() || corr.isEmpty()) {
                throw new Exception("Todos los campos deben estar llenos");
            }

            // Verificar que el DNI tenga 8 dígitos
            if (dni.length() != 8) {
                throw new Exception("El DNI debe tener 8 dígitos");
            }

            // Verificar que una fila esté seleccionada
            int selectedRow = tblClie.getSelectedRow();
            if (selectedRow == -1) {
                throw new Exception("No hay ninguna fila seleccionada para actualizar");
            }

            // Actualizar los datos en la tabla
            model.setValueAt(dni, selectedRow, 0);
            model.setValueAt(nom, selectedRow, 1);
            model.setValueAt(ape, selectedRow, 2);
            model.setValueAt(direc, selectedRow, 3);
            model.setValueAt(telef, selectedRow, 4);
            model.setValueAt(corr, selectedRow, 5);

            // Actualizar datos en la lista de clientes
            Clientes clie = array.get(selectedRow);
            clie.setDni(dni);
            clie.setNombre(nom);
            clie.setApellidos(ape);
            clie.setDireccion(direc);
            clie.setTelefono(telef);
            clie.setCorreo(corr);

            JOptionPane.showMessageDialog(this, "Datos del cliente actualizados correctamente");
            limpiarCampos();
        } catch (Exception e) {
            // Mostrar el mensaje de error correspondiente como mensaje de error
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActuaActionPerformed
        // METODO PARA LIMPIAR TEXTFIELD
    private void limpiarCampos() {
    txtDni.setText("");
    txtNom.setText("");
    txtApe.setText("");
    txtDirec.setText("");
    txtTelef.setText("");
    txtCorreo.setText("");
  
}    
    public Clientes buscar(String dni){
        Clientes clie;
        for(int i=0; i<array.size(); i++){
            if(dni.equals(array.get(i).getDni()))
            {
                return array.get(i);
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActua;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBusc;
    private javax.swing.JButton btnElim;
    private javax.swing.JTextField ctlBusc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTittle;
    private javax.swing.JPanel jPanelContenedorOpcions;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelTittle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblClie;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTelef;
    // End of variables declaration//GEN-END:variables
}
