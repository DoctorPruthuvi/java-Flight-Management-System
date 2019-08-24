
package javaass1;
import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 * @author pruthuvi deshan
 */
public class Login extends javax.swing.JFrame {
    public home home;//declare home page
    public register register;
    public Connection cn;
    public Statement st;
    
    public Login() 
    {
        initComponents();
        this.setLocationRelativeTo(null);//set page to middle position
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsass?zeroDateTimeBehavior=convertToNull","root","");//sql connection database name:lmsass
            st=cn.createStatement();
            JOptionPane.showMessageDialog(null," Connected");
        }
        catch (HeadlessException | ClassNotFoundException | SQLException e)
        {
             JOptionPane.showMessageDialog(null,"Not Connected");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loginusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginpassword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        loginregister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 120, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 60, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaass1/Autodesk-Smoke-icon (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("JETAIR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 410));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Password");

        loginusername.setBackground(new java.awt.Color(0, 102, 102));
        loginusername.setForeground(new java.awt.Color(240, 240, 240));
        loginusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginusername.setBorder(null);
        loginusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginusernameActionPerformed(evt);
            }
        });
        loginusername.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                loginusernamePropertyChange(evt);
            }
        });
        loginusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginusernameKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Username");

        loginpassword.setBackground(new java.awt.Color(0, 102, 102));
        loginpassword.setForeground(new java.awt.Color(240, 240, 240));
        loginpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginpassword.setBorder(null);
        loginpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginpasswordKeyPressed(evt);
            }
        });

        login.setBackground(new java.awt.Color(51, 255, 204));
        login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(0, 51, 51));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        loginregister.setBackground(new java.awt.Color(51, 255, 204));
        loginregister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginregister.setForeground(new java.awt.Color(0, 51, 51));
        loginregister.setText("signup");
        loginregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginregisterMouseClicked(evt);
            }
        });
        loginregister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginregisterKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(loginregister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginusername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loginusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loginpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginregister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 330, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginusernameActionPerformed
        
    }//GEN-LAST:event_loginusernameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try 
        {
            String sql="select * from passenger where username = '"+ loginusername.getText()+"'and password = '" +String.valueOf(loginpassword.getPassword())+"'";
            ResultSet rss = st.executeQuery(sql);//sql connection database name:lmsass
            if (rss.next())
            {
                home = new home();
                home.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Wrong email or password");
            }
        }
            catch(HeadlessException | SQLException e)
            {
     JOptionPane.showMessageDialog(null,"database not connected");
            }
    }//GEN-LAST:event_loginActionPerformed

    private void loginusernamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_loginusernamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_loginusernamePropertyChange

    private void loginusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginusernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginusernameKeyPressed

    private void loginpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginpasswordKeyPressed
        
        if(evt.getKeyCode() ==KeyEvent.VK_ENTER )//login with enter key
        {
            
             try 
             {
                String sql="select * from passenger where username = '"+ loginusername.getText()+"'and password = '" +String.valueOf(loginpassword.getPassword())+"'";
                 ResultSet rss = st.executeQuery(sql);
               if (rss.next())
                 { 
                  home = new home();// home wii be appere when email and password is correct
                  home.setVisible(true);
                  this.dispose();
                 }
              else
                {
                  JOptionPane.showMessageDialog(null,"Wrong email or password");
                }
             }
            catch(HeadlessException | SQLException e)
            {
                 JOptionPane.showMessageDialog(null,"database not connected");
            }
        }
    }//GEN-LAST:event_loginpasswordKeyPressed

    private void loginregisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginregisterKeyPressed

    }//GEN-LAST:event_loginregisterKeyPressed

    private void loginregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginregisterMouseClicked
                
                register = new register();// going to register page
                register.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_loginregisterMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField loginpassword;
    private javax.swing.JButton loginregister;
    private javax.swing.JTextField loginusername;
    // End of variables declaration//GEN-END:variables
}
