package GUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaTorneo16 extends javax.swing.JFrame {

    public VentanaTorneo16(int nEquipos) {
        initComponents();
        ImageIcon wildRiftImage = new ImageIcon("C:\\Users\\deive\\Documents\\NetBeansProjects\\WildRiftProject\\src\\GUI\\WilRift.jpg");
        Icon myWildRiftIcon = new ImageIcon(wildRiftImage.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH));
        jLabel1.setIcon(myWildRiftIcon);
        this.setLocationRelativeTo(null);
        this.repaint();
        this.setResizable(false);
        jButton1.setFocusable(false);
        jButton2.setFocusable(false);
        int[] lblEnXArray = new int[calcularNCajas(nEquipos)];
        int[] lblEnYArray = new int[calcularNCajas(nEquipos)];
        int[] lblWidthArray = new int[calcularNCajas(nEquipos)];
        int[] lblHeightArray = new int[calcularNCajas(nEquipos)];
        generarCajas(nEquipos, lblEnXArray, lblEnYArray, lblWidthArray, lblHeightArray);
        jPanel3.setOpaque(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
        jButton23.setVisible(false);
        jButton24.setVisible(false);
        jButton25.setVisible(false);
        jButton26.setVisible(false);
        jButton27.setVisible(false);
        jButton28.setVisible(false);
        jButton29.setVisible(false);
        jButton30.setVisible(false);
        jButton31.setVisible(false);
        jButton32.setVisible(false);
        jLabel2.setText(VentanaCreacionTorneo2.nombreDeEquipo[0].getText());
        jLabel3.setText(VentanaCreacionTorneo2.nombreDeEquipo[1].getText());
        jLabel4.setText(VentanaCreacionTorneo2.nombreDeEquipo[2].getText());
        jLabel5.setText(VentanaCreacionTorneo2.nombreDeEquipo[3].getText());
        jLabel6.setText(VentanaCreacionTorneo2.nombreDeEquipo[4].getText());
        jLabel7.setText(VentanaCreacionTorneo2.nombreDeEquipo[5].getText());
        jLabel8.setText(VentanaCreacionTorneo2.nombreDeEquipo[6].getText());
        jLabel9.setText(VentanaCreacionTorneo2.nombreDeEquipo[7].getText());
        jLabel10.setText(VentanaCreacionTorneo2.nombreDeEquipo[8].getText());
        jLabel11.setText(VentanaCreacionTorneo2.nombreDeEquipo[9].getText());
        jLabel12.setText(VentanaCreacionTorneo2.nombreDeEquipo[10].getText());
        jLabel13.setText(VentanaCreacionTorneo2.nombreDeEquipo[11].getText());
        jLabel14.setText(VentanaCreacionTorneo2.nombreDeEquipo[12].getText());
        jLabel15.setText(VentanaCreacionTorneo2.nombreDeEquipo[13].getText());
        jLabel16.setText(VentanaCreacionTorneo2.nombreDeEquipo[14].getText());
        jLabel17.setText(VentanaCreacionTorneo2.nombreDeEquipo[15].getText());
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);
        jLabel32.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, -1, -1));

        jButton2.setText("Menú de Inicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 720, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jButton3.setText("Ganador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(0, 0, 60, 24);

        jButton4.setText("Ganador");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(86, 0, 60, 24);

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(176, 0, 57, 24);

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(260, 0, 57, 24);

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(347, 0, 57, 24);

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(434, 0, 57, 24);

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(521, 0, 57, 24);

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(608, 0, 64, 24);

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(695, 0, 64, 24);

        jButton12.setText("jButton12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12);
        jButton12.setBounds(781, 0, 64, 24);

        jButton13.setText("jButton13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13);
        jButton13.setBounds(868, 0, 64, 24);

        jButton14.setText("jButton14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14);
        jButton14.setBounds(955, 0, 64, 24);

        jButton15.setText("jButton15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15);
        jButton15.setBounds(1042, 0, 64, 24);

        jButton16.setText("jButton16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16);
        jButton16.setBounds(1129, 0, 64, 24);

        jButton17.setText("jButton17");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17);
        jButton17.setBounds(1216, 0, 64, 24);

        jButton18.setText("jButton18");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18);
        jButton18.setBounds(1303, 0, 64, 24);

        jButton19.setText("jButton19");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19);
        jButton19.setBounds(43, 156, 64, 24);

        jButton20.setText("jButton20");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20);
        jButton20.setBounds(215, 156, 64, 24);

        jButton21.setText("jButton21");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21);
        jButton21.setBounds(389, 156, 64, 24);

        jButton22.setText("jButton22");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton22);
        jButton22.setBounds(563, 156, 64, 24);

        jButton23.setText("jButton23");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton23);
        jButton23.setBounds(737, 156, 64, 24);

        jButton24.setText("jButton24");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton24);
        jButton24.setBounds(911, 156, 64, 24);

        jButton25.setText("jButton25");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton25);
        jButton25.setBounds(1085, 156, 64, 24);

        jButton26.setText("jButton26");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton26);
        jButton26.setBounds(1259, 156, 64, 24);

        jButton27.setText("jButton27");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton27);
        jButton27.setBounds(129, 312, 64, 24);

        jButton28.setText("jButton28");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton28);
        jButton28.setBounds(473, 312, 64, 24);

        jButton29.setText("jButton29");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton29);
        jButton29.setBounds(821, 312, 64, 24);

        jButton30.setText("jButton30");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton30);
        jButton30.setBounds(1169, 312, 64, 24);

        jButton31.setText("jButton31");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton31);
        jButton31.setBounds(301, 468, 64, 24);

        jButton32.setText("jButton32");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton32);
        jButton32.setBounds(989, 468, 64, 24);

        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 70, 41, 16);

        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(110, 70, 41, 16);

        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(200, 70, 41, 16);

        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(280, 70, 41, 16);

        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(360, 70, 41, 16);

        jLabel7.setText("jLabel7");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(460, 70, 41, 16);

        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(550, 70, 41, 16);

        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(630, 70, 41, 16);

        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(720, 70, 48, 16);

        jLabel11.setText("jLabel11");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(810, 70, 48, 16);

        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(890, 70, 48, 16);

        jLabel13.setText("jLabel13");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(980, 70, 48, 16);

        jLabel14.setText("jLabel14");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(1070, 70, 48, 16);

        jLabel15.setText("jLabel15");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(1160, 70, 48, 16);

        jLabel16.setText("jLabel16");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(1240, 70, 48, 16);

        jLabel17.setText("jLabel17");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(1330, 70, 48, 16);

        jLabel18.setText("jLabel18");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(70, 230, 48, 16);

        jLabel19.setText("jLabel19");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(240, 230, 48, 16);

        jLabel20.setText("jLabel20");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(410, 230, 48, 16);

        jLabel21.setText("jLabel21");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(590, 230, 48, 16);

        jLabel22.setText("jLabel22");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(760, 230, 48, 16);

        jLabel23.setText("jLabel23");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(940, 230, 48, 16);

        jLabel24.setText("jLabel24");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(1110, 230, 48, 16);

        jLabel25.setText("jLabel25");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(1290, 230, 48, 16);

        jLabel26.setText("jLabel26");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(160, 390, 48, 16);

        jLabel27.setText("jLabel27");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(510, 390, 48, 16);

        jLabel28.setText("jLabel28");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(860, 390, 48, 16);

        jLabel29.setText("jLabel29");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(1200, 390, 48, 16);

        jLabel30.setText("jLabel30");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(650, 710, 48, 16);

        jLabel31.setText("jLabel31");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(330, 540, 48, 16);

        jLabel32.setText("jLabel32");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(1020, 540, 48, 16);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean verificador1 = false, verificador2 = false, verificador3 = false, verificador4 = false, verificador5 = false, verificador6 = false, verificador7 = false, verificador8 = false;
    boolean verificador9 = false, verificador10 = false, verificador11 = false, verificador12 = false;
    boolean verificador13 = false, verificador14 =false;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaCreacionTorneo2 volverVentanaCreacionTorneo2 = new VentanaCreacionTorneo2(Integer.parseInt(VentanaCreacionTorneo.nEquipos.getText()));
        volverVentanaCreacionTorneo2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaMenuInicio volverVentanaMenuInicio = new VentanaMenuInicio();
        volverVentanaMenuInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton19.setVisible(true);
        jLabel18.setText(jLabel2.getText());
        jLabel18.setVisible(true);
        verificador1 = true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton19.setVisible(true);
        jLabel18.setText(jLabel3.getText());
        jLabel18.setVisible(true);
        verificador1 = true;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton20.setVisible(true);
        jLabel19.setText(jLabel4.getText());
        jLabel19.setVisible(true);
        verificador2 = true;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton20.setVisible(true);
        jLabel19.setText(jLabel5.getText());
        jLabel19.setVisible(true);
        verificador2 = true;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton21.setVisible(true);
        jLabel20.setText(jLabel6.getText());
        jLabel20.setVisible(true);
        verificador3 = true;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton21.setVisible(true);
        jLabel20.setText(jLabel7.getText());
        jLabel20.setVisible(true);
        verificador3 = true;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton22.setVisible(true);
        jLabel21.setText(jLabel8.getText());
        jLabel21.setVisible(true);
        verificador4 = true;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton22.setVisible(true);
        jLabel21.setText(jLabel9.getText());
        jLabel21.setVisible(true);
        verificador4 = true;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton23.setVisible(true);
        jLabel22.setText(jLabel10.getText());
        jLabel22.setVisible(true);
        verificador5 = true;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton23.setVisible(true);
        jLabel22.setText(jLabel11.getText());
        jLabel22.setVisible(true);
        verificador5 = true;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton24.setVisible(true);
        jLabel23.setText(jLabel12.getText());
        jLabel23.setVisible(true);
        verificador6 = true;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton24.setVisible(true);
        jLabel23.setText(jLabel13.getText());
        jLabel23.setVisible(true);
        verificador6 = true;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton25.setVisible(true);
        jLabel24.setText(jLabel14.getText());
        jLabel24.setVisible(true);
        verificador7 = true;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton25.setVisible(true);
        jLabel24.setText(jLabel15.getText());
        jLabel24.setVisible(true);
        verificador7 = true;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton26.setVisible(true);
        jLabel25.setText(jLabel16.getText());
        jLabel25.setVisible(true);
        verificador8 = true;
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton26.setVisible(true);
        jLabel25.setText(jLabel17.getText());
        jLabel25.setVisible(true);
        verificador8 = true;
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (verificador1 && verificador2 && verificador3 && verificador4 && verificador5 && verificador6 && verificador7 && verificador8) {
            jButton19.setVisible(false);
            jButton20.setVisible(false);
            jButton27.setVisible(true);
            jLabel26.setText(jLabel18.getText());
            jLabel26.setVisible(true);
            verificador9 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if (verificador1 && verificador2 && verificador3 && verificador4 && verificador5 && verificador6 && verificador7 && verificador8) {
            jButton19.setVisible(false);
            jButton20.setVisible(false);
            jButton27.setVisible(true);
            jLabel26.setText(jLabel19.getText());
            jLabel26.setVisible(true);
            verificador9 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if (verificador1 && verificador2 && verificador3 && verificador4 && verificador5 && verificador6 && verificador7 && verificador8) {
            jButton21.setVisible(false);
            jButton22.setVisible(false);
            jButton28.setVisible(true);
            jLabel27.setText(jLabel20.getText());
            jLabel27.setVisible(true);
            verificador10 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if (verificador1 && verificador2 && verificador3 && verificador4 && verificador5 && verificador6 && verificador7 && verificador8) {
            jButton21.setVisible(false);
            jButton22.setVisible(false);
            jButton28.setVisible(true);
            jLabel27.setText(jLabel21.getText());
            jLabel27.setVisible(true);
            verificador10 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if (verificador1 && verificador2 && verificador3 && verificador4 && verificador5 && verificador6 && verificador7 && verificador8) {
            jButton23.setVisible(false);
            jButton24.setVisible(false);
            jButton29.setVisible(true);
            jLabel28.setText(jLabel22.getText());
            jLabel28.setVisible(true);
            verificador11 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if (verificador1 && verificador2 && verificador3 && verificador4 && verificador5 && verificador6 && verificador7 && verificador8) {
            jButton23.setVisible(false);
            jButton24.setVisible(false);
            jButton29.setVisible(true);
            jLabel25.setText(jLabel23.getText());
            jLabel28.setVisible(true);
            verificador11 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if (verificador1 && verificador2 && verificador3 && verificador4 && verificador5 && verificador6 && verificador7 && verificador8) {
            jButton25.setVisible(false);
            jButton26.setVisible(false);
            jButton30.setVisible(true);
            jLabel29.setText(jLabel24.getText());
            jLabel29.setVisible(true);
            verificador12 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        if (verificador1 && verificador2 && verificador3 && verificador4 && verificador5 && verificador6 && verificador7 && verificador8) {
            jButton25.setVisible(false);
            jButton26.setVisible(false);
            jButton30.setVisible(true);
            jLabel29.setText(jLabel25.getText());
            jLabel29.setVisible(true);
            verificador12 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        if (verificador9 && verificador10 && verificador11 && verificador12) {
            jButton27.setVisible(false);
            jButton28.setVisible(false);
            jButton31.setVisible(true);
            jLabel31.setText(jLabel26.getText());
            jLabel31.setVisible(true);
            verificador13 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if (verificador9 && verificador10 && verificador11 && verificador12) {
            jButton27.setVisible(false);
            jButton28.setVisible(false);
            jButton31.setVisible(true);
            jLabel31.setText(jLabel27.getText());
            jLabel31.setVisible(true);
            verificador13 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        if (verificador9 && verificador10 && verificador11 && verificador12) {
            jButton29.setVisible(false);
            jButton30.setVisible(false);
            jButton32.setVisible(true);
            jLabel32.setText(jLabel28.getText());
            jLabel32.setVisible(true);
            verificador14 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        if (verificador9 && verificador10 && verificador11 && verificador12) {
            jButton29.setVisible(false);
            jButton30.setVisible(false);
            jButton32.setVisible(true);
            jLabel32.setText(jLabel29.getText());
            jLabel32.setVisible(true);
            verificador14 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if (verificador13 && verificador14) {
            jButton31.setVisible(false);
            jButton32.setVisible(false);
            jLabel30.setText(jLabel31.getText());
            jLabel30.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        if (verificador13 && verificador14) {
            jButton31.setVisible(false);
            jButton32.setVisible(false);
            jLabel30.setText(jLabel32.getText());
            jLabel30.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }

    }//GEN-LAST:event_jButton32ActionPerformed

    public static void main(String args[]) {

    }

    private int calcularFilas(int nEquipos) {
        int filas = nEquipos;
        int nFilas = 0;
        while (filas >= 1) {
            filas = filas / 2;
            nFilas += 1;
        }
        return nFilas;
    }

    private int calcularNCajas(int nEquipos) {
        int nCajas = 0;

        for (int j = 0; j < calcularFilas(nEquipos); j++) {
            for (int i = 0; i < nEquipos / Math.pow(2, j); i++) {
                nCajas++;
            }
        }
        System.out.println("El numero de cajas es" + nCajas);
        return nCajas;
    }

    public void generarCajas(int nEquipos, int[] lblEnXArray, int[] lblEnYArray, int[] lblWidthArray, int[] lblHeightArray) {
        int contCajas = 0;
        for (int j = 0; j < calcularFilas(nEquipos); j++) {
            for (int i = 0; i < nEquipos / Math.pow(2, j); i++) {
                JLabel lblCaja = new JLabel(); //Se instancia el label donde irán los cuadros de los equipos
                int lblCajaEnX = ((int) (((jPanel2.getWidth() * i) / nEquipos) * Math.pow(2, j)) + (int) (((jPanel2.getWidth()) / nEquipos) * Math.pow(2, j) / 2)) - (int) (((jPanel2.getWidth()) / nEquipos) * 1 / 2);
                int lblCajaEnY = (jPanel2.getHeight() * j) / calcularFilas(nEquipos);
                int widthLblCaja = jPanel2.getWidth() / nEquipos;
                int heightLblCaja = jPanel2.getHeight() / calcularFilas(nEquipos);
                lblCaja.setBounds(lblCajaEnX, lblCajaEnY, widthLblCaja, heightLblCaja); //se ajusta la creación de los labels a una división el jPanel2
                ImageIcon caja = new ImageIcon("C:\\Users\\deive\\Documents\\NetBeansProjects\\WildRiftProject\\src\\GUI\\boxModelWithOutBackground.png"); //se genera una instancia de los cuadros
                Icon iconoCaja = new ImageIcon(caja.getImage().getScaledInstance(lblCaja.getWidth(), lblCaja.getHeight(), Image.SCALE_SMOOTH)); //convertimos la imagen en un icono y escalamos la imagen
                lblCaja.setIcon(iconoCaja);
                jPanel2.add(lblCaja);
                lblEnXArray[contCajas] = lblCaja.getX();
                lblEnYArray[contCajas] = lblCaja.getY();
                lblWidthArray[contCajas] = lblCaja.getWidth();
                lblHeightArray[contCajas] = lblCaja.getHeight();
                System.out.println("La posicion en X es: " + lblCajaEnX + " La posicion en Y es: " + lblCajaEnY);
                contCajas++;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
