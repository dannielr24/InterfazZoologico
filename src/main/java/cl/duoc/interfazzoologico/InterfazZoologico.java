package cl.duoc.interfazzoologico;

import cl.duoc.interfazzoologico.gui.ViewRegistrarAmbientes;
import cl.duoc.interfazzoologico.gui.ViewRegistrarAnimales;
import cl.duoc.interfazzoologico.gui.ViewRegistrarEntradas;
import cl.duoc.interfazzoologico.gui.ViewRegistrarVisitante;


public class InterfazZoologico extends javax.swing.JFrame {

    
    public InterfazZoologico() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBarRegistroReporte = new javax.swing.JMenuBar();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemAmbientes = new javax.swing.JMenuItem();
        jMenuItemAnimales = new javax.swing.JMenuItem();
        jMenuItemEntradas = new javax.swing.JMenuItem();
        jMenuItemVisitantes = new javax.swing.JMenuItem();
        jMenuReporte = new javax.swing.JMenu();
        jMenuItemReportes = new javax.swing.JMenuItem();
        jMenuJaulas = new javax.swing.JMenu();
        jMenuItemDistribucionJaulas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        jMenuRegistro.setText("Registro");

        jMenuItemAmbientes.setText("Ambientes");
        jMenuItemAmbientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAmbientesActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemAmbientes);

        jMenuItemAnimales.setText("Animales");
        jMenuItemAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnimalesActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemAnimales);

        jMenuItemEntradas.setText("Entradas");
        jMenuRegistro.add(jMenuItemEntradas);

        jMenuItemVisitantes.setText("Visitantes");
        jMenuRegistro.add(jMenuItemVisitantes);

        jMenuBarRegistroReporte.add(jMenuRegistro);

        jMenuReporte.setText("Reporte");

        jMenuItemReportes.setText("Reportes");
        jMenuReporte.add(jMenuItemReportes);

        jMenuBarRegistroReporte.add(jMenuReporte);

        jMenuJaulas.setText("Jaulas");

        jMenuItemDistribucionJaulas.setText("Distribución Jaulas");
        jMenuJaulas.add(jMenuItemDistribucionJaulas);

        jMenuBarRegistroReporte.add(jMenuJaulas);

        setJMenuBar(jMenuBarRegistroReporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnimalesActionPerformed
        // TODO add your handling code here:
        ViewRegistrarAnimales ventana = new ViewRegistrarAnimales();
        ventana.setTitle("Registrar Animal");        
        escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItemAnimalesActionPerformed

    private void jMenuItemAmbientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAmbientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAmbientesActionPerformed

    
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
            java.util.logging.Logger.getLogger(InterfazZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazZoologico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBarRegistroReporte;
    private javax.swing.JMenuItem jMenuItemAmbientes;
    private javax.swing.JMenuItem jMenuItemAnimales;
    private javax.swing.JMenuItem jMenuItemDistribucionJaulas;
    private javax.swing.JMenuItem jMenuItemEntradas;
    private javax.swing.JMenuItem jMenuItemReportes;
    private javax.swing.JMenuItem jMenuItemVisitantes;
    private javax.swing.JMenu jMenuJaulas;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JMenu jMenuReporte;
    // End of variables declaration//GEN-END:variables
}
