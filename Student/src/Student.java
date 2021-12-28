
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gokul
 */
public class Student extends javax.swing.JFrame {
int row;
    int column;
    int del;
    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
        no();
        update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        s1 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        s3 = new com.toedter.calendar.JDateChooser();
        s4 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        ss1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel17.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel17.setText("Student No:");

        jLabel18.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel18.setText("Student Name:");

        jLabel19.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel19.setText("Student DOB:");

        jLabel20.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel20.setText("Student DOJ:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Insert Record");

        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        s1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        s2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        s3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        s4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton2.setText("Update Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ss1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ss1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton3.setText("Search by ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton4.setText("All Record");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton5.setText("Delete Record");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(153, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STUDENT_NO", "STUDENT_NAME", "STUDENT_DOB", "STUDENT_DOJ"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel3)
                .addGap(129, 129, 129)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ss1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ss1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

        jLabel1.setFont(new java.awt.Font("News706 BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Student Record CURD Operation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int id = Integer.parseInt(s1.getText());

        String name = s2.getText();

        String dob =((JTextField)s3.getDateEditor().getUiComponent()).getText();

        String doj = ((JTextField)s4.getDateEditor().getUiComponent()).getText();

        PreparedStatement ps;
        ResultSet rs;
        String registerUserQuery1 = "INSERT INTO `student` VALUES(?,?,?,?)";
        try {

            ps = loginconnection.connection().prepareStatement(registerUserQuery1);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, dob);
            ps.setString(4, doj);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Information saved sccessfully.");
             
            } else {
                JOptionPane.showMessageDialog(null, "Error: Check Your Information");
            }

        } catch (Exception ex) {
            //       Logger.getLogger(NewAccount_Page.class.getName()).log(Level.SEVERE, null, ex);
        }

        no();
clear();
update();
    }//GEN-LAST:event_jButton1ActionPerformed
   void no() {
        String s;

        s = this.srno("select STUDENT_NO from student order by STUDENT_NO DESC Limit 1;", "STUDENT_NO");
        s1.setText(s);
    }
     public String srno(String query, String field) {
        PreparedStatement st;
        ResultSet rs;
        String f = null;
        // String query = ;
        int maxid = 0;
        //  JOptionPane.showMessageDialog(null, "inside method");
        try {

            st = loginconnection.connection().prepareStatement(query);
            rs = st.executeQuery();

            if (rs.next()) {
                maxid = rs.getInt(field);

            }
            int t = maxid + 1;
            f = Integer.toString(t);

            //      JOptionPane.showMessageDialog(null, "inside method");
        } catch (SQLException ex) {
            //  Logger.getLogger(NewAccount_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    void clear()
    {
        s2.setText("");
         
        
    }
    void update()
    {
         
        setVisible(true);
        //String key="anjali";
        setLayout(null);

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/umesh", "root", "");

            PreparedStatement s = con.prepareStatement("SELECT * FROM student");
            //s.setString(1,key);
            ResultSet rs = s.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            getContentPane().setBackground(Color.white);

            JTable jt = new JTable();

            DefaultTableModel dtm = new DefaultTableModel();

            Object col[] = new Object[rsmd.getColumnCount()];

            Object det[] = new Object[rsmd.getColumnCount()];
            for (int p = 1; p <= rsmd.getColumnCount(); p++) {
                col[p - 1] = rsmd.getColumnName(p);
            }

            jTable1.setModel(dtm);

            dtm.setColumnIdentifiers(col);

            while (rs.next()) {

                for (int j = 1; j <= rsmd.getColumnCount(); j++) {

                    if (rsmd.getColumnTypeName(j).equals("int")) {
                        det[j - 1] = rs.getInt(j);
                    } else {
                        det[j - 1] = rs.getString(j);
                    }

                }
                dtm.addRow(det);
            }

           // jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            //this.resizeColumnWidth(jTable1);

        } catch (Exception e) {
     
            System.out.println(e);

        }         //
    }
    
    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void ss1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          int key = Integer.parseInt(ss1.getText());
        setVisible(true);

        setLayout(null);

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/umesh", "root", "");

            PreparedStatement s = con.prepareStatement("SELECT * FROM student WHERE STUDENT_NO=?");
            s.setInt(1, key);
            ResultSet rs = s.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            getContentPane().setBackground(Color.white);

            JTable jt = new JTable();

            DefaultTableModel dtm = new DefaultTableModel();

            Object col[] = new Object[rsmd.getColumnCount()];

            Object det[] = new Object[rsmd.getColumnCount()];
            for (int p = 1; p <= rsmd.getColumnCount(); p++) {
                col[p - 1] = rsmd.getColumnName(p);
            }

            jTable1.setModel(dtm);

            dtm.setColumnIdentifiers(col);

            while (rs.next()) {

                for (int j = 1; j <= rsmd.getColumnCount(); j++) {

                    if (rsmd.getColumnTypeName(j).equals("int")) {
                        det[j - 1] = rs.getInt(j);
                    } else {
                        det[j - 1] = rs.getString(j);
                    }

                }
                dtm.addRow(det);
            }

          //  jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           // this.resizeColumnWidth(jTable2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sorry ! Check Your Input", "Confirm Password", 2);
            System.out.println(e);

        }         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           
         try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection z1=DriverManager.getConnection( "jdbc:mysql://localhost:3306/umesh","root","");
    if(column==1){
            String tblclick=(jTable1.getModel().getValueAt(row,1).toString());
            String sq1="update student set STUDENT_NAME=? where STUDENT_NO=?";
            PreparedStatement pst=z1.prepareStatement(sq1);
            pst.setString(1,tblclick);
            pst.setInt(2, row+1);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Name is Updated");
    }
    else if(column==2){
            String tblclick=(jTable1.getModel().getValueAt(row,2).toString());
            String sq1="update student set STUDENT_DOB=? where STUDENT_NO=?";
            PreparedStatement pst=z1.prepareStatement(sq1);
            pst.setString(1,tblclick);
            pst.setInt(2, row+1);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Date of birth is Updated");
    }
    else if(column==3){
            String tblclick=(jTable1.getModel().getValueAt(row,3).toString());
            String sq1="update student set STUDENT_DOJ=? where STUDENT_NO=?";
            PreparedStatement pst=z1.prepareStatement(sq1);
            pst.setString(1,tblclick);
            pst.setInt(2, row+1);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Date of joining is Updated.");
    }
      
        }
        catch(Exception  e)
        {
            //JOptionPane.showMessageDialog(this,e,"ALLERT MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
        
         
        update();
        no();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
               
      
      int result = JOptionPane.showConfirmDialog(null, "Do you really want to delete a record?.");
      switch (result) {
         case JOptionPane.YES_OPTION:
             try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection z1=DriverManager.getConnection( "jdbc:mysql://localhost:3306/umesh","root","");
    
          int v=jTable1.getSelectedRow();
          Object ob=jTable1.getModel().getValueAt(v,0);
          int v1=Integer.valueOf((String)ob);
            String sq1="delete from student where STUDENT_NO=?";
            PreparedStatement pst=z1.prepareStatement(sq1);
            pst.setInt(1,v1);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Deleted Successfully.");
    } catch ( Exception ex) {
        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
    }   
         break;
         case JOptionPane.NO_OPTION:
       
         break;
      case JOptionPane.CANCEL_OPTION:
  
       break;
         case JOptionPane.CLOSED_OPTION:
         
         break;
      }
        
       no();
       update();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           setVisible(true);
        //String key="anjali";
        setLayout(null);

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/umesh", "root", "");

            PreparedStatement s = con.prepareStatement("SELECT * FROM student");
            //s.setString(1,key);
            ResultSet rs = s.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            getContentPane().setBackground(Color.white);

            JTable jt = new JTable();

            DefaultTableModel dtm = new DefaultTableModel();

            Object col[] = new Object[rsmd.getColumnCount()];

            Object det[] = new Object[rsmd.getColumnCount()];
            for (int p = 1; p <= rsmd.getColumnCount(); p++) {
                col[p - 1] = rsmd.getColumnName(p);
            }

            jTable1.setModel(dtm);

            dtm.setColumnIdentifiers(col);

            while (rs.next()) {

                for (int j = 1; j <= rsmd.getColumnCount(); j++) {

                    if (rsmd.getColumnTypeName(j).equals("int")) {
                        det[j - 1] = rs.getInt(j);
                    } else {
                        det[j - 1] = rs.getString(j);
                    }

                }
                dtm.addRow(det);
            }

            //jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            //this.resizeColumnWidth(jTable1);

        } catch (Exception e) {
     
            System.out.println(e);

        }         // TODO a
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
            row=jTable1.getSelectedRow();
              column=jTable1.getSelectedColumn();
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:del
       row=jTable1.getSelectedRow();
              column=jTable1.getSelectedColumn();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private com.toedter.calendar.JDateChooser s3;
    private com.toedter.calendar.JDateChooser s4;
    private javax.swing.JTextField ss1;
    // End of variables declaration//GEN-END:variables
}
