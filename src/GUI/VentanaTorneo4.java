
package GUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaTorneo4 extends javax.swing.JFrame {

    public VentanaTorneo4(int nEquipos) {
        initComponents();
        ImageIcon wildRiftImage = new ImageIcon("WilRift.jpg");
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
        ganador5.setVisible(false);
        ganador6.setVisible(false);
        jLabel2.setText(VentanaCreacionTorneo2.nombreDeEquipo[0].getText());
        jLabel3.setText(VentanaCreacionTorneo2.nombreDeEquipo[1].getText());
        jLabel4.setText(VentanaCreacionTorneo2.nombreDeEquipo[2].getText());
        jLabel5.setText(VentanaCreacionTorneo2.nombreDeEquipo[3].getText());

        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ganador1 = new javax.swing.JButton();
        ganador2 = new javax.swing.JButton();
        ganador3 = new javax.swing.JButton();
        ganador4 = new javax.swing.JButton();
        ganador5 = new javax.swing.JButton();
        ganador6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(60, 32, 51));
        jButton2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Menú de Inicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 710, -1, -1));

        jButton1.setBackground(new java.awt.Color(60, 32, 51));
        jButton1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        ganador1.setBackground(new java.awt.Color(255, 204, 51));
        ganador1.setText("✓");
        ganador1.setFocusable(false);
        ganador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganador1ActionPerformed(evt);
            }
        });
        jPanel3.add(ganador1);
        ganador1.setBounds(0, 0, 57, 24);

        ganador2.setBackground(new java.awt.Color(255, 204, 51));
        ganador2.setText("✓");
        ganador2.setFocusable(false);
        ganador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganador2ActionPerformed(evt);
            }
        });
        jPanel3.add(ganador2);
        ganador2.setBounds(347, 0, 57, 24);

        ganador3.setBackground(new java.awt.Color(255, 204, 51));
        ganador3.setText("✓");
        ganador3.setFocusable(false);
        ganador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganador3ActionPerformed(evt);
            }
        });
        jPanel3.add(ganador3);
        ganador3.setBounds(695, 0, 57, 24);

        ganador4.setBackground(new java.awt.Color(255, 204, 51));
        ganador4.setText("✓");
        ganador4.setFocusable(false);
        ganador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganador4ActionPerformed(evt);
            }
        });
        jPanel3.add(ganador4);
        ganador4.setBounds(1042, 0, 57, 24);

        ganador5.setBackground(new java.awt.Color(255, 204, 51));
        ganador5.setText("✓");
        ganador5.setFocusable(false);
        ganador5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganador5ActionPerformed(evt);
            }
        });
        jPanel3.add(ganador5);
        ganador5.setBounds(174, 260, 57, 24);

        ganador6.setBackground(new java.awt.Color(255, 204, 51));
        ganador6.setText("✓");
        ganador6.setFocusable(false);
        ganador6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganador6ActionPerformed(evt);
            }
        });
        jPanel3.add(ganador6);
        ganador6.setBounds(868, 260, 57, 24);

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(80, 100, 160, 30);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel3);
        jLabel3.setBounds(440, 100, 160, 30);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel4);
        jLabel4.setBounds(780, 100, 160, 30);

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel5);
        jLabel5.setBounds(1140, 100, 160, 30);

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel6);
        jLabel6.setBounds(270, 370, 160, 30);

        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel7);
        jLabel7.setBounds(950, 370, 160, 30);

        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel8);
        jLabel8.setBounds(600, 640, 160, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean validadorGanador5 = false;
    boolean validadorGanador6 = false;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaMenuInicio volverVentanaMenuInicio = new VentanaMenuInicio();
        volverVentanaMenuInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaCreacionTorneo2 volverVentanaCreacionTorneo2 = new VentanaCreacionTorneo2(Integer.parseInt(VentanaCreacionTorneo.nEquipos.getText()));
        volverVentanaCreacionTorneo2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ganador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganador3ActionPerformed
        ganador3.setVisible(false);
        ganador4.setVisible(false);
        ganador6.setVisible(true);
        jLabel7.setText(jLabel4.getText());
        validadorGanador6 = true;
    }//GEN-LAST:event_ganador3ActionPerformed

    private void ganador5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganador5ActionPerformed
        if (validadorGanador5&&validadorGanador6) {
            ganador5.setVisible(false);
            ganador6.setVisible(false);
            jLabel8.setText(jLabel6.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }
    }//GEN-LAST:event_ganador5ActionPerformed

    private void ganador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganador1ActionPerformed
        ganador1.setVisible(false);
        ganador2.setVisible(false);
        ganador5.setVisible(true);
        jLabel6.setText(jLabel2.getText());
        validadorGanador5 = true;
    }//GEN-LAST:event_ganador1ActionPerformed

    private void ganador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganador2ActionPerformed
        ganador1.setVisible(false);
        ganador2.setVisible(false);
        ganador5.setVisible(true);
        jLabel6.setText(jLabel3.getText());
        validadorGanador5 = true;
    }//GEN-LAST:event_ganador2ActionPerformed

    private void ganador6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganador6ActionPerformed
        if (validadorGanador6&&validadorGanador5) {
            ganador5.setVisible(false);
            ganador6.setVisible(false);
            jLabel8.setText(jLabel7.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Faltan equipos por seleccionar");
        }
    }//GEN-LAST:event_ganador6ActionPerformed

    private void ganador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganador4ActionPerformed
        ganador4.setVisible(false);
        ganador3.setVisible(false);
        ganador6.setVisible(true);
        jLabel7.setText(jLabel5.getText());
        validadorGanador6 = true;
    }//GEN-LAST:event_ganador4ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaTorneo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTorneo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTorneo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTorneo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                ImageIcon caja = new ImageIcon("boxModelWithOutBackground.png"); //se genera una instancia de los cuadros
                Icon iconoCaja = new ImageIcon(caja.getImage().getScaledInstance(lblCaja.getWidth(), lblCaja.getHeight(), Image.SCALE_SMOOTH)); //convertimos la imagen en un icono y escalamos la imagen
                lblCaja.setIcon(iconoCaja);
                jPanel2.add(lblCaja);
                lblEnXArray[contCajas] = lblCaja.getX();
                lblEnYArray[contCajas] = lblCaja.getY();
                lblWidthArray[contCajas] = lblCaja.getWidth();
                lblHeightArray[contCajas] = lblCaja.getHeight();
                contCajas++;
                System.out.println("La posicion en X es: " + lblCajaEnX + " La posicion en Y es: " + lblCajaEnY);
            }
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ganador1;
    private javax.swing.JButton ganador2;
    private javax.swing.JButton ganador3;
    private javax.swing.JButton ganador4;
    private javax.swing.JButton ganador5;
    private javax.swing.JButton ganador6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
