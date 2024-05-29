package com.mycompany.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import paqClases.moviestore.Peliculas;


public class winMantenimiento extends javax.swing.JPanel {

    public winMantenimiento() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
       /* jPanel2.setOpaque(false);
        jLabel4.setOpaque(false);
        jLabel1.setOpaque(false);
        jLabel2.setOpaque(false);
        jPanel4.setOpaque(false);
        jLabel7.setOpaque(false);
        jLabel8.setOpaque(false);
        jLabel9.setOpaque(false);*/
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

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelTittle = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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

        setLayout(new java.awt.BorderLayout());

        content.setBackground(new java.awt.Color(224, 224, 224));

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHeader.setLayout(new java.awt.BorderLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 100, 192));
        jPanelHeader.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        jPanelTittle.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 9, 20));
        jLabel3.setText("Mantenimiento");

        javax.swing.GroupLayout jPanelTittleLayout = new javax.swing.GroupLayout(jPanelTittle);
        jPanelTittle.setLayout(jPanelTittleLayout);
        jPanelTittleLayout.setHorizontalGroup(
            jPanelTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(598, Short.MAX_VALUE))
        );
        jPanelTittleLayout.setVerticalGroup(
            jPanelTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanelHeader.add(jPanelTittle, java.awt.BorderLayout.LINE_START);

        jPanelContenedorOpcions.setBackground(new java.awt.Color(0, 0, 0));
        jPanelContenedorOpcions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelContenedorOpcion1.setBackground(new java.awt.Color(255, 0, 0));
        jPanelContenedorOpcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelContenedorOpcion1.setMaximumSize(new java.awt.Dimension(185, 215));
        jPanelContenedorOpcion1.setPreferredSize(new java.awt.Dimension(185, 215));
        jPanelContenedorOpcion1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO");

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DE PELÍCULAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanelContenedorOpcion1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 240));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
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
        jPanelContenedorOpcion1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 270, 340));

        jPanelContenedorOpcions.add(jPanelContenedorOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 270, 350));

        jPanelContenedorOpcion2.setBackground(new java.awt.Color(255, 0, 0));
        jPanelContenedorOpcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelContenedorOpcion2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrador.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MANTENIMIENTO");

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DE CLIENTES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanelContenedorOpcion2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 210));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
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
        jPanelContenedorOpcion2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 340));

        jPanelContenedorOpcions.add(jPanelContenedorOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 270, 350));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
            .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorOpcions, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ShowJPanel(new winMantenimientoStock());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ShowJPanel(new winMantenimientoClientes());
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelContenedorOpcion1;
    private javax.swing.JPanel jPanelContenedorOpcion2;
    private javax.swing.JPanel jPanelContenedorOpcions;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelTittle;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
