/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securecode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Vikash Anand
 */
public class CppFrame extends javax.swing.JFrame {

    /**
     * Creates new form CppFrame
     */
    public CppFrame() {
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

        cppView = new javax.swing.JButton();
        cppAnalyze = new javax.swing.JButton();
        cppAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        func = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Secure Code Analyzer");

        cppView.setText("View Functions");
        cppView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cppViewActionPerformed(evt);
            }
        });

        cppAnalyze.setText("Analyze");
        cppAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cppAnalyzeActionPerformed(evt);
            }
        });

        cppAdd.setText("Add");
        cppAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cppAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Function Name");

        func.setText("Enter Function Name");
        func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcActionPerformed(evt);
            }
        });

        jLabel2.setText("Description");

        desc.setText("Enter a detailed description");
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(cppAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(cppAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(func)
                                    .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(cppView)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cppView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cppAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(func, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(cppAdd)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cppViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cppViewActionPerformed
        CppView cp=new CppView();
        cp.setVisible(true);
    }//GEN-LAST:event_cppViewActionPerformed

    private void cppAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cppAnalyzeActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f= chooser.getSelectedFile();
        String filename= f.getAbsolutePath();
        
        File fop= new File(filename);
        File fcp= new File("Code.txt");
        
        BufferedReader reader;
        PrintWriter writer;
        
        String line;
        try{
            if(fcp.createNewFile()|| !fcp.createNewFile())
            {
                reader = new BufferedReader(new FileReader(fop));
                writer = new PrintWriter(new FileWriter(fcp));
                
                while((line= reader.readLine())!=null)
                {
                    writer.println(line);
                }
                reader.close();
                writer.close();
            }
                }catch(IOException ioEx){
            System.out.println("Error in File");
        }
        
        try {
            ReadingCpp rd=new ReadingCpp();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(JavaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cppAnalyzeActionPerformed

    private void cppAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cppAddActionPerformed
         String str=func.getText();
         long hash=0;
         int prime=101;
         char[] str1=str.toCharArray();
         int end=str1.length;    
         for(int i=0;i<end;i++)
         {
                    hash+=str1[i]*Math.pow(prime,i);      
         }
         
         Timestamp timestamp = new Timestamp(System.currentTimeMillis());
         long temp= timestamp.getTime();
         String strId= Long.toString(temp);
         try{Class.forName("com.mysql.jdbc.Driver");
         Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/securecode","root","vikashanand");
         PreparedStatement ps=c.prepareStatement("insert into cpp(id,stringId,string,description) values(?,?,?,?)");
         ps.setLong(1, hash);
         ps.setString(2, strId);
         ps.setString(3,func.getText());
         ps.setString(4,desc.getText());
         int x=ps.executeUpdate();
         if(x>0){
             JOptionPane.showMessageDialog(null, "Eureka! One more Vulnerability Added","Update Dialogue",0);
         }
         }catch(Exception e){}
    }//GEN-LAST:event_cppAddActionPerformed

    private void funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

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
            java.util.logging.Logger.getLogger(CppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CppFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cppAdd;
    private javax.swing.JButton cppAnalyze;
    private javax.swing.JButton cppView;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField func;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
