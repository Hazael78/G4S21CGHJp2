/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21cghjp2;

/**
 *
 * @author hazae
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d_p_contenedor = new javax.swing.JDesktopPane();
        p = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        m_i_suma = new javax.swing.JMenuItem();
        m_i_resta = new javax.swing.JMenuItem();
        m_i_multiplicacion = new javax.swing.JMenuItem();
        m_i_division = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout d_p_contenedorLayout = new javax.swing.GroupLayout(d_p_contenedor);
        d_p_contenedor.setLayout(d_p_contenedorLayout);
        d_p_contenedorLayout.setHorizontalGroup(
            d_p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        d_p_contenedorLayout.setVerticalGroup(
            d_p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        jMenu1.setText("Operaciones");

        m_i_suma.setText("Suma");
        m_i_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_sumaActionPerformed(evt);
            }
        });
        jMenu1.add(m_i_suma);

        m_i_resta.setText("Resta");
        m_i_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_restaActionPerformed(evt);
            }
        });
        jMenu1.add(m_i_resta);

        m_i_multiplicacion.setText("Multiplicacion");
        m_i_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_multiplicacionActionPerformed(evt);
            }
        });
        jMenu1.add(m_i_multiplicacion);

        m_i_division.setText("Division");
        m_i_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_divisionActionPerformed(evt);
            }
        });
        jMenu1.add(m_i_division);

        p.add(jMenu1);

        jMenu2.setText("Salir");
        p.add(jMenu2);

        setJMenuBar(p);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_p_contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_p_contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_i_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_sumaActionPerformed
        // TODO add your handling code here:
        IfrmSuma objsuma =new IfrmSuma();
        objsuma.setVisible(true);
        d_p_contenedor.add(objsuma);
    }//GEN-LAST:event_m_i_sumaActionPerformed

    private void m_i_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_restaActionPerformed
        // TODO add your handling code here:
        IfrmResta objresta =new IfrmResta();
        objresta.setVisible(true);
        d_p_contenedor.add(objresta);
    }//GEN-LAST:event_m_i_restaActionPerformed

    private void m_i_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_multiplicacionActionPerformed
        // TODO add your handling code here:
        IfrmMulti objmulti =new IfrmMulti();
        objmulti.setVisible(true);
        d_p_contenedor.add(objmulti);
    }//GEN-LAST:event_m_i_multiplicacionActionPerformed

    private void m_i_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_divisionActionPerformed
        // TODO add your handling code here:
        IfrmDivi objdivi =new IfrmDivi();
        objdivi.setVisible(true);
        d_p_contenedor.add(objdivi);
    }//GEN-LAST:event_m_i_divisionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane d_p_contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem m_i_division;
    private javax.swing.JMenuItem m_i_multiplicacion;
    private javax.swing.JMenuItem m_i_resta;
    private javax.swing.JMenuItem m_i_suma;
    private javax.swing.JMenuBar p;
    // End of variables declaration//GEN-END:variables
}
