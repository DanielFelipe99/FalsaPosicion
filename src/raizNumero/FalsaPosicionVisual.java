
package raizNumero;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nfunk.jep.JEP;

/**
 *
 * @author danie
 */
public class FalsaPosicionVisual extends javax.swing.JFrame {
    
    Resultados VentanaResultados = new Resultados();
    DefaultTableModel tabla;
    JEP j;
    public FalsaPosicionVisual() {
        initComponents();
        this.setTitle("Ingreso de datos");
        this.setLocationRelativeTo(FalsaPosicionVisual.this);
        this.setResizable(false);
        String Titulo[]={"Iteracion","a","b","xr","f(a)","f(b)","f(x)","Error"};
        tabla = new DefaultTableModel();
        tabla.setColumnIdentifiers(Titulo);
        VentanaResultados.jTable_Proceso.setEnabled(false);
        VentanaResultados.jTable_Proceso.setModel(tabla);
    }

        private double evaluarf(double x){
        double f_x = Math.pow(x, 4)+ 3*(Math.pow(x, 3)) - 2;
        return f_x;
        }
        
        //private double evaluarf(double x){
        //double f_x;
        //j = new JEP();
        //j.addStandardFunctions();
        //j.addStandardConstants();
        //j.addConstant("x", x);
        //j.parseExpression(jTxtFuncion.getText());
        //f_x = j.getValue();
        //return f_x;
        //}
        
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtFuncion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IntervaloA = new javax.swing.JTextField();
        IntervaloB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtError = new javax.swing.JTextField();
        jBtnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        jLabel2.setText("Metodo Falsa Posicion");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Funcion:");

        jTxtFuncion.setText("x^4+3x^3-2");
        jTxtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFuncionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Intervalos ");

        IntervaloA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntervaloAActionPerformed(evt);
            }
        });

        IntervaloB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntervaloBActionPerformed(evt);
            }
        });

        jLabel5.setText("Error");

        jTxtError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtErrorActionPerformed(evt);
            }
        });

        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IntervaloA, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jBtnCalcular))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(IntervaloB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtError, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTxtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntervaloA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IntervaloB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtError, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnCalcular)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFuncionActionPerformed

    private void IntervaloAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntervaloAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntervaloAActionPerformed

    private void IntervaloBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntervaloBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntervaloBActionPerformed

    private void jTxtErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtErrorActionPerformed

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        double a,b,xr;
        double c_m = 0;
        double error=1;
        double errorR = Double.parseDouble(jTxtError.getText());
        int iteracion = 0;
        a = Double.valueOf(IntervaloA.getText());
        b = Double.valueOf(IntervaloB.getText());

        if(evaluarf(a)*evaluarf(b)>0){
            JOptionPane.showMessageDialog(rootPane, "La raiz no ha sido encontrada en el intervalo");
        }else{
            do {
                xr = (a-((evaluarf(a))*(b-a))/(evaluarf(b)-evaluarf(a)));
                error = Math.abs((xr-c_m)/xr)*100;
                c_m = xr;

                String datoIteracion = String.valueOf(iteracion);
                String datoA = String.valueOf(a);
                String datoB = String.valueOf(b);
                String datoC = String.valueOf(xr);
                String datofa = String.valueOf(evaluarf(a));
                String datofb = String.valueOf(evaluarf(b));
                String datofx = String.valueOf(evaluarf(xr));
                String datoERROR = String.valueOf(evaluarf(error));
                String datos [] = {datoIteracion,datoA,datoB,datoC,datofa,datofb,datofx,datoERROR};
                tabla.addRow(datos);

                if(evaluarf(a)*evaluarf(xr) > 0){
                    a = xr;
                }else{
                    b = xr;
                }
                iteracion++;
            } while (errorR < error);
        }
        VentanaResultados.setVisible(true);
    }//GEN-LAST:event_jBtnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(FalsaPosicionVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FalsaPosicionVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FalsaPosicionVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FalsaPosicionVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FalsaPosicionVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IntervaloA;
    private javax.swing.JTextField IntervaloB;
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTxtError;
    private javax.swing.JTextField jTxtFuncion;
    // End of variables declaration//GEN-END:variables

 
}
