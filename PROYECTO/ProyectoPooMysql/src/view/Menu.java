package view;

import controller.Usuario;
import controller.services.ServicesUsuario;
import java.awt.Color;
import viewConfiguracion.ConfiguracionView;
import viewLogearseRegistrarse.Login;

/**
 *
 * @author Grupo RooMade
 */
public class Menu extends javax.swing.JFrame {
    private CrearDiseño PaginaDiseño;
    private Login login;
    private MisDiseños misDiseños;
    private RooMaking rooMaking;
    private ConfiguracionView configuracion;
    
    
    public Menu(){
        misDiseños = new MisDiseños();
        PaginaDiseño = new CrearDiseño();
        rooMaking = new RooMaking();
        configuracion = new ConfiguracionView();
        initComponents();
        
    }        
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Configuracion = new javax.swing.JButton();
        Ayuda = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NomUser = new javax.swing.JLabel();
        SaludoUsuario = new javax.swing.JLabel();
        SaludoUsuario1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextComentar = new javax.swing.JTextArea();
        Comentar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        MisDiseños = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        RooMaking = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        CrearDiseño = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(168, 209, 165));

        jPanel8.setBackground(new java.awt.Color(245, 245, 220));

        Configuracion.setBackground(new java.awt.Color(210, 180, 140));
        Configuracion.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Configuracion.setForeground(new java.awt.Color(255, 245, 255));
        Configuracion.setText("Configuración");
        Configuracion.setBorder(null);
        Configuracion.setBorderPainted(false);
        Configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Configuracion.setDefaultCapable(false);
        Configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfiguracionMouseExited(evt);
            }
        });
        Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionActionPerformed(evt);
            }
        });

        Ayuda.setBackground(new java.awt.Color(210, 180, 140));
        Ayuda.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Ayuda.setForeground(new java.awt.Color(255, 245, 255));
        Ayuda.setText("Ayuda");
        Ayuda.setBorder(null);
        Ayuda.setBorderPainted(false);
        Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AyudaMouseExited(evt);
            }
        });
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(210, 180, 140));
        Salir.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 245, 255));
        Salir.setText("Salir");
        Salir.setBorder(null);
        Salir.setBorderPainted(false);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setDefaultCapable(false);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatardefault_92824.png"))); // NOI18N

        NomUser.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        NomUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomUser.setText("TextoPrueba");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Ayuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Configuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NomUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(NomUser))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        SaludoUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        SaludoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        SaludoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaludoUsuario.setText("Hola USUARIO");
        SaludoUsuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SaludoUsuarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        SaludoUsuario1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        SaludoUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        SaludoUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaludoUsuario1.setText("Es un placer volver a verte!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SaludoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SaludoUsuario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(SaludoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(SaludoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 520, 340));

        jPanel5.setBackground(new java.awt.Color(245, 245, 220));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Comentarios:  (Nos esforzaremos en leerlos todos <3 ) ");

        TextComentar.setColumns(20);
        TextComentar.setForeground(new java.awt.Color(204, 204, 204));
        TextComentar.setLineWrap(true);
        TextComentar.setRows(5);
        TextComentar.setText("(Ingresa cualquier critcia, opinion o felicitaciones que tengas de la app hacia nosotros).");
        TextComentar.setWrapStyleWord(true);
        TextComentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextComentarMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TextComentar);

        Comentar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Comentar.setForeground(new java.awt.Color(153, 153, 153));
        Comentar.setText("Comentar");
        Comentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(Comentar)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comentar)
                .addGap(18, 18, 18))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 760, 150));

        jPanel6.setBackground(new java.awt.Color(126, 188, 137));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewLogearseRegistrarse/logochiquito.png"))); // NOI18N
        jLabel3.setText("RooMade");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1486504328-bullet-list-menu-lines-points-items-options_81334.png"))); // NOI18N
        jLabel1.setText("Menú");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(179, 179, 179))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        MisDiseños.setBackground(new java.awt.Color(245, 239, 218));
        MisDiseños.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        MisDiseños.setForeground(new java.awt.Color(153, 153, 153));
        MisDiseños.setText("Mis Diseños");
        MisDiseños.setBorder(null);
        MisDiseños.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MisDiseños.setOpaque(true);
        MisDiseños.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MisDiseñosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MisDiseñosMouseExited(evt);
            }
        });
        MisDiseños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisDiseñosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MisDiseños, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MisDiseños, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 100));

        jPanel4.setBackground(new java.awt.Color(162, 217, 206));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setText("¿Qué deseas hacer?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(14, 14, 14))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 50));

        RooMaking.setBackground(new java.awt.Color(245, 239, 218));
        RooMaking.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        RooMaking.setForeground(new java.awt.Color(153, 153, 153));
        RooMaking.setText("RooMaking");
        RooMaking.setBorder(null);
        RooMaking.setBorderPainted(false);
        RooMaking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RooMaking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RooMakingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RooMakingMouseExited(evt);
            }
        });
        RooMaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RooMakingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RooMaking, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RooMaking, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 100));

        CrearDiseño.setBackground(new java.awt.Color(245, 239, 218));
        CrearDiseño.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        CrearDiseño.setForeground(new java.awt.Color(153, 153, 153));
        CrearDiseño.setText("Crear Diseño");
        CrearDiseño.setBorder(null);
        CrearDiseño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearDiseño.setDefaultCapable(false);
        CrearDiseño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrearDiseñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearDiseñoMouseExited(evt);
            }
        });
        CrearDiseño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearDiseñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CrearDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrearDiseño, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearDiseñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearDiseñoActionPerformed
        //PaginaDiseño = new CrearDiseño();
        PaginaDiseño.setVisible(true);
        PaginaDiseño.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_CrearDiseñoActionPerformed

    private void MisDiseñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MisDiseñosActionPerformed
        //misDiseños = new MisDiseños();
        misDiseños.setVisible(true);
        misDiseños.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_MisDiseñosActionPerformed

    private void ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionActionPerformed
        //configuracion = new ConfiguracionView();
        configuracion.setVisible(true);
        configuracion.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_ConfiguracionActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        login  = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_SalirActionPerformed

    private void RooMakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RooMakingActionPerformed
        rooMaking = new RooMaking();
        rooMaking.setVisible(true);
        rooMaking.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_RooMakingActionPerformed

    private void ComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentarActionPerformed
        if(TextComentar.getText().equals("")){
            TextComentar.setForeground(new java.awt.Color(204, 204, 204));
            TextComentar.setText("(Ingresa cualquier critcia, opinion o felicitaciones que tengas de la app hacia nosotros).");
            javax.swing.JOptionPane.showMessageDialog(this, "No se registra ningun comentario. ");
        }
        
        else{
            TextComentar.setForeground(new java.awt.Color(204, 204, 204));
            TextComentar.setText("(Ingresa cualquier critcia, opinion o felicitaciones que tengas de la app hacia nosotros).");
            javax.swing.JOptionPane.showMessageDialog(this, "Comentario registrado. Gracias. ");
        }
    }//GEN-LAST:event_ComentarActionPerformed

    private void TextComentarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextComentarMousePressed
        if(TextComentar.getText().equals("(Ingresa cualquier critcia, opinion o felicitaciones que tengas de la app hacia nosotros).")){
            TextComentar.setText("");
            TextComentar.setForeground(Color.black);
        }
    }//GEN-LAST:event_TextComentarMousePressed

    private void RooMakingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RooMakingMouseEntered
        RooMaking.setBackground(new Color(245,245,220));
        RooMaking.setForeground(Color.BLACK);
    }//GEN-LAST:event_RooMakingMouseEntered

    private void MisDiseñosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MisDiseñosMouseEntered
        MisDiseños.setBackground(new Color(245,245,220));
        MisDiseños.setForeground(Color.BLACK);
    }//GEN-LAST:event_MisDiseñosMouseEntered

    private void CrearDiseñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearDiseñoMouseEntered
        CrearDiseño.setBackground(new Color(245,245,220));
        CrearDiseño.setForeground(Color.BLACK);
    }//GEN-LAST:event_CrearDiseñoMouseEntered

    private void RooMakingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RooMakingMouseExited
        RooMaking.setBackground(new Color(245,239,218));
        RooMaking.setForeground(Color.GRAY);
    }//GEN-LAST:event_RooMakingMouseExited

    private void CrearDiseñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearDiseñoMouseExited
        CrearDiseño.setBackground(new Color(245,239,218));
        CrearDiseño.setForeground(Color.GRAY);
    }//GEN-LAST:event_CrearDiseñoMouseExited

    private void MisDiseñosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MisDiseñosMouseExited
        MisDiseños.setBackground(new Color(245,239,218));
        MisDiseños.setForeground(Color.GRAY);
    }//GEN-LAST:event_MisDiseñosMouseExited

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
            javax.swing.JOptionPane.showMessageDialog(this, "Para más info comunicate con nosotros. ");
    }//GEN-LAST:event_AyudaActionPerformed

    private void AyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseEntered
        Ayuda.setBackground(new Color(220,185,140));     
    }//GEN-LAST:event_AyudaMouseEntered

    private void AyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseExited
        Ayuda.setBackground(new Color(210,180,140));
    }//GEN-LAST:event_AyudaMouseExited

    private void ConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionMouseEntered
        Configuracion.setBackground(new Color(220,185,140));     
    }//GEN-LAST:event_ConfiguracionMouseEntered

    private void ConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionMouseExited
        Configuracion.setBackground(new Color(210,180,140));     
    }//GEN-LAST:event_ConfiguracionMouseExited

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(new Color(220,185,140));     
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(new Color(210,180,140));     
    }//GEN-LAST:event_SalirMouseExited

    private void SaludoUsuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SaludoUsuarioAncestorAdded
        ServicesUsuario servUsuario = new ServicesUsuario();
        SaludoUsuario.setText("Hola "+ servUsuario.getNombres(ServicesUsuario.getUsuario()) );
        NomUser.setText(ServicesUsuario.getUsuario());
    }//GEN-LAST:event_SaludoUsuarioAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ayuda;
    private javax.swing.JButton Comentar;
    private javax.swing.JButton Configuracion;
    private javax.swing.JButton CrearDiseño;
    private javax.swing.JButton MisDiseños;
    private javax.swing.JLabel NomUser;
    private javax.swing.JButton RooMaking;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel SaludoUsuario;
    private javax.swing.JLabel SaludoUsuario1;
    private javax.swing.JTextArea TextComentar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
