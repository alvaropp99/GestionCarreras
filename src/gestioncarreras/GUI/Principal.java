/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncarreras.GUI;

import gestioncarreras.objetos.Corredor;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alvar
 */
public class Principal extends javax.swing.JFrame {
    
    Corredor corredor;
    AltaCorredor altaCorredor;
    public Principal() {
        initComponents();
    }
    
    private void inicializarTablaCorredores(){
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre","DNI","Fecha de Nacimiento","Dirección","Teléfono"});
        jTableCorredores.setModel(dtm);
    }
    
    public void aniadirCorredor(Corredor corredor){
        DefaultTableModel dtm=(DefaultTableModel)jTableCorredores.getModel();
        dtm.addRow(corredor.infoCorredor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCorredores = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jLabelCarrera = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jButtonBorrarCarrera = new javax.swing.JButton();
        jButtonModifCarrera = new javax.swing.JButton();
        jButtonBorrarCorredor = new javax.swing.JButton();
        jButtonModifCorredor = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCorredores = new javax.swing.JMenu();
        jMenuItemAltaCorredor = new javax.swing.JMenuItem();
        jMenuCarreras = new javax.swing.JMenu();
        jMenuItemAltaCarrera = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCorredores.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCorredores.setText("CORREDORES");

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DNI", "Fecha de Nacimiento", "Dirección", "Teléfono"
            }
        ));
        jScrollPane2.setViewportView(jTableCorredores);

        jLabelCarrera.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCarrera.setText("CARRERAS");

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha", "Lugar", "Número de Participantes", "Lista de Corredores"
            }
        ));
        jScrollPane1.setViewportView(jTableCarreras);

        jButtonBorrarCarrera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonBorrarCarrera.setText("BORRAR");
        jButtonBorrarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarCarreraActionPerformed(evt);
            }
        });

        jButtonModifCarrera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonModifCarrera.setText("MODIFICAR");

        jButtonBorrarCorredor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonBorrarCorredor.setText("BORRAR");

        jButtonModifCorredor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonModifCorredor.setText("MODIFICAR");

        jMenuCorredores.setText("Corredores");

        jMenuItemAltaCorredor.setText("Alta");
        jMenuItemAltaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaCorredorActionPerformed(evt);
            }
        });
        jMenuCorredores.add(jMenuItemAltaCorredor);

        jMenuBar1.add(jMenuCorredores);

        jMenuCarreras.setText("Carreras");

        jMenuItemAltaCarrera.setText("Alta");
        jMenuCarreras.add(jMenuItemAltaCarrera);

        jMenuBar1.add(jMenuCarreras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabelCorredores))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonBorrarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonModifCarrera))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBorrarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonModifCorredor)))))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCarrera)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCorredores)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModifCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jLabelCarrera)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModifCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaCorredorActionPerformed
        // TODO add your handling code here:
        altaCorredor=new AltaCorredor(this,true);
        altaCorredor.setVisible(true);
    }//GEN-LAST:event_jMenuItemAltaCorredorActionPerformed

    private void jButtonBorrarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBorrarCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarCarrera;
    private javax.swing.JButton jButtonBorrarCorredor;
    private javax.swing.JButton jButtonModifCarrera;
    private javax.swing.JButton jButtonModifCorredor;
    private javax.swing.JLabel jLabelCarrera;
    private javax.swing.JLabel jLabelCorredores;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCarreras;
    private javax.swing.JMenu jMenuCorredores;
    private javax.swing.JMenuItem jMenuItemAltaCarrera;
    private javax.swing.JMenuItem jMenuItemAltaCorredor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarreras;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
