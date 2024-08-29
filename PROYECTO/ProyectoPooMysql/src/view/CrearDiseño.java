package view;

import controller.implement.Item;
import controller.implement.Room;
import controller.services.ServicesItem;
import controller.services.ServicesRoom;
import controller.services.ServicesUsuario;
import java.awt.Color;

public class CrearDiseño extends javax.swing.JFrame {
    private Integer indice;
    ServicesItem servItem = new ServicesItem();
    ServicesRoom servRoom = new ServicesRoom();

    public CrearDiseño() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        textoCrearDiseño = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        backPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        TextoPregunta1 = new javax.swing.JLabel();
        TextoPregunta2 = new javax.swing.JLabel();
        ListaDesplegable1 = new javax.swing.JComboBox<>();
        panelInterior = new javax.swing.JPanel();
        textoBase = new javax.swing.JLabel();
        textoAltura = new javax.swing.JLabel();
        textoProfunidad = new javax.swing.JLabel();
        TextBase = new javax.swing.JTextField();
        TextProfundidad = new javax.swing.JTextField();
        TextAltura = new javax.swing.JTextField();
        RegistrarObjeto = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        TextoPregunta3 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSuperior.setBackground(new java.awt.Color(162, 217, 206));

        textoCrearDiseño.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        textoCrearDiseño.setForeground(new java.awt.Color(255, 245, 255));
        textoCrearDiseño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCrearDiseño.setText("Crear Diseño");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addComponent(textoCrearDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoCrearDiseño, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel1.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 480, 90));

        panelCentral.setBackground(new java.awt.Color(170, 217, 180));

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 510));

        backPanel.setBackground(new java.awt.Color(170, 217, 180));

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 160, 510));

        mainPanel.setBackground(new java.awt.Color(245, 245, 220));

        TextoPregunta1.setBackground(new java.awt.Color(255, 255, 255));
        TextoPregunta1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        TextoPregunta1.setForeground(new java.awt.Color(102, 102, 102));
        TextoPregunta1.setText("¿Que tipo de objeto es?:");

        TextoPregunta2.setBackground(new java.awt.Color(255, 255, 255));
        TextoPregunta2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        TextoPregunta2.setForeground(new java.awt.Color(102, 102, 102));
        TextoPregunta2.setText("¿Cuáles son las dimensiones del objeto?:");

        ListaDesplegable1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ListaDesplegable1.setForeground(new java.awt.Color(153, 153, 153));
        ListaDesplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elije que quieres crear:", "Room", "Item" }));
        ListaDesplegable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaDesplegable1MouseClicked(evt);
            }
        });
        ListaDesplegable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDesplegable1ActionPerformed(evt);
            }
        });

        panelInterior.setBackground(new java.awt.Color(245, 245, 234));
        panelInterior.setForeground(new java.awt.Color(204, 255, 204));

        textoBase.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        textoBase.setForeground(new java.awt.Color(102, 102, 102));
        textoBase.setText("Base:");

        textoAltura.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        textoAltura.setForeground(new java.awt.Color(102, 102, 102));
        textoAltura.setText("Altura:");

        textoProfunidad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        textoProfunidad.setForeground(new java.awt.Color(102, 102, 102));
        textoProfunidad.setText("Profundidad:");

        TextBase.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        TextBase.setForeground(new java.awt.Color(153, 153, 153));
        TextBase.setText("(Metros)");
        TextBase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextBaseMousePressed(evt);
            }
        });

        TextProfundidad.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        TextProfundidad.setForeground(new java.awt.Color(153, 153, 153));
        TextProfundidad.setText("(Metros)");
        TextProfundidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextProfundidadMousePressed(evt);
            }
        });

        TextAltura.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        TextAltura.setForeground(new java.awt.Color(153, 153, 153));
        TextAltura.setText("(Metros)");
        TextAltura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextAlturaMousePressed(evt);
            }
        });

        RegistrarObjeto.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        RegistrarObjeto.setForeground(new java.awt.Color(153, 153, 153));
        RegistrarObjeto.setText("Guardar");
        RegistrarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarObjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInteriorLayout = new javax.swing.GroupLayout(panelInterior);
        panelInterior.setLayout(panelInteriorLayout);
        panelInteriorLayout.setHorizontalGroup(
            panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteriorLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInteriorLayout.createSequentialGroup()
                        .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoAltura)
                            .addComponent(textoBase))
                        .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInteriorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInteriorLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(TextBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelInteriorLayout.createSequentialGroup()
                        .addComponent(textoProfunidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181))
            .addGroup(panelInteriorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(RegistrarObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelInteriorLayout.setVerticalGroup(
            panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteriorLayout.createSequentialGroup()
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInteriorLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(TextBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInteriorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoBase)))
                .addGap(14, 14, 14)
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAltura)
                    .addComponent(TextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoProfunidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(RegistrarObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        botonVolver.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(153, 153, 153));
        botonVolver.setText("Volver...");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        TextoPregunta3.setBackground(new java.awt.Color(255, 255, 255));
        TextoPregunta3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        TextoPregunta3.setForeground(new java.awt.Color(102, 102, 102));
        TextoPregunta3.setText("¿Que nombre tendrá?:");

        TextNombre.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        TextNombre.setForeground(new java.awt.Color(153, 153, 153));
        TextNombre.setText("Nombre");
        TextNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNombreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolver)
                    .addComponent(panelInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoPregunta2)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ListaDesplegable1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoPregunta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoPregunta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextNombre))))
                .addGap(30, 30, 30))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoPregunta1)
                    .addComponent(TextoPregunta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListaDesplegable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TextoPregunta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVolver)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 480, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarObjetoActionPerformed
        if(indice==2 && !"".equals(TextNombre.getText()) && !"".equals(TextBase.getText()) && !"".equals(TextAltura.getText()) && !"".equals(TextProfundidad.getText())){
            Item item = new Item(TextNombre.getText(), Double.parseDouble(TextBase.getText()), Double.parseDouble(TextAltura.getText()), Double.parseDouble(TextProfundidad.getText()));
            servItem.guardar_item(ServicesUsuario.getUsuario(), item);
            ServicesItem.setItems(item);
            javax.swing.JOptionPane.showMessageDialog(this, "¡Tu item ha sido guardado!");
        }else if (indice==1 && !"".equals(TextNombre.getText()) && !"".equals(TextBase.getText()) && !"".equals(TextAltura.getText()) && !"".equals(TextProfundidad.getText())){
            Room room = new Room(TextNombre.getText(), Double.parseDouble(TextBase.getText()), Double.parseDouble(TextAltura.getText()), Double.parseDouble(TextProfundidad.getText()));
            servRoom.guardar_diseño(ServicesUsuario.getUsuario(), room);
            ServicesRoom.setRooms(room);
            javax.swing.JOptionPane.showMessageDialog(this, "¡Tu Room ha sido guardada!");
        }else{javax.swing.JOptionPane.showMessageDialog(this, "Has dejado un valo nulo");}
    }//GEN-LAST:event_RegistrarObjetoActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void ListaDesplegable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDesplegable1ActionPerformed
        
    }//GEN-LAST:event_ListaDesplegable1ActionPerformed

    private void TextNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNombreMousePressed
        if(TextNombre.getText().equals("Nombre")){
            TextNombre.setText("");
            TextNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_TextNombreMousePressed

    private void ListaDesplegable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaDesplegable1MouseClicked
        indice = ListaDesplegable1.getSelectedIndex();
        System.out.println(indice + ServicesUsuario.getUsuario());
    }//GEN-LAST:event_ListaDesplegable1MouseClicked

    private void TextBaseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBaseMousePressed
        if(TextBase.getText().equals("(Metros)")){
            TextBase.setText("");
            TextBase.setForeground(Color.black);
        }
    }//GEN-LAST:event_TextBaseMousePressed

    private void TextAlturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAlturaMousePressed
        if(TextAltura.getText().equals("(Metros)")){
            TextAltura.setText("");
            TextAltura.setForeground(Color.black);
        }
    }//GEN-LAST:event_TextAlturaMousePressed

    private void TextProfundidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextProfundidadMousePressed
        if(TextProfundidad.getText().equals("(Metros)")){
            TextProfundidad.setText("");
            TextProfundidad.setForeground(Color.black);
        }
    }//GEN-LAST:event_TextProfundidadMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaDesplegable1;
    private javax.swing.JButton RegistrarObjeto;
    private javax.swing.JTextField TextAltura;
    private javax.swing.JTextField TextBase;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextProfundidad;
    private javax.swing.JLabel TextoPregunta1;
    private javax.swing.JLabel TextoPregunta2;
    private javax.swing.JLabel TextoPregunta3;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelInterior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel textoAltura;
    private javax.swing.JLabel textoBase;
    private javax.swing.JLabel textoCrearDiseño;
    private javax.swing.JLabel textoProfunidad;
    // End of variables declaration//GEN-END:variables
}
