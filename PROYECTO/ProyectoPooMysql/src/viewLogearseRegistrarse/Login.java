package viewLogearseRegistrarse;

import controller.Usuario;
import controller.services.ServicesUsuario;
import java.awt.Color;
import view.Menu;

/**
 *
 * @author julia
 */
public class Login extends javax.swing.JFrame {
    private Menu menu;
    public static Usuario usuario;
    public Login() {
        initComponents();   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        panelVerde = new javax.swing.JPanel();
        textoRoomade = new javax.swing.JLabel();
        textoSlogan = new javax.swing.JLabel();
        panelInteriorCafe = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        TextNuevaContra = new javax.swing.JTextField();
        TextConfirmNuevaContra = new javax.swing.JTextField();
        TextNuevoNombre = new javax.swing.JTextField();
        BotonRegistro = new javax.swing.JButton();
        TextNuevoUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TextNuevoCorreo = new javax.swing.JTextField();
        textoRegistrarse = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        roomadeIcon = new javax.swing.JLabel();
        panelCafe = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TextContraseña = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TextUsuario = new javax.swing.JTextField();
        textoIniciarSesion = new javax.swing.JLabel();
        BotonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVerde.setBackground(new java.awt.Color(126, 188, 137));

        textoRoomade.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        textoRoomade.setForeground(new java.awt.Color(255, 245, 255));
        textoRoomade.setText("ROOMADE");

        textoSlogan.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        textoSlogan.setForeground(new java.awt.Color(255, 245, 255));
        textoSlogan.setText("¡Tu morada es nuestra inspiración!, ademas transforma tu interior :).");

        panelInteriorCafe.setBackground(new java.awt.Color(245, 245, 220));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        TextNuevaContra.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextNuevaContra.setForeground(new java.awt.Color(153, 153, 153));
        TextNuevaContra.setText("Contraseña");
        TextNuevaContra.setBorder(null);
        TextNuevaContra.setCaretColor(new java.awt.Color(204, 204, 204));
        TextNuevaContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNuevaContraMousePressed(evt);
            }
        });
        TextNuevaContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNuevaContraActionPerformed(evt);
            }
        });
        TextNuevaContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNuevaContraKeyTyped(evt);
            }
        });

        TextConfirmNuevaContra.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextConfirmNuevaContra.setForeground(new java.awt.Color(153, 153, 153));
        TextConfirmNuevaContra.setText("Confirmar Contraseña");
        TextConfirmNuevaContra.setBorder(null);
        TextConfirmNuevaContra.setCaretColor(new java.awt.Color(204, 204, 204));
        TextConfirmNuevaContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextConfirmNuevaContraMousePressed(evt);
            }
        });

        TextNuevoNombre.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextNuevoNombre.setForeground(new java.awt.Color(153, 153, 153));
        TextNuevoNombre.setText("Nombre Completo");
        TextNuevoNombre.setBorder(null);
        TextNuevoNombre.setCaretColor(new java.awt.Color(204, 204, 204));
        TextNuevoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNuevoNombreMousePressed(evt);
            }
        });
        TextNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNuevoNombreActionPerformed(evt);
            }
        });
        TextNuevoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNuevoNombreKeyTyped(evt);
            }
        });

        BotonRegistro.setBackground(new java.awt.Color(210, 180, 140));
        BotonRegistro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        BotonRegistro.setForeground(new java.awt.Color(255, 245, 255));
        BotonRegistro.setText("Registrar");
        BotonRegistro.setBorder(null);
        BotonRegistro.setBorderPainted(false);
        BotonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });

        TextNuevoUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextNuevoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        TextNuevoUsuario.setText("Nuevo Usuario");
        TextNuevoUsuario.setBorder(null);
        TextNuevoUsuario.setCaretColor(new java.awt.Color(204, 204, 204));
        TextNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNuevoUsuarioMousePressed(evt);
            }
        });
        TextNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNuevoUsuarioActionPerformed(evt);
            }
        });
        TextNuevoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNuevoUsuarioKeyTyped(evt);
            }
        });

        jSeparator1.setEnabled(false);

        TextNuevoCorreo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextNuevoCorreo.setForeground(new java.awt.Color(153, 153, 153));
        TextNuevoCorreo.setText("Correo Electrónico");
        TextNuevoCorreo.setBorder(null);
        TextNuevoCorreo.setCaretColor(new java.awt.Color(204, 204, 204));
        TextNuevoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNuevoCorreoMousePressed(evt);
            }
        });

        textoRegistrarse.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        textoRegistrarse.setForeground(new java.awt.Color(102, 102, 102));
        textoRegistrarse.setText("¿No tienes Usuario? Registrate:");

        jSeparator4.setEnabled(false);

        jSeparator5.setEnabled(false);

        jSeparator6.setEnabled(false);

        jSeparator7.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TextConfirmNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(textoRegistrarse)
                .addGap(18, 18, 18)
                .addComponent(TextNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextConfirmNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(BotonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInteriorCafeLayout = new javax.swing.GroupLayout(panelInteriorCafe);
        panelInteriorCafe.setLayout(panelInteriorCafeLayout);
        panelInteriorCafeLayout.setHorizontalGroup(
            panelInteriorCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteriorCafeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInteriorCafeLayout.setVerticalGroup(
            panelInteriorCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteriorCafeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        roomadeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewLogearseRegistrarse/logochiquito.png"))); // NOI18N

        javax.swing.GroupLayout panelVerdeLayout = new javax.swing.GroupLayout(panelVerde);
        panelVerde.setLayout(panelVerdeLayout);
        panelVerdeLayout.setHorizontalGroup(
            panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelVerdeLayout.createSequentialGroup()
                        .addComponent(textoRoomade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roomadeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoSlogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInteriorCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelVerdeLayout.setVerticalGroup(
            panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoRoomade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomadeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textoSlogan)
                .addGap(18, 18, 18)
                .addComponent(panelInteriorCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(panelVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        panelCafe.setBackground(new java.awt.Color(245, 245, 220));
        panelCafe.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TextContraseña.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        TextContraseña.setForeground(new java.awt.Color(153, 153, 153));
        TextContraseña.setText("**********");
        TextContraseña.setToolTipText("");
        TextContraseña.setBorder(null);
        TextContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextContraseñaMousePressed(evt);
            }
        });
        TextContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextContraseñaActionPerformed(evt);
            }
        });

        TextUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextUsuario.setForeground(new java.awt.Color(153, 153, 153));
        TextUsuario.setText("Usuario");
        TextUsuario.setBorder(null);
        TextUsuario.setCaretColor(new java.awt.Color(204, 204, 204));
        TextUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextUsuarioMousePressed(evt);
            }
        });
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });

        textoIniciarSesion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        textoIniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        textoIniciarSesion.setText("Iniciar Sesión:");

        BotonLogin.setBackground(new java.awt.Color(210, 180, 140));
        BotonLogin.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        BotonLogin.setForeground(new java.awt.Color(255, 245, 255));
        BotonLogin.setText("Login");
        BotonLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextContraseña)
                                .addComponent(jSeparator3)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(textoIniciarSesion)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(textoIniciarSesion)
                .addGap(31, 31, 31)
                .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar_construction_worker_job_man_person_icon_221367.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCafeLayout = new javax.swing.GroupLayout(panelCafe);
        panelCafe.setLayout(panelCafeLayout);
        panelCafeLayout.setHorizontalGroup(
            panelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCafeLayout.createSequentialGroup()
                .addGroup(panelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCafeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCafeLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelCafeLayout.setVerticalGroup(
            panelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCafeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        Background.add(panelCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 300, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void TextContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextContraseñaActionPerformed

    private void TextUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextUsuarioMousePressed
        if(TextUsuario.getText().equals("Usuario")){
            TextUsuario.setText("");
            TextUsuario.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextUsuarioMousePressed

    private void TextContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextContraseñaMousePressed
        if(String.valueOf(TextContraseña.getPassword()).equals("**********")){
            TextContraseña.setText("");
            TextContraseña.setForeground(Color.black);
        }
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
        
    }//GEN-LAST:event_TextContraseñaMousePressed

    private void TextNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNuevoNombreActionPerformed

    private void TextNuevoNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNuevoNombreMousePressed
        if(TextNuevoNombre.getText().equals("Nombre Completo")){
            TextNuevoNombre.setText("");
            TextNuevoNombre.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextNuevoNombreMousePressed

    private void TextNuevoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNuevoUsuarioMousePressed
        if(TextNuevoUsuario.getText().equals("Nuevo Usuario")){
            TextNuevoUsuario.setText("");
            TextNuevoUsuario.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextNuevoUsuarioMousePressed

    private void TextConfirmNuevaContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextConfirmNuevaContraMousePressed
        if(TextConfirmNuevaContra.getText().equals("Confirmar Contraseña")){
            TextConfirmNuevaContra.setText("");
            TextConfirmNuevaContra.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextConfirmNuevaContraMousePressed

    private void TextNuevoCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNuevoCorreoMousePressed
        if(TextNuevoCorreo.getText().equals("Correo Electrónico")){
            TextNuevoCorreo.setText("");
            TextNuevoCorreo.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextNuevoCorreoMousePressed

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        ServicesUsuario servUsuario = new ServicesUsuario();
        if(TextNuevaContra.getText().equals(TextConfirmNuevaContra.getText())){
            Usuario newuser = new Usuario(TextNuevoUsuario.getText(), TextNuevaContra.getText(), TextNuevoCorreo.getText(), TextNuevoNombre.getText());
            servUsuario.guardar_usuario(newuser);
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario Registrado!");
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        
    }//GEN-LAST:event_BotonRegistroActionPerformed

    private void TextNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNuevoUsuarioActionPerformed

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed
        ServicesUsuario servUsuario = new ServicesUsuario();
        if(servUsuario.Info_UsuarioLogin(TextUsuario.getText(), String.valueOf(TextContraseña.getPassword()))){
            usuario = new Usuario(TextUsuario.getText(), String.valueOf(TextContraseña.getPassword()), servUsuario.getEmail(TextUsuario.getText()), servUsuario.getNombres(TextUsuario.getText()));
            ServicesUsuario.setUsuario(usuario.getUsername());
            javax.swing.JOptionPane.showMessageDialog(this, "Sesión Iniciada");
            menu = new Menu();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            this.dispose();
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrectos. ");
        }

    }//GEN-LAST:event_BotonLoginActionPerformed

    private void TextNuevaContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNuevaContraMousePressed
        if(TextNuevaContra.getText().equals("Contraseña")){
            TextNuevaContra.setText("");
            TextNuevaContra.setForeground(Color.black);
        }

        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }

        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }

        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }

        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }

        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }

        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }

    }//GEN-LAST:event_TextNuevaContraMousePressed

    private void TextNuevoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNuevoNombreKeyTyped
        if(TextNuevoNombre.getText().equals("Nombre Completo")){
            TextNuevoNombre.setText("");
            TextNuevoNombre.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_TextNuevoNombreKeyTyped

    private void TextNuevoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNuevoUsuarioKeyTyped
        if(TextNuevoUsuario.getText().equals("Nuevo Usuario")){
            TextNuevoUsuario.setText("");
            TextNuevoUsuario.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_TextNuevoUsuarioKeyTyped

    private void TextNuevaContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNuevaContraKeyTyped
        if(TextNuevaContra.getText().equals("Contraseña")){
            TextNuevaContra.setText("");
            TextNuevaContra.setForeground(Color.black);
        }

        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }

        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }

        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }

        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }

        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }

        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }                                      
    }//GEN-LAST:event_TextNuevaContraKeyTyped

    private void TextNuevaContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNuevaContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNuevaContraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JTextField TextConfirmNuevaContra;
    private javax.swing.JPasswordField TextContraseña;
    private javax.swing.JTextField TextNuevaContra;
    private javax.swing.JTextField TextNuevoCorreo;
    private javax.swing.JTextField TextNuevoNombre;
    private javax.swing.JTextField TextNuevoUsuario;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel panelCafe;
    private javax.swing.JPanel panelInteriorCafe;
    private javax.swing.JPanel panelVerde;
    private javax.swing.JLabel roomadeIcon;
    private javax.swing.JLabel textoIniciarSesion;
    private javax.swing.JLabel textoRegistrarse;
    private javax.swing.JLabel textoRoomade;
    private javax.swing.JLabel textoSlogan;
    // End of variables declaration//GEN-END:variables
}
