
package programmenentukanbadanideal;

public class Frame_Badan_Ideal2 extends javax.swing.JFrame {
    Frame_Badan_Ideal adaw = new Frame_Badan_Ideal();
    TabelHistory Laund = adaw.Laund;
    
    public Frame_Badan_Ideal2() {
        initComponents();
        tblHistory.setModel(Laund.getTabel());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        txtTinggi = new javax.swing.JTextField();
        txtBerat = new javax.swing.JTextField();
        txtIMT = new javax.swing.JTextField();
        txtKeadaan = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblHistory);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(43, 341, 521, 161);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Edit Value From Table");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(209, 22, 195, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(45, 82, 40, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Height (cm)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(45, 127, 82, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Weight (kg)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(45, 173, 82, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Body Mass Index");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(45, 258, 119, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("State of the body");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(43, 301, 121, 17);

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(198, 210, 115, 25);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(320, 210, 120, 25);

        txtNama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNama);
        txtNama.setBounds(198, 79, 366, 23);

        txtTinggi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtTinggi);
        txtTinggi.setBounds(198, 124, 366, 23);

        txtBerat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtBerat);
        txtBerat.setBounds(198, 167, 366, 23);

        txtIMT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtIMT);
        txtIMT.setBounds(198, 255, 366, 23);

        txtKeadaan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtKeadaan);
        txtKeadaan.setBounds(198, 298, 366, 23);

        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack1);
        btnBack1.setBounds(447, 210, 117, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programmenentukanbadanideal/berat2.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-160, 0, 770, 500);

        setSize(new java.awt.Dimension(625, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int i = tblHistory.getSelectedRow();

        if(i >= 0)
        {
            String name2 = txtNama.getText();
            float tinggi2 = Float.parseFloat(txtTinggi.getText());
            float berat2 = Float.parseFloat(txtBerat.getText());
            float hasil3 = (float)  (tinggi2 / 100);
            float hasil4 = (float)  (hasil3 * hasil3);
            float IMT2 = (float) (berat2 / hasil4);

            txtIMT.setText("" + IMT2);

            if(IMT2 > 30)
            txtKeadaan.setText("Kegemukan");
            else if(IMT2 > 25)
            txtKeadaan.setText("Gemuk");
            else if(IMT2 > 18.5)
            txtKeadaan.setText("Normal");
            else
            txtKeadaan.setText("Kurus");

            tblHistory.setValueAt(name2, i, 0);
            tblHistory.setValueAt(tinggi2, i, 1);
            tblHistory.setValueAt(berat2, i, 2);
            tblHistory.setValueAt(IMT2, i, 3);
            tblHistory.setValueAt(txtKeadaan.getText(), i, 4);
        }
        else
        {
            System.out.println("Update Error");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Laund.getTabel().removeRow(tblHistory.getSelectedRow());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnBack1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Frame_Badan_Ideal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Badan_Ideal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Badan_Ideal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Badan_Ideal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Badan_Ideal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtIMT;
    private javax.swing.JTextField txtKeadaan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTinggi;
    // End of variables declaration//GEN-END:variables
}
