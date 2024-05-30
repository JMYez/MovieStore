package com.mycompany.views;

public class winDisponiblesAlquiler extends javax.swing.JPanel {

    public winDisponiblesAlquiler() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelTittle = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();
        jPanelContenedorOpcions = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnNemo = new javax.swing.JButton();
        btnYourName = new javax.swing.JButton();
        btnKungFu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnOppen = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanelContenedor.setBackground(new java.awt.Color(255, 255, 255));

        jPanelHeader.setLayout(new java.awt.BorderLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 100, 192));
        jPanelHeader.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        jLabelTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTittle.setText("PELÍCULAS DISPONIBLES PARA ALQUILAR");

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

        jPanelContenedorOpcions.setBackground(new java.awt.Color(20, 20, 20));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizar.png"))); // NOI18N
        jButton2.setText("Recargar");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("The Idea Of You");

        btnNemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tioy (1).jpg"))); // NOI18N
        btnNemo.setBorder(null);
        btnNemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNemoActionPerformed(evt);
            }
        });

        btnYourName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65998b97561f010e6067a222-the-eras-tour-album-cover-posters-for (1).jpg"))); // NOI18N
        btnYourName.setBorder(null);

        btnKungFu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MV5BODM0NmVjMzUtOTJhNi00N2ZhLWFkYmMtYmZmNjRiY2M1YWY4XkEyXkFqcGdeQXVyOTgxOTA5MDg._V1_FMjpg_UX1000_.jpg"))); // NOI18N
        btnKungFu.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Jujutsu Kaisen 0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("The Eras Tour");

        btnOppen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s-l1200 (1).jpg"))); // NOI18N
        btnOppen.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Wicked");

        javax.swing.GroupLayout jPanelContenedorOpcionsLayout = new javax.swing.GroupLayout(jPanelContenedorOpcions);
        jPanelContenedorOpcions.setLayout(jPanelContenedorOpcionsLayout);
        jPanelContenedorOpcionsLayout.setHorizontalGroup(
            jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorOpcionsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNemo)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnYourName)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorOpcionsLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorOpcionsLayout.createSequentialGroup()
                        .addComponent(btnKungFu)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorOpcionsLayout.createSequentialGroup()
                        .addComponent(btnOppen)
                        .addGap(24, 24, 24)
                        .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContenedorOpcionsLayout.setVerticalGroup(
            jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorOpcionsLayout.createSequentialGroup()
                .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorOpcionsLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanelContenedorOpcionsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNemo)
                            .addComponent(btnYourName)
                            .addGroup(jPanelContenedorOpcionsLayout.createSequentialGroup()
                                .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOppen)
                                    .addComponent(btnKungFu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelContenedorOpcionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
            .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNemoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNemoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKungFu;
    private javax.swing.JButton btnNemo;
    private javax.swing.JButton btnOppen;
    private javax.swing.JButton btnYourName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTittle;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelContenedorOpcions;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelTittle;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
