
package javaass1;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
public class register extends javax.swing.JFrame {

    private String gender;//variable to radio button
    
    public register() {
        initComponents();
        this.setLocationRelativeTo(null);// appear in centre
        
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Mname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Country = new javax.swing.JTextField();
        Pno = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Unameregister = new javax.swing.JTextField();
        PasswordRegister = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mname.setBackground(new java.awt.Color(0, 102, 102));
        Mname.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Mname.setForeground(new java.awt.Color(240, 240, 240));
        Mname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Mname.setBorder(null);
        jPanel1.add(Mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 142, -1));

        Lname.setBackground(new java.awt.Color(0, 102, 102));
        Lname.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Lname.setForeground(new java.awt.Color(240, 240, 240));
        Lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lname.setBorder(null);
        jPanel1.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 142, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Date of Birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        DOB.setBackground(new java.awt.Color(0, 102, 102));
        DOB.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        DOB.setForeground(new java.awt.Color(240, 240, 240));
        DOB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DOB.setBorder(null);
        jPanel1.add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 142, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        Country.setBackground(new java.awt.Color(0, 102, 102));
        Country.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Country.setForeground(new java.awt.Color(240, 240, 240));
        Country.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Country.setBorder(null);
        Country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryActionPerformed(evt);
            }
        });
        jPanel1.add(Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 142, -1));

        Pno.setBackground(new java.awt.Color(0, 102, 102));
        Pno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Pno.setForeground(new java.awt.Color(240, 240, 240));
        Pno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pno.setBorder(null);
        jPanel1.add(Pno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 142, -1));

        Email.setBackground(new java.awt.Color(0, 102, 102));
        Email.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Email.setForeground(new java.awt.Color(240, 240, 240));
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.setBorder(null);
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 142, -1));

        Unameregister.setBackground(new java.awt.Color(0, 102, 102));
        Unameregister.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Unameregister.setForeground(new java.awt.Color(240, 240, 240));
        Unameregister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Unameregister.setBorder(null);
        Unameregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameregisterActionPerformed(evt);
            }
        });
        jPanel1.add(Unameregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 142, -1));

        PasswordRegister.setBackground(new java.awt.Color(0, 102, 102));
        PasswordRegister.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        PasswordRegister.setForeground(new java.awt.Color(240, 240, 240));
        PasswordRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordRegister.setBorder(null);
        jPanel1.add(PasswordRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 142, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Passport No");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, 10));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Middle Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Surename");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Country");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        Register.setBackground(new java.awt.Color(51, 255, 204));
        Register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(0, 51, 51));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 99, 37));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Register Here");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 240, 20));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 160, 20));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 100, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/Autodesk-Smoke-icon.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("JETAIR");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 530));

        Fname.setBackground(new java.awt.Color(0, 102, 102));
        Fname.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Fname.setForeground(new java.awt.Color(240, 240, 240));
        Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fname.setBorder(null);
        jPanel1.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 142, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, 2));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, 2));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 142, 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 142, 2));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 142, 2));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 142, 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 142, 2));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 142, 2));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 142, 2));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        gender ="male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    gender = "female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
    
        String fname = Fname.getText();
        String mname = Mname.getText();
        String lname = Lname.getText();
        String dob = DOB.getText();
        String country = Country.getText();
        String pport = Pno.getText();
        String email = Email.getText();
        String uname = Unameregister.getText();
        String pword = PasswordRegister.getText();//get the data from text boxes
        
        
        
        PreparedStatement ps;//database insert string
        String query ="INSERT INTO `passenger`(`FName`,`MName`,`SName`,`DoB`,`Country`,`PassportNo`,`Email`,`Gender`,`username`,`password`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try// exception handling
        {
        ps = sqlconnection.getConnection().prepareStatement(query);
        ps.setString(1, fname);
        ps.setString(2, mname);
        ps.setString(3, lname);
        ps.setString(4, dob);
        ps.setString(5, country);
        ps.setString(6, pport);
        ps.setString(7, email);
        ps.setString(8, gender);//gender is directly get from button event
        ps.setString(9, uname);
        ps.setString(10, pword);
        
        
        if(ps.executeUpdate() > 0);
        {
            JOptionPane.showMessageDialog(null, "New User Add");//messege box is appearing when database connected
        }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Not Added");//messege box is appearing when database has not connected
        
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void CountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryActionPerformed
       
    }//GEN-LAST:event_CountryActionPerformed

    private void UnameregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameregisterActionPerformed
        
    }//GEN-LAST:event_UnameregisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Country;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField Mname;
    private javax.swing.JTextField PasswordRegister;
    private javax.swing.JTextField Pno;
    private javax.swing.JButton Register;
    private javax.swing.JTextField Unameregister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
