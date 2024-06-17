package views;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.views.winCatalogoPeliculas;
import com.mycompany.views.winIniciarSesion;
import com.mycompany.views.winInicio;
import com.mycompany.views.winProcesos;
import com.mycompany.views.winUsuarios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class DashboardUnlocked extends javax.swing.JFrame {

    public DashboardUnlocked() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
    }

    private void InitStyles() {
        mensaje.putClientProperty( "FlatLaf.styleClass", "h1" );
        mensaje.setForeground(Color.black);
        navText.putClientProperty( "FlatLaf.style", "font: bold $h4.regular.font");
        navText.setForeground(Color.white);
        dateText.putClientProperty( "FlatLaf.style", "font: bold $h2.regular.font");
        dateText.setForeground(Color.white);
        appName.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font");
int red = Integer.parseInt("e5", 16);
int green = Integer.parseInt("09", 16);
int blue = Integer.parseInt("14", 16);

Color color = new Color(red, green, blue);

// Set the foreground color
appName.setForeground(color);

    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEE dd 'de' MMM 'de' yyy", spanishLocale)));
    }
    
    private void InitContent(){
                btnwinInicio.setBackground(new Color(0xE50914));
              btnCerrarSesion.setVisible(true);
        ShowJPanel(new winInicio());
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

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnwinInicio = new javax.swing.JButton();
        btnwinCatalogoPeliculas = new javax.swing.JButton();
        btnwinUsuarios = new javax.swing.JButton();
        btnwinProcesos = new javax.swing.JButton();
        btnwinMantenimiento = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnwinMantenimiento1 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        navText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 680));

        background.setBackground(new java.awt.Color(20, 20, 20));
        background.setPreferredSize(new java.awt.Dimension(1080, 680));

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setEnabled(false);
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        appName.setForeground(new java.awt.Color(229, 9, 20));
        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("Movie Store");

        jSeparator1.setBackground(new java.awt.Color(229, 9, 20));
        jSeparator1.setForeground(new java.awt.Color(229, 9, 20));

        btnwinInicio.setBackground(new java.awt.Color(0, 0, 0));
        btnwinInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnwinInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnwinInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-outline.png"))); // NOI18N
        btnwinInicio.setText("Inicio");
        btnwinInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnwinInicio.setBorderPainted(false);
        btnwinInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnwinInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnwinInicio.setIconTextGap(10);
        btnwinInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwinInicioActionPerformed(evt);
            }
        });

        btnwinCatalogoPeliculas.setBackground(new java.awt.Color(0, 0, 0));
        btnwinCatalogoPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnwinCatalogoPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        btnwinCatalogoPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peliculas.png"))); // NOI18N
        btnwinCatalogoPeliculas.setText("Catálogo de películas");
        btnwinCatalogoPeliculas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnwinCatalogoPeliculas.setBorderPainted(false);
        btnwinCatalogoPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnwinCatalogoPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnwinCatalogoPeliculas.setIconTextGap(10);
        btnwinCatalogoPeliculas.setPreferredSize(new java.awt.Dimension(92, 26));
        btnwinCatalogoPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwinCatalogoPeliculasActionPerformed(evt);
            }
        });

        btnwinUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btnwinUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnwinUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnwinUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-multiple.png"))); // NOI18N
        btnwinUsuarios.setText("Usuarios");
        btnwinUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnwinUsuarios.setBorderPainted(false);
        btnwinUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnwinUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnwinUsuarios.setIconTextGap(10);
        btnwinUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwinUsuariosActionPerformed(evt);
            }
        });

        btnwinProcesos.setBackground(new java.awt.Color(0, 0, 0));
        btnwinProcesos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnwinProcesos.setForeground(new java.awt.Color(255, 255, 255));
        btnwinProcesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procesos.png"))); // NOI18N
        btnwinProcesos.setText("Procesos");
        btnwinProcesos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnwinProcesos.setBorderPainted(false);
        btnwinProcesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnwinProcesos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnwinProcesos.setIconTextGap(10);
        btnwinProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwinProcesosActionPerformed(evt);
            }
        });

        btnwinMantenimiento.setBackground(new java.awt.Color(0, 0, 0));
        btnwinMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnwinMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnwinMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mantenimiento.png"))); // NOI18N
        btnwinMantenimiento.setText("Mantenimiento");
        btnwinMantenimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnwinMantenimiento.setBorderPainted(false);
        btnwinMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnwinMantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnwinMantenimiento.setIconTextGap(10);
        btnwinMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwinMantenimientoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrar-sesion.png"))); // NOI18N
        btnCerrarSesion.setText("Salir del sistema");
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setIconTextGap(10);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnwinMantenimiento1.setBackground(new java.awt.Color(0, 0, 0));
        btnwinMantenimiento1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnwinMantenimiento1.setForeground(new java.awt.Color(255, 255, 255));
        btnwinMantenimiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file-chart.png"))); // NOI18N
        btnwinMantenimiento1.setText("Reportes");
        btnwinMantenimiento1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnwinMantenimiento1.setBorderPainted(false);
        btnwinMantenimiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnwinMantenimiento1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnwinMantenimiento1.setIconTextGap(10);
        btnwinMantenimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwinMantenimiento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnwinInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnwinCatalogoPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnwinUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnwinProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnwinMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnwinMantenimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnwinInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnwinCatalogoPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnwinUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnwinProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnwinMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnwinMantenimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.setEnabled(false);
        header.setPreferredSize(new java.awt.Dimension(744, 150));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navText.setForeground(new java.awt.Color(204, 204, 204));
        navText.setText("Administración/Control/Alquiler y Venta de Películas");
        header.add(navText, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 17, -1, -1));

        dateText.setForeground(new java.awt.Color(204, 204, 204));
        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");
        header.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 39, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(229, 9, 20));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseReleased(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        header.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 140, 40));

        content.setBackground(new java.awt.Color(20, 20, 20));
        content.setEnabled(false);
        content.setMinimumSize(new java.awt.Dimension(810, 430));
        content.setPreferredSize(new java.awt.Dimension(780, 430));
        content.setRequestFocusEnabled(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );

        mensaje.setText("Bienvenido a Movie Store");
        mensaje.setEnabled(false);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(mensaje)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(mensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnwinCatalogoPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwinCatalogoPeliculasActionPerformed
        ShowJPanel(new winCatalogoPeliculas());
        
        if (!btnwinCatalogoPeliculas.isEnabled()) {
        btnwinCatalogoPeliculas.setEnabled(true);
        
        btnwinInicio.setBackground(new Color(0x1565C0));
        btnwinCatalogoPeliculas.setBackground(new Color(0x000032));
        btnwinUsuarios.setBackground(new Color(0x1565C0));
        btnwinProcesos.setBackground(new Color(0x1565C0));
        btnwinMantenimiento.setBackground(new Color(0x1565C0));
        
            }
    }//GEN-LAST:event_btnwinCatalogoPeliculasActionPerformed

    private void btnwinInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwinInicioActionPerformed
        ShowJPanel(new winInicio()); 
    if (!btnwinInicio.isEnabled()) {
        btnwinInicio.setEnabled(true);
        btnwinInicio.setBackground(new Color(0x000000));
        btnwinCatalogoPeliculas.setBackground(new Color(0x1565C0));
        btnwinUsuarios.setBackground(new Color(0x1565C0));
        btnwinProcesos.setBackground(new Color(0x1565C0));
        btnwinMantenimiento.setBackground(new Color(0x1565C0)); 
        
    }
    }//GEN-LAST:event_btnwinInicioActionPerformed

    private void btnwinUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwinUsuariosActionPerformed
            ShowJPanel(new winUsuarios());
        if (!btnwinUsuarios.isEnabled()) {
        btnwinUsuarios.setEnabled(true);

        btnwinInicio.setBackground(new Color(0x1565C0));
        btnwinCatalogoPeliculas.setBackground(new Color(0x1565C0));
        btnwinUsuarios.setBackground(new Color(0x000032));
        btnwinProcesos.setBackground(new Color(0x1565C0));
        btnwinMantenimiento.setBackground(new Color(0x1565C0));        
        }
    }//GEN-LAST:event_btnwinUsuariosActionPerformed

    private void btnwinProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwinProcesosActionPerformed
        ShowJPanel(new winProcesos());
        if (!btnwinProcesos.isEnabled()) {
        btnwinProcesos.setEnabled(true);
       
        btnwinInicio.setBackground(new Color(0x1565C0));
        btnwinCatalogoPeliculas.setBackground(new Color(0x1565C0));
        btnwinUsuarios.setBackground(new Color(0x1565C0));
        btnwinProcesos.setBackground(new Color(0x000032));
        btnwinMantenimiento.setBackground(new Color(0x1565C0)); 
        }
    }//GEN-LAST:event_btnwinProcesosActionPerformed

    private void btnwinMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwinMantenimientoActionPerformed
       
        ShowJPanel(new winMantenimiento());
        if (!btnwinMantenimiento.isEnabled()) {
        btnwinMantenimiento.setEnabled(true);
        
        btnwinInicio.setBackground(new Color(0x1565C0));
        btnwinCatalogoPeliculas.setBackground(new Color(0x1565C0));
        btnwinUsuarios.setBackground(new Color(0x1565C0));
        btnwinProcesos.setBackground(new Color(0x1565C0));
        btnwinMantenimiento.setBackground(new Color(0x000032));
        }
    }//GEN-LAST:event_btnwinMantenimientoActionPerformed

    private void btnIniciarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesionMouseReleased

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        ShowJPanel(new winIniciarSesion());
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnwinMantenimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwinMantenimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnwinMantenimiento1ActionPerformed

    public static void main(String args[]) {
    FlatMaterialLighterIJTheme.setup();
    UIManager.put( "Button.arc", 999 );
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            DashboardUnlocked dashboard = new DashboardUnlocked();
            dashboard.setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    public javax.swing.JPanel background;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnwinCatalogoPeliculas;
    private javax.swing.JButton btnwinInicio;
    private javax.swing.JButton btnwinMantenimiento;
    private javax.swing.JButton btnwinMantenimiento1;
    private javax.swing.JButton btnwinProcesos;
    private javax.swing.JButton btnwinUsuarios;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel navText;
    // End of variables declaration//GEN-END:variables
}
