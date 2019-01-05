
package programmenentukanbadanideal;

import javax.swing.table.DefaultTableModel;

public class Frame_Badan_Ideal extends CekIdeal {
    float tinggi, berat, hasil, hasil2,  IMT, keadaanBdn;
    String name;
    static TabelHistory Laund = new TabelHistory();
    IsiTabel isi;
    
    public Frame_Badan_Ideal() 
    {
        initComponents();
        tblHistory.setModel(Laund.getTabel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBerat = new javax.swing.JTextField();
        txtTinggi = new javax.swing.JTextField();
        btnCek = new javax.swing.JButton();
        txtIMT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKeadaan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Height (cm)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(43, 125, 82, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Weight (kg)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(43, 168, 82, 17);

        txtBerat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtBerat);
        txtBerat.setBounds(198, 165, 374, 23);

        txtTinggi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtTinggi);
        txtTinggi.setBounds(198, 122, 374, 23);

        btnCek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCek.setText("Cek");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        getContentPane().add(btnCek);
        btnCek.setBounds(198, 208, 80, 25);

        txtIMT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtIMT);
        txtIMT.setBounds(198, 251, 374, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Body Mass Index");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(43, 254, 119, 17);

        txtKeadaan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtKeadaan);
        txtKeadaan.setBounds(198, 294, 374, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("State of the body");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(43, 297, 121, 17);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(296, 208, 80, 25);

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
        jScrollPane1.setBounds(43, 337, 529, 165);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(43, 82, 40, 17);

        txtNama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNama);
        txtNama.setBounds(198, 79, 374, 23);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(394, 208, 80, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Calculate Ideal Weight");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 30, 206, 30);

        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack1);
        btnBack1.setBounds(492, 208, 80, 25);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(502, 23, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programmenentukanbadanideal/berat2.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-170, -10, 1970, 540);

        setSize(new java.awt.Dimension(625, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        // TODO add your handling code here:
        name = txtNama.getText();
        tinggi = Float.parseFloat(txtTinggi.getText());
        berat = Float.parseFloat(txtBerat.getText());
        IMT = cek();

        txtIMT.setText("" + IMT);
       
        if(IMT > 30) 
            txtKeadaan.setText("Kegemukan");
        else if(IMT > 25)  
             txtKeadaan.setText("Gemuk");
        else if(IMT > 18.5)  
             txtKeadaan.setText("Normal");
        else  
             txtKeadaan.setText("Kurus");     
    }//GEN-LAST:event_btnCekActionPerformed

    @Override
    public float cek() {
        hasil = (float)  (tinggi / 100);
        hasil2 = (float)  (hasil * hasil);
        return (float) (berat / hasil2);
    }

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtNama.setText("");
        txtTinggi.setText("");
        txtKeadaan.setText("");
        txtIMT.setText("");
        txtBerat.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String[] data = new String[5];
                
        data[0]=txtNama.getText();
        data[1]=txtTinggi.getText();
        data[2]=txtBerat.getText();
        data[3]=txtIMT.getText();
        data[4]=txtKeadaan.getText();
        
        Laund.getTabel().addRow(data);        
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnBack1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_Badan_Ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Badan_Ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Badan_Ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Badan_Ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frame_Badan_Ideal().setVisible(true);
                new Frame_Badan_Ideal().setTitle("The Application of Ideal Weight Calculator");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnReset;
    public javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
