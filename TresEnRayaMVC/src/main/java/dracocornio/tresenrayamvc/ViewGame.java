/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dracocornio.tresenrayamvc;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class ViewGame extends javax.swing.JFrame {

    /**
     * Creates new form ViewGame
     */
    private JLabel[][] casillas;
    
    public ViewGame() {
        casillas = new JLabel[3][3];
        initComponents();
        asignarCasillas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casilla6 = new javax.swing.JLabel();
        casilla3 = new javax.swing.JLabel();
        casilla4 = new javax.swing.JLabel();
        casilla5 = new javax.swing.JLabel();
        casilla7 = new javax.swing.JLabel();
        casilla1 = new javax.swing.JLabel();
        casilla2 = new javax.swing.JLabel();
        casilla9 = new javax.swing.JLabel();
        casilla8 = new javax.swing.JLabel();
        victoriasJ2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        victoriasJ1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        botonReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        casilla6.setBackground(new java.awt.Color(255, 255, 255));
        casilla6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla6.setOpaque(true);

        casilla3.setBackground(new java.awt.Color(255, 255, 255));
        casilla3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla3.setOpaque(true);

        casilla4.setBackground(new java.awt.Color(255, 255, 255));
        casilla4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla4.setOpaque(true);

        casilla5.setBackground(new java.awt.Color(255, 255, 255));
        casilla5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla5.setOpaque(true);

        casilla7.setBackground(new java.awt.Color(255, 255, 255));
        casilla7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla7.setOpaque(true);

        casilla1.setBackground(new java.awt.Color(255, 255, 255));
        casilla1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla1.setOpaque(true);

        casilla2.setBackground(new java.awt.Color(255, 255, 255));
        casilla2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla2.setOpaque(true);

        casilla9.setBackground(new java.awt.Color(255, 255, 255));
        casilla9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla9.setOpaque(true);

        casilla8.setBackground(new java.awt.Color(255, 255, 255));
        casilla8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla8.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 300, 300));

        victoriasJ2.setBackground(new java.awt.Color(255, 204, 204));
        victoriasJ2.setFont(new java.awt.Font("Oswald", 3, 24)); // NOI18N
        victoriasJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoriasJ2.setText("0");
        victoriasJ2.setOpaque(true);
        getContentPane().add(victoriasJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 90, 60));

        jLabel12.setBackground(new java.awt.Color(255, 204, 204));
        jLabel12.setText("Jugador 2");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 90, 60));

        jLabel13.setBackground(new java.awt.Color(255, 204, 204));
        jLabel13.setText("Jugador 1");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 90, 60));

        victoriasJ1.setBackground(new java.awt.Color(255, 204, 204));
        victoriasJ1.setFont(new java.awt.Font("Oswald", 3, 24)); // NOI18N
        victoriasJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoriasJ1.setText("0");
        victoriasJ1.setOpaque(true);
        getContentPane().add(victoriasJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 90, 60));

        jLabel15.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("Victorias");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        botonReset.setText("Volver a Jugar");
        getContentPane().add(botonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 473));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReset;
    private javax.swing.JLabel casilla1;
    private javax.swing.JLabel casilla2;
    private javax.swing.JLabel casilla3;
    private javax.swing.JLabel casilla4;
    private javax.swing.JLabel casilla5;
    private javax.swing.JLabel casilla6;
    private javax.swing.JLabel casilla7;
    private javax.swing.JLabel casilla8;
    private javax.swing.JLabel casilla9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel victoriasJ1;
    private javax.swing.JLabel victoriasJ2;
    // End of variables declaration//GEN-END:variables

    private void asignarCasillas() {
        casillas[0][0] = casilla1;
        casillas[0][1] = casilla2;
        casillas[0][2] = casilla3;
        casillas[1][0] = casilla4;
        casillas[1][1] = casilla5;
        casillas[1][2] = casilla6;
        casillas[2][0] = casilla7;
        casillas[2][1] = casilla8;
        casillas[2][2] = casilla9;
    }
    public JLabel[][] getCasillas(){
        return casillas;
    }
    public JLabel getVictoriasJ1(){
        return victoriasJ1;
    }
    public JLabel getVictoriasJ2(){
        return victoriasJ2;
    }
    public JButton getBotonReset(){
        return botonReset;
    }
}
