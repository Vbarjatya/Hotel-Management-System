/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_file;

/**
 *
 * @author Lenovo
 */
import java.sql.*;
public class hotel_name extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    String sql="",s,nm;
    int a;
    /**
     * Creates new form hotel_name
     */
public hotel_name(int x,String t) {
        initComponents();
       a=x;
       s=t; 
 try
 {    
     l1.setText("Hotels in "+s);
     if(a==0)
     {
        Class.forName("java.sql.DriverManager");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","1234");
        sql="select * from jaipur where sno=0";
        st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next())
     rb1.setText(rs.getString("hotel")+"\n");
    
      sql="select * from jaipur where sno=1";
        st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next())
     rb2.setText(rs.getString("hotel")+"\n");

     }
     if(a==1)
     {
        Class.forName("java.sql.DriverManager");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","1234");
        sql="select * from jaipur where sno=2";
        st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next())
     rb1.setText(rs.getString("hotel")+"\n");

      sql="select * from jaipur where sno=3";
        st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next())
     rb2.setText(rs.getString("hotel")+"\n");
     }
     if(a==2)
     {
        Class.forName("java.sql.DriverManager");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","1234");
        sql="select * from jaipur where sno=4";
        st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next())
     rb1.setText(rs.getString("hotel")+"\n");

      sql="select * from jaipur where sno=5";
        st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next())
     rb2.setText(rs.getString("hotel")+"\n");
     }
     if(a==3)
     {
        Class.forName("java.sql.DriverManager");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","1234");
        sql="select * from jaipur where sno=6";
        st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next())
     rb1.setText(rs.getString("hotel")+"\n");
    }
     if(a==3)
     {
      sql="select * from jaipur where sno=7";
        st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next())
     rb2.setText(rs.getString("hotel")+"\n");
     }

 }
     
 catch(Exception ex)
         {
             
         }
         
    }
 public hotel_name() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        l1.setText("Location");

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("Check Availability");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(rb2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(599, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(l1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(l1))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(rb1)
                .addGap(18, 18, 18)
                .addComponent(rb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             if(rb1.isSelected())
         nm=rb1.getText().trim();
     else if(rb2.isSelected())
         nm=rb2.getText().trim();
        new room(nm).setVisible(true);
                this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

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
            java.util.logging.Logger.getLogger(hotel_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotel_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotel_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotel_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotel_name().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    // End of variables declaration//GEN-END:variables
}
