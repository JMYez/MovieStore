
package views;

import java.awt.Color;
import java.awt.Container;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import models.Pelicula;



public class winMantenimientoPelicula extends javax.swing.JPanel {
    DefaultTableModel model;
    ArrayList<Pelicula> array;
    
    public winMantenimientoPelicula() {
        initComponents();
        InitStyles();
        array = new ArrayList<Pelicula>();
        model = new DefaultTableModel(new String[]{"Código", "Título", "Género","Fecha E ", "Sinopsis","Fecha A", "Stock", "Cantidad", "NueStock"}, 0);
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
                txtFechE.setText(model.getValueAt(selectedRow, 3).toString());
                txtSinp.setText(model.getValueAt(selectedRow, 4).toString());
                txtFechA.setText(model.getValueAt(selectedRow, 5).toString());
                txtStock.setText(model.getValueAt(selectedRow, 6).toString());
                txtCant.setText(model.getValueAt(selectedRow, 7).toString());
                txtNueStock.setText(model.getValueAt(selectedRow, 8).toString());
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
        txtFechE.putClientProperty("JTextField.placeholderText", "Fecha Estreno");
        txtSinp.putClientProperty("JTextField.placeholderText", "Sinópsis");
        txtFechA.putClientProperty("JTextField.placeholderText", "Fecha Agregada");
        txtStock.putClientProperty("JTextField.placeholderText", "Stock");
        txtCant.putClientProperty("JTextField.placeholderText", "Cantidad");
        txtNueStock.putClientProperty("JTextField.placeholderText", "Nuevo Stock");
       
        // Cambiar los estilos y colores de otros componentes aquí
    
        // Renderizador personalizado para los encabezados de columna
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
    
        //setOpaque(true); // Asegurar que el componente es opaco para que el color de fondo sea visible
        //headerRenderer.setForeground(Color.WHITE); // Color del texto en blanco
        headerRenderer.setBackground(new Color(0xE50914)); // Color de fondo #1564c0
        //headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Alinear texto horizontalmente al centro
        //headerRenderer.setVerticalAlignment(JLabel.CENTER); // Alinear texto verticalmente al centro
        //headerRenderer.setFont(getFont().deriveFont(Font.BOLD, 16f)); // Fuente en negrita
    
        // Aplicar el renderizador personalizado al encabezado de la tabla
        tblPeli.getTableHeader().setDefaultRenderer(headerRenderer);
    }
    
/////////////////////A PARTIR DE AQUI HACIA ABAJO ES FULL CODIGO DE BOTONES, OTROS METODOS/OPERACIONES//////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        txtFechA = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtNueStock = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPeli = new javax.swing.JTable();
        catalogoSearch = new javax.swing.JTextField();
        txtSinp = new javax.swing.JTextField();
        txtGen = new javax.swing.JTextField();
        txtPeli = new javax.swing.JTextField();
        txtCodP = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtFechE = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelInput1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(1908, 430));

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

        btnListar.setBackground(new java.awt.Color(0, 51, 0));
        btnListar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");

        txtFechA.setBackground(new java.awt.Color(51, 51, 51));
        txtFechA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFechA.setForeground(new java.awt.Color(204, 204, 204));
        txtFechA.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtStock.setBackground(new java.awt.Color(51, 51, 51));
        txtStock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtStock.setForeground(new java.awt.Color(204, 204, 204));
        txtStock.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtCant.setBackground(new java.awt.Color(51, 51, 51));
        txtCant.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCant.setForeground(new java.awt.Color(204, 204, 204));
        txtCant.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtNueStock.setBackground(new java.awt.Color(51, 51, 51));
        txtNueStock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNueStock.setForeground(new java.awt.Color(204, 204, 204));
        txtNueStock.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 50));
        btnBuscar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        catalogoSearch.setBackground(new java.awt.Color(51, 51, 51));
        catalogoSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        catalogoSearch.setForeground(new java.awt.Color(204, 204, 204));

        txtSinp.setBackground(new java.awt.Color(51, 51, 51));
        txtSinp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSinp.setForeground(new java.awt.Color(204, 204, 204));
        txtSinp.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtGen.setBackground(new java.awt.Color(51, 51, 51));
        txtGen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtGen.setForeground(new java.awt.Color(204, 204, 204));
        txtGen.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtPeli.setBackground(new java.awt.Color(51, 51, 51));
        txtPeli.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPeli.setForeground(new java.awt.Color(204, 204, 204));
        txtPeli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtCodP.setBackground(new java.awt.Color(51, 51, 51));
        txtCodP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCodP.setForeground(new java.awt.Color(204, 204, 204));
        txtCodP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtCodP.setCaretColor(new java.awt.Color(237, 237, 237));
        txtCodP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(21, 100, 192));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ingresar los datos de las películas para añadir");

        txtFechE.setBackground(new java.awt.Color(51, 51, 51));
        txtFechE.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFechE.setForeground(new java.awt.Color(204, 204, 204));
        txtFechE.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnGuardar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(229, 9, 20));
        btnGuardar.setText("Añadir");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel20))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(225, 225, 225))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodP, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnConsulta)
                                        .addGap(86, 86, 86)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechA, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtGen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSinp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(225, 225, 225)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNueStock, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(293, 293, 293)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(12, 302, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(catalogoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNueStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSinp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catalogoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(9, 9, 9))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

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
                .addGap(270, 270, 270))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents
    // BOTON DE ACTUALIZAR
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int selectedRow = tblPeli.getSelectedRow();
    if (selectedRow != -1) {
        try {
            // Obtener los nuevos valores de los JTextField
            String cod = txtCodP.getText();
            String tit = txtPeli.getText();
            String gen = txtGen.getText();
            String fchE = txtFechE.getText();
            String sinp = txtSinp.getText();
            String fchA = txtFechA.getText();
            String stk = txtStock.getText();
            String cant = txtCant.getText();
            String nStk = txtNueStock.getText();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate fechE = LocalDate.parse(fchE, formatter);
            LocalDate fechA = LocalDate.parse(fchA, formatter);
            int stock = Integer.parseInt(stk);
            int canti = Integer.parseInt(cant);
            int nStock = Integer.parseInt(nStk);

            // Actualizar la fila seleccionada en el modelo de la tabla
            model.setValueAt(cod, selectedRow, 0);
            model.setValueAt(tit, selectedRow, 1);
            model.setValueAt(gen, selectedRow, 2);
            model.setValueAt(fechE, selectedRow, 3);
            model.setValueAt(sinp, selectedRow, 4);
            model.setValueAt(fechA, selectedRow, 5);        
            model.setValueAt(stock, selectedRow, 6);
            model.setValueAt(canti, selectedRow, 7);
            model.setValueAt(nStock, selectedRow, 8);

            // Si estás usando un ArrayList para almacenar las películas, también actualízalo
            Pelicula peli = array.get(selectedRow);
            peli.setCodigo(cod);
            peli.setTitulo(tit);
            peli.setGenero(gen);
            peli.setFechaEstreno(fechE);
            peli.setSinopsis(sinp);
            peli.setFechaAgregacion(fechA);  
            peli.setStock(stock);
            peli.setCantidad(canti);
            peli.setNueStock(nStock);

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "La película se ha actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (DateTimeParseException | NumberFormatException e) {
            // Mostrar mensaje de error si ocurre una excepción al convertir fechas o números
            JOptionPane.showMessageDialog(this, "Error al actualizar la película. Verifica los campos ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Mostrar mensaje de error si no hay una fila seleccionada
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una película de la tabla para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    // BOTON DE ELIMINAR
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int elim = tblPeli.getSelectedRow();
        if(elim>=0)
        {
            array.remove(elim);
            model.removeRow(elim);
            limpiarCampos();
        }
        else{
           JOptionPane.showMessageDialog(null,"Falta selecionar fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    // METODO PARA LIMPIAR TEXTFIELD
    private void limpiarCampos() {
    txtCodP.setText("");
    txtPeli.setText("");
    txtGen.setText("");
    txtFechE.setText("");
    txtSinp.setText("");
    txtFechA.setText("");
    txtStock.setText("");
    txtCant.setText("");
    txtNueStock.setText("");
    txtCodP.requestFocus();
}
    
    // BOTON CONSULTAS
    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        String cod = txtCodP.getText();
        Pelicula peli = buscar(cod);
        if(peli!=null)
        {
            txtCodP.setText(peli.getCodigo());
            txtPeli.setText(peli.getTitulo());
            txtGen.setText(peli.getGenero());
            txtFechE.setText(peli.getFechaEstreno() + "");
            txtSinp.setText(peli.getSinopsis());
            txtFechA.setText(peli.getFechaAgregacion()+ "");
            txtStock.setText(peli.getStock() + "");
            txtCant.setText(peli.getCantidad() + "");
            txtNueStock.setText(peli.getNueStock() + "");
            txtCodP.requestFocus();
        }else
            JOptionPane.showMessageDialog(null,"Pelicula " + cod + ", No existe");
        
    }//GEN-LAST:event_btnConsultaActionPerformed
    
    //BUSCAR PELICULAS 
    public Pelicula buscar(String cod){
        Pelicula peli;
        for ( int i=0; i<array.size(); i++)
        {
            if(cod.equals(array.get(i).getCodigo()))
            {
                return array.get(i);
            }
        }
        return null;
    }
    
     // BOTON GUARDAR/AÑADIR
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         String cod, tit, gen, sinp;
        String datos[] = new String[9];
        
        datos[0] = cod = txtCodP.getText();
        datos[1] = tit = txtPeli.getText();
        datos[2] = gen = txtGen.getText();
        datos[3] = txtFechE.getText();    
        datos[4] = sinp = txtSinp.getText();
        datos[5] = txtFechA.getText();
        datos[6]  = txtStock.getText();
        datos[7]  = txtCant.getText();
        datos[8] = txtNueStock.getText();
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    try {
        LocalDate fechE = LocalDate.parse(txtFechE.getText(), formatter);
        LocalDate fechA = LocalDate.parse(txtFechA.getText(), formatter);
        int stock = Integer.parseInt(txtStock.getText());
        int canti = Integer.parseInt(txtCant.getText());
        int nStock = Integer.parseInt(txtNueStock.getText());
        model.addRow(datos);
        Pelicula peli = new Pelicula(cod, tit, gen, fechE,sinp, fechA, stock, canti, nStock);
        array.add(peli);
        limpiarCampos();
        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "La película se ha añadido correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (DateTimeParseException | NumberFormatException e) {
        // Mostrar mensaje de error si ocurre una excepción al convertir fechas o números
        JOptionPane.showMessageDialog(this, "Error al añadir la película. Verifica los campos ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnGuardarActionPerformed

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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField catalogoSearch;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelInput1;
    private javax.swing.JTable tblPeli;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodP;
    private javax.swing.JTextField txtFechA;
    private javax.swing.JTextField txtFechE;
    private javax.swing.JTextField txtGen;
    private javax.swing.JTextField txtNueStock;
    private javax.swing.JTextField txtPeli;
    private javax.swing.JTextField txtSinp;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
