package GUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaCreacionTorneo2 extends javax.swing.JFrame {
    

    public VentanaCreacionTorneo2(int nEquipos) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ImageIcon frameBackground = new ImageIcon("C:\\Users\\deive\\Documents\\NetBeansProjects\\WildRiftProject\\src\\GUI\\WildRift2.jpg");
        Icon iconBackground = new ImageIcon(frameBackground.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH));
        jLabel1.setIcon(iconBackground);
        generarJTextField(Integer.parseInt(VentanaCreacionTorneo.nEquipos.getText()));
        jPanel2.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(360, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Crear Torneo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, -1, -1));

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jPanel2.setLayout(null);
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 310, 460));

        jLabel2.setText("Ingrese los nombres de los equipos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 660));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validarCrearTorneo(Integer.parseInt(VentanaCreacionTorneo.nEquipos.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaCreacionTorneo volverVentanaCreacionTorneo = new VentanaCreacionTorneo();
        volverVentanaCreacionTorneo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void validarCrearTorneo(int nEquipos) {
        try {
            if (verificarPotenciaDe2(nEquipos)) {
                if (nEquipos <= 16 && nEquipos >= 2) {
                    if (nEquipos == 2) {
                        this.setVisible(false);
                        VentanaTorneo ventanaTorneo = new VentanaTorneo(nEquipos);
                        ventanaTorneo.setVisible(true);
                    } else if (nEquipos == 4) {
                        this.setVisible(false);
                        VentanaTorneo4 ventanaTorneo = new VentanaTorneo4(nEquipos);
                        ventanaTorneo.setVisible(true);
                    } else if (nEquipos == 8) {
                        this.setVisible(false);
                        VentanaTorneo8 ventanaTorneo = new VentanaTorneo8(nEquipos);
                        ventanaTorneo.setVisible(true);
                    } else if (nEquipos == 16) {
                        this.setVisible(false);
                        VentanaTorneo16 ventanaTorneo = new VentanaTorneo16(nEquipos);
                        ventanaTorneo.setVisible(true);
                    }
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este no es un valor correcto");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "No es válido, ingrese un número potencia de 2");
        }
    }

    public static boolean verificarPotenciaDe2(double nEquipos) {
        while (nEquipos > 2) {
            nEquipos = nEquipos / 2;  //dividimos entre dos hasta llegar a un punto en el que es igual o mayor a dos. Ese valor lo guardamos
            System.out.println(nEquipos);
        }
        if (nEquipos % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static JTextField[] nombreDeEquipo = new JTextField[1000];

    private void generarJTextField(int nEquipos) {
        for (int i = 0; i < nEquipos; i++) {
            nombreDeEquipo[i] = new JTextField();
            nombreDeEquipo[i].setBounds(0,20*i, jPanel2.getWidth(), 20);
            jPanel2.add(nombreDeEquipo[i]);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
