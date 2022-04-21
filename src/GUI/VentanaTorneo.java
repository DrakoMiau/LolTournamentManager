package GUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class VentanaTorneo extends javax.swing.JFrame {

    public VentanaTorneo(int nEquipos) {
        initComponents();
        ImageIcon wildRiftImage = new ImageIcon("WilRift.jpg");
        Icon myWildRiftIcon = new ImageIcon(wildRiftImage.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH));
        jLabel1.setIcon(myWildRiftIcon);
        this.setLocationRelativeTo(null);
        this.repaint();
        this.setResizable(false);
        jButton1.setFocusable(false);
        jButton2.setFocusable(false);
        Ganador1.setFocusable(false);
        Ganador2.setFocusable(false);
        int[] lblEnXArray = new int[calcularNCajas(nEquipos)];
        int[] lblEnYArray = new int[calcularNCajas(nEquipos)];
        int[] lblWidthArray = new int[calcularNCajas(nEquipos)];
        int[] lblHeightArray = new int[calcularNCajas(nEquipos)];
        generarCajas(nEquipos, lblEnXArray, lblEnYArray, lblWidthArray, lblHeightArray);
        jPanel3.setOpaque(false);
        jLabel2.setText(VentanaCreacionTorneo2.nombreDeEquipo[0].getText());
        jLabel3.setText(VentanaCreacionTorneo2.nombreDeEquipo[1].getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Ganador1 = new javax.swing.JButton();
        Ganador2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1390, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1390, 780));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(60, 32, 51));
        jButton2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, -1, -1));

        jButton1.setBackground(new java.awt.Color(60, 32, 51));
        jButton1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Menú de Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 710, -1, -1));

        jPanel3.setLayout(null);

        Ganador1.setBackground(new java.awt.Color(255, 204, 51));
        Ganador1.setText("✓");
        Ganador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ganador1ActionPerformed(evt);
            }
        });
        jPanel3.add(Ganador1);
        Ganador1.setBounds(0, 0, 70, 24);

        Ganador2.setBackground(new java.awt.Color(255, 204, 51));
        Ganador2.setText("✓");
        Ganador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ganador2ActionPerformed(evt);
            }
        });
        jPanel3.add(Ganador2);
        Ganador2.setBounds(695, 0, 70, 24);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(170, 180, 310, 40);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel3);
        jLabel3.setBounds(870, 180, 310, 40);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel4);
        jLabel4.setBounds(510, 560, 310, 40);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));

        jPanel2.setLayout(null);

        jPanel2.setOpaque(false);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaMenuInicio volverVentanaMenuInicio = new VentanaMenuInicio();
        volverVentanaMenuInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaCreacionTorneo2 volverVentanaCreacionTorneo2 = new VentanaCreacionTorneo2(Integer.parseInt(VentanaCreacionTorneo.nEquipos.getText()));
        volverVentanaCreacionTorneo2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Ganador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ganador1ActionPerformed
        Ganador1.setVisible(false);
        Ganador2.setVisible(false);
        jLabel4.setText(VentanaCreacionTorneo2.nombreDeEquipo[0].getText());
    }//GEN-LAST:event_Ganador1ActionPerformed

    private void Ganador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ganador2ActionPerformed
        Ganador1.setVisible(false);
        Ganador2.setVisible(false);
        jLabel4.setText(VentanaCreacionTorneo2.nombreDeEquipo[1].getText());
    }//GEN-LAST:event_Ganador2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private int calcularNCajas(int nEquipos) {
        int nCajas = 0;

        for (int j = 0; j < calcularFilas(nEquipos); j++) {
            for (int i = 0; i < nEquipos / Math.pow(2, j); i++) {
                nCajas++;
            }
        }
        System.out.println("El numero de cajas es: " + nCajas);
        return nCajas;
    }
    //Solo con nEquipos potencias de 2

    private int calcularFilas(int nEquipos) {
        int filas = nEquipos;
        int nFilas = 0;
        while (filas >= 1) {
            filas = filas / 2;
            nFilas += 1;
        }
        return nFilas;
    }

    //Generar el diagrama de organización del torneo
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
                System.out.println("La posicion en X es: " + lblCajaEnX + "La posicion en Y es: " + lblCajaEnY);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ganador1;
    private javax.swing.JButton Ganador2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
