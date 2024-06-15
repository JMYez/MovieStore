
package views;

import com.mycompany.views.*;
import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.Cliente;

public class winMantenimientoClientes extends javax.swing.JPanel {
    
    DefaultTableModel model;
    ArrayList<Cliente> array;
    public winMantenimientoClientes() {
        initComponents();
        InitStyles();
        array = new ArrayList<Cliente>();
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
        txtApe = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        btnElim = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnConsul = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelHeader = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelTittle = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanelContenedorOpcions.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorOpcions.setLayout(new java.awt.BorderLayout());

        bg.setBackground(new java.awt.Color(0, 0, 0));

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

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(21, 100, 192));

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

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
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
                                    .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(ctlBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnActua, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(btnElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 61, Short.MAX_VALUE))))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctlBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btnActua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        jPanelContenedorOpcions.add(bg, java.awt.BorderLayout.CENTER);

        add(jPanelContenedorOpcions, java.awt.BorderLayout.CENTER);

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 100, 192));

        jPanelTittle.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addComponent(jPanelTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanelHeader, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
        try {
            int dni = Integer.parseInt(txtDni.getText());
            Cliente clie = consultar(dni);
            if (clie != null) {
                txtNom.setText(clie.getNombre());
                txtApe.setText(clie.getApellidos());
                txtDirec.setText(clie.getDireccion());
                txtTelef.setText(clie.getTelefono());
                txtCorreo.setText(clie.getCorreo());
            } else {
                JOptionPane.showMessageDialog(null, "Cliente " + dni + " No existe");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "DNI debe ser un número entero");
        }
    }//GEN-LAST:event_btnConsulActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String nom, ape, direc, telef, corr;
        int dni;
        try {
            dni = Integer.parseInt(txtDni.getText());
            nom = txtNom.getText();
            ape = txtApe.getText();
            direc = txtDirec.getText();
            telef = txtTelef.getText();
            corr = txtCorreo.getText();

            // Verificar que todos los campos estén llenos
            if (nom.isEmpty() || ape.isEmpty() || direc.isEmpty() || telef.isEmpty() || corr.isEmpty()) {
                throw new Exception("Todos los campos deben estar llenos");
            }

            // Verificar que el DNI tenga 8 dígitos
            if (String.valueOf(dni).length() != 8) {
                throw new Exception("El DNI debe tener 8 dígitos");
            }

            // Si las verificaciones pasan, se añade el cliente
            model.addRow(new Object[]{dni, nom, ape, direc, telef, corr});
            Cliente clie = new Cliente(dni, nom, ape, direc, telef, corr);
            array.add(clie);
            limpiarCampos();

            JOptionPane.showMessageDialog(this, "Cliente añadido correctamente");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DNI debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
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
                try {
            int dni = Integer.parseInt(txtDni.getText());
            String nom = txtNom.getText();
            String ape = txtApe.getText();
            String direc = txtDirec.getText();
            String telef = txtTelef.getText();
            String corr = txtCorreo.getText();

            // Verificar que todos los campos estén llenos
            if (nom.isEmpty() || ape.isEmpty() || direc.isEmpty() || telef.isEmpty() || corr.isEmpty()) {
                throw new Exception("Todos los campos deben estar llenos");
            }

            // Verificar que el DNI tenga 8 dígitos
            if (String.valueOf(dni).length() != 8) {
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
            Cliente clie = array.get(selectedRow);
            clie.setDni(dni);
            clie.setNombre(nom);
            clie.setApellidos(ape);
            clie.setDireccion(direc);
            clie.setTelefono(telef);
            clie.setCorreo(corr);

            JOptionPane.showMessageDialog(this, "Datos del cliente actualizados correctamente");
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DNI debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Mostrar el mensaje de error correspondiente como mensaje de error
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActuaActionPerformed

    private void btnBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscActionPerformed

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
    public Cliente consultar(int dni){
        for (Cliente clie : array) {
            if (clie.getDni() == dni) {
                return clie;
            }
        }
        return null;
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
