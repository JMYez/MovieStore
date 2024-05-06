package com.mycompany.views;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class winUsuarios extends javax.swing.JPanel {

    public winUsuarios() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        jLabelTittle.setForeground(Color.black);
        jPanel2.setOpaque(false);
        jLabel4.setOpaque(false);
        jLabel1.setOpaque(false);
        jLabel2.setOpaque(false);
        jPanel4.setOpaque(false);
        jLabel7.setOpaque(false);
        jLabel8.setOpaque(false);
        jLabel9.setOpaque(false);
    }
    
    private void ShowJPanel(JPanel p){
        p.setSize(780, 430);
        p.setLocation(0,0);

        content.removeAll();
        content.setLayout(new BorderLayout());
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelTittle = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();
        jPanelContenedorOpcions = new javax.swing.JPanel();
        jPanelContenedorOpcion1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelContenedorOpcion2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanelContenedorOpcion3 = new javax.swing.JPanel();
        jPanelContenedorOpcion4 = new javax.swing.JPanel();
        jPanelContenedorOpcion5 = new javax.swing.JPanel();
        jPanelContenedorOpcion6 = new javax.swing.JPanel();
        jPanelContenedorOpcion7 = new javax.swing.JPanel();
        jPanelContenedorOpcion8 = new javax.swing.JPanel();

        content.setBackground(new java.awt.Color(224, 224, 224));

        jPanelHeader.setLayout(new java.awt.BorderLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 100, 192));
        jPanelHeader.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        jLabelTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTittle.setText("USUARIOS");

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

        jPanelContenedorOpcions.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorOpcions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelContenedorOpcion1.setBackground(new java.awt.Color(21, 101, 192));
        jPanelContenedorOpcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelContenedorOpcion1.setMaximumSize(new java.awt.Dimension(185, 215));
        jPanelContenedorOpcion1.setPreferredSize(new java.awt.Dimension(185, 215));
        jPanelContenedorOpcion1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(21, 101, 192));

        jLabel4.setBackground(new java.awt.Color(21, 101, 192));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(21, 101, 192));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VISUALIZAR DATOS");

        jLabel2.setBackground(new java.awt.Color(21, 101, 192));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DE LOS CLIENTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelContenedorOpcion1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 140));

        jButton1.setBackground(new java.awt.Color(21, 101, 192));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelContenedorOpcion1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 185, 250));
        jButton1.getAccessibleContext().setAccessibleDescription("");

        jPanelContenedorOpcions.add(jPanelContenedorOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 185, 250));

        jPanelContenedorOpcion2.setBackground(new java.awt.Color(21, 101, 192));
        jPanelContenedorOpcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelContenedorOpcion2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(21, 101, 192));

        jLabel7.setBackground(new java.awt.Color(21, 101, 192));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrador.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(21, 101, 192));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VISUALIZAR DATOS");

        jLabel9.setBackground(new java.awt.Color(21, 101, 192));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DEL ADMINISTRADOR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelContenedorOpcion2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 140));

        jButton3.setBackground(new java.awt.Color(21, 101, 192));
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setRequestFocusEnabled(false);
        jButton3.setVerifyInputWhenFocusTarget(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelContenedorOpcion2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 185, 250));

        jPanelContenedorOpcions.add(jPanelContenedorOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 0, 185, 250));

        jPanelContenedorOpcion3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorOpcion3.setLayout(new java.awt.GridBagLayout());
        jPanelContenedorOpcions.add(jPanelContenedorOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 0, 185, 250));

        jPanelContenedorOpcion4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorOpcion4.setLayout(new java.awt.GridBagLayout());
        jPanelContenedorOpcions.add(jPanelContenedorOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 185, 250));

        jPanelContenedorOpcion5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorOpcion5.setLayout(new java.awt.GridBagLayout());
        jPanelContenedorOpcions.add(jPanelContenedorOpcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 262, 185, 170));

        jPanelContenedorOpcion6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorOpcion6.setLayout(new java.awt.GridBagLayout());
        jPanelContenedorOpcions.add(jPanelContenedorOpcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 262, 185, 170));

        jPanelContenedorOpcion7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorOpcion7.setLayout(new java.awt.GridBagLayout());
        jPanelContenedorOpcions.add(jPanelContenedorOpcion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 262, 185, 170));

        jPanelContenedorOpcion8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorOpcion8.setLayout(new java.awt.GridBagLayout());
        jPanelContenedorOpcions.add(jPanelContenedorOpcion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 262, 185, 170));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ShowJPanel(new winVisualizarClientes());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ShowJPanel(new winVisualizarAdministrador());
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTittle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelContenedorOpcion1;
    private javax.swing.JPanel jPanelContenedorOpcion2;
    private javax.swing.JPanel jPanelContenedorOpcion3;
    private javax.swing.JPanel jPanelContenedorOpcion4;
    private javax.swing.JPanel jPanelContenedorOpcion5;
    private javax.swing.JPanel jPanelContenedorOpcion6;
    private javax.swing.JPanel jPanelContenedorOpcion7;
    private javax.swing.JPanel jPanelContenedorOpcion8;
    private javax.swing.JPanel jPanelContenedorOpcions;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelTittle;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
