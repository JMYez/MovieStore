/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ingje
 */
    
public class winAlquileresRealizados extends javax.swing.JPanel {
 private AlquileresController controller = new AlquileresController();
 public winAlquileresRealizados() {
        initComponents();
        cargarDatos(); // Carga los datos iniciales
    }
    

   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelTittle = new javax.swing.JPanel();
        jPanelContenedorOpcions = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btnFiltrarFecha = new javax.swing.JButton();
        btnFiltrarNombre = new javax.swing.JButton();
        btnFiltrarApellido = new javax.swing.JButton();
        btnFiltrarVenta = new javax.swing.JButton();
        btnFiltrarCodigo = new javax.swing.JButton();

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHeader.setLayout(new java.awt.BorderLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 100, 192));
        jPanelHeader.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanelTittleLayout = new javax.swing.GroupLayout(jPanelTittle);
        jPanelTittle.setLayout(jPanelTittleLayout);
        jPanelTittleLayout.setHorizontalGroup(
            jPanelTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jPanelTittleLayout.setVerticalGroup(
            jPanelTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jPanelHeader.add(jPanelTittle, java.awt.BorderLayout.LINE_START);

        jPanelContenedorOpcions.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Alfredo Sthefano", "Diaz Vasquez", "12345678", "UTP sede Centro", "958302198"},
                {"2", "María", "Sánchez	", "01234567O	", "Calle de los Sueños 456	", "600-555-666 "},
                {"3", "Pablo", "Martínez	", "01234567T	", "Avenida de las Miradas 901	", "600-000-111 "},
                {"4", "Elena	", "Diaz", "89012345S	", "Paseo de los Recuerdos 678	", "600-999-000 "},
                {"5", "Daniel", "Fernández	", "23456789P	", "Paseo de los Susurros 789	", "600-666-777 "},
                {"6", "Jorge	", "Sánchez", "01234567O	", "Calle de los Sueños 456	", "600-555-666 "},
                {"7", "Sofía	", "Fernández	", "45678901G	", "Calle de las Quimeras 789	", "600-789-012 "},
                {"8", "Diego	", "López", "45678901L	", "Calle de las Sombras 567	", "600-222-333 "},
                {"9", "Ana	", "Martínez	", "23456789K	", "Avenida del Sol Poniente 234	", "600-111-222 "},
                {"10", "Sthefano", "Roman", "22398102D", "Jiron Velarde 113", "601-212-045 "}
            },
            new String [] {
                "Codigo del cliente", "Nombres", "Apellidos", "DNI", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("aaaa");
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelContenedorOpcionsLayout = new javax.swing.GroupLayout(jPanelContenedorOpcions);
        jPanelContenedorOpcions.setLayout(jPanelContenedorOpcionsLayout);
        jPanelContenedorOpcionsLayout.setHorizontalGroup(
            jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        jPanelContenedorOpcionsLayout.setVerticalGroup(
            jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorOpcionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jTextField1.setText("ALQUILERES REALIZADOS");

        btnFiltrarFecha.setText("Filtrar fecha");
        btnFiltrarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarFechaActionPerformed(evt);
            }
        });

        btnFiltrarNombre.setText("Filtrar nombre");
        btnFiltrarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarNombreActionPerformed(evt);
            }
        });

        btnFiltrarApellido.setText("Filtrar apellido");
        btnFiltrarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarApellidoActionPerformed(evt);
            }
        });

        btnFiltrarVenta.setText("Filtrar venta");
        btnFiltrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVentaActionPerformed(evt);
            }
        });

        btnFiltrarCodigo.setText("Filtrar codigo");
        btnFiltrarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnFiltrarFecha)
                .addGap(60, 60, 60)
                .addComponent(btnFiltrarNombre)
                .addGap(81, 81, 81)
                .addComponent(btnFiltrarApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFiltrarVenta)
                .addGap(119, 119, 119)
                .addComponent(btnFiltrarCodigo)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltrarFecha)
                    .addComponent(btnFiltrarNombre)
                    .addComponent(btnFiltrarApellido)
                    .addComponent(btnFiltrarVenta)
                    .addComponent(btnFiltrarCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarFechaActionPerformed
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha (YYYY-MM-DD):");
        DefaultTableModel model = controller.getAlquileres("fecha", fecha);
        jTable1.setModel(model);
    }//GEN-LAST:event_btnFiltrarFechaActionPerformed

    private void btnFiltrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVentaActionPerformed
        String venta = JOptionPane.showInputDialog("Ingrese el valor de la venta:");
        DefaultTableModel model = controller.getAlquileres("venta", venta);
        jTable1.setModel(model);
    }//GEN-LAST:event_btnFiltrarVentaActionPerformed

    private void btnFiltrarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarApellidoActionPerformed
String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        DefaultTableModel model = controller.getAlquileres("apellido", apellido);
        jTable1.setModel(model);    }//GEN-LAST:event_btnFiltrarApellidoActionPerformed

    private void btnFiltrarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCodigoActionPerformed
        String codigo = JOptionPane.showInputDialog("Ingrese el código del cliente:");
        DefaultTableModel model = controller.getAlquileres("codigo", codigo);
        jTable1.setModel(model);
    }//GEN-LAST:event_btnFiltrarCodigoActionPerformed

    private void btnFiltrarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarNombreActionPerformed
 String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        DefaultTableModel model = controller.getAlquileres("nombre", nombre);
        jTable1.setModel(model);    }//GEN-LAST:event_btnFiltrarNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarApellido;
    private javax.swing.JButton btnFiltrarCodigo;
    private javax.swing.JButton btnFiltrarFecha;
    private javax.swing.JButton btnFiltrarNombre;
    private javax.swing.JButton btnFiltrarVenta;
    private javax.swing.JPanel jPanelContenedorOpcions;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelTittle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
         DefaultTableModel model = controller.getAlquileres(null, null); // Carga todos los datos
        jTable1.setModel(model);
    }
    }

