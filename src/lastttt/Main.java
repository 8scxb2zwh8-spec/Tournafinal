/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastttt;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Main extends javax.swing.JFrame {

   public Main() {
        initComponents();
        setLocationRelativeTo(null); 
// center window
    }
   private Connection connectDB() {
    try {
        String url = "jdbc:mysql://localhost:3306/accounts";
        String user = "root";
        String pass = ""; // put your MySQL password if you have one

        return DriverManager.getConnection(url, user, pass);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database connection failed");
        e.printStackTrace();
        return null;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        mainPanel = new javax.swing.JPanel();
        Signup = new javax.swing.JPanel();
        Page1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        SignUp = new javax.swing.JButton();
        Login = new javax.swing.JPanel();
        page1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LogIn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        email2 = new javax.swing.JTextField();
        password2 = new javax.swing.JPasswordField();
        Mainmenu = new javax.swing.JPanel();
        pge1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        profile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        map = new javax.swing.JButton();
        shops = new javax.swing.JButton();
        vl = new javax.swing.JButton();
        tf = new javax.swing.JButton();
        notif = new javax.swing.JButton();
        message = new javax.swing.JButton();
        maps = new javax.swing.JPanel();
        pg1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        shop = new javax.swing.JPanel();
        Pg1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        backk = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        vidslive = new javax.swing.JPanel();
        Pge1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        back3 = new javax.swing.JButton();
        teamsandfriends = new javax.swing.JPanel();
        P1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        back4 = new javax.swing.JButton();
        profiletab = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        back5 = new javax.swing.JButton();
        notification = new javax.swing.JPanel();
        PGE1 = new javax.swing.JPanel();
        back6 = new javax.swing.JButton();
        chats = new javax.swing.JPanel();
        pGe1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        back7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setLayout(new java.awt.CardLayout());

        Page1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TournaMeet");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Create an Account");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Already have an account?");

        login.setBackground(new java.awt.Color(255, 102, 0));
        login.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        login.setText("Log In");
        login.setBorder(null);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-google-20.png"))); // NOI18N
        jButton4.setText("Sign Up with Google");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-facebook-20.png"))); // NOI18N
        jButton5.setText("Sign Up with Facebook");

        SignUp.setBackground(new java.awt.Color(204, 204, 204));
        SignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Page1Layout = new javax.swing.GroupLayout(Page1);
        Page1.setLayout(Page1Layout);
        Page1Layout.setHorizontalGroup(
            Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Page1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Page1Layout.createSequentialGroup()
                        .addGroup(Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 171, Short.MAX_VALUE))
                    .addComponent(SignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email)
                    .addComponent(password))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Page1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Page1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        Page1Layout.setVerticalGroup(
            Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(login))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SignupLayout = new javax.swing.GroupLayout(Signup);
        Signup.setLayout(SignupLayout);
        SignupLayout.setHorizontalGroup(
            SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SignupLayout.setVerticalGroup(
            SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(Signup, "Home");

        page1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Log In with an Account");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        LogIn.setBackground(new java.awt.Color(153, 153, 153));
        LogIn.setText("Log In");
        LogIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        jLabel10.setText("Don't have an account?");

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Showcard Gothic", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TournaMeet");

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-google-20.png"))); // NOI18N
        jButton6.setText("Log In with Google");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-facebook-20.png"))); // NOI18N
        jButton7.setText("Log In with Facebook");

        password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout page1Layout = new javax.swing.GroupLayout(page1);
        page1.setLayout(page1Layout);
        page1Layout.setHorizontalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(page1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(page1Layout.createSequentialGroup()
                        .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(page1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email2)
                            .addComponent(password2))
                        .addGap(20, 20, 20))))
            .addGroup(page1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(page1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5))
                    .addGroup(page1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogIn)
                .addGap(18, 18, 18)
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(Login, "Login");

        pge1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TournaMeet");

        jPanel1.setBackground(new java.awt.Color(255, 59, 0));

        profile.setBackground(new java.awt.Color(255, 59, 0));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-profile-25.png"))); // NOI18N
        profile.setBorder(null);
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("My Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(228, 91, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-volleyball-45.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setPreferredSize(new java.awt.Dimension(80, 80));

        jButton3.setBackground(new java.awt.Color(228, 91, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-basketball-45.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton8.setBackground(new java.awt.Color(228, 91, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-badminton-45.png"))); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton9.setBackground(new java.awt.Color(228, 91, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-arnis-45.png"))); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton10.setBackground(new java.awt.Color(228, 91, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-tennis-racquet-45.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton11.setBackground(new java.awt.Color(228, 91, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-ping-pong-racket-45.png"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton12.setBackground(new java.awt.Color(228, 91, 0));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-baseball-45.png"))); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton13.setBackground(new java.awt.Color(228, 91, 0));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-taekwondo-45.png"))); // NOI18N
        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton14.setBackground(new java.awt.Color(228, 91, 0));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-swimming-45.png"))); // NOI18N
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 59, 0));

        home.setBackground(new java.awt.Color(255, 102, 0));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-home-20.png"))); // NOI18N
        home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        map.setBackground(new java.awt.Color(255, 102, 0));
        map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-map-20.png"))); // NOI18N
        map.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapActionPerformed(evt);
            }
        });

        shops.setBackground(new java.awt.Color(255, 102, 0));
        shops.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-livestream-20.png"))); // NOI18N
        shops.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        shops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopsActionPerformed(evt);
            }
        });

        vl.setBackground(new java.awt.Color(255, 102, 0));
        vl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-cart-20.png"))); // NOI18N
        vl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vlActionPerformed(evt);
            }
        });

        tf.setBackground(new java.awt.Color(255, 102, 0));
        tf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-team-20.png"))); // NOI18N
        tf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shops, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(vl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shops, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        notif.setBackground(new java.awt.Color(255, 102, 0));
        notif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-notification-24.png"))); // NOI18N
        notif.setBorder(null);
        notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifActionPerformed(evt);
            }
        });

        message.setBackground(new java.awt.Color(255, 102, 0));
        message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastttt/icons8-chats-20.png"))); // NOI18N
        message.setBorder(null);
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pge1Layout = new javax.swing.GroupLayout(pge1);
        pge1.setLayout(pge1Layout);
        pge1Layout.setHorizontalGroup(
            pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pge1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pge1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notif, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pge1Layout.createSequentialGroup()
                        .addGroup(pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pge1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pge1Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pge1Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pge1Layout.setVerticalGroup(
            pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pge1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notif, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout MainmenuLayout = new javax.swing.GroupLayout(Mainmenu);
        Mainmenu.setLayout(MainmenuLayout);
        MainmenuLayout.setHorizontalGroup(
            MainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pge1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainmenuLayout.setVerticalGroup(
            MainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pge1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(Mainmenu, "Mainmenu");

        pg1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel5.setBackground(new java.awt.Color(255, 59, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Maps");

        back1.setBackground(new java.awt.Color(255, 59, 0));
        back1.setBorder(null);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel16)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pg1Layout = new javax.swing.GroupLayout(pg1);
        pg1.setLayout(pg1Layout);
        pg1Layout.setHorizontalGroup(
            pg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pg1Layout.setVerticalGroup(
            pg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pg1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mapsLayout = new javax.swing.GroupLayout(maps);
        maps.setLayout(mapsLayout);
        mapsLayout.setHorizontalGroup(
            mapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mapsLayout.setVerticalGroup(
            mapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(maps, "maps");

        Pg1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel3.setBackground(new java.awt.Color(255, 59, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Shop");

        backk.setBackground(new java.awt.Color(255, 59, 0));
        backk.setBorder(null);
        backk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backkActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 59, 0));
        jButton16.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(64, 64, 64)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(backk, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Pg1Layout = new javax.swing.GroupLayout(Pg1);
        Pg1.setLayout(Pg1Layout);
        Pg1Layout.setHorizontalGroup(
            Pg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pg1Layout.setVerticalGroup(
            Pg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pg1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 446, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout shopLayout = new javax.swing.GroupLayout(shop);
        shop.setLayout(shopLayout);
        shopLayout.setHorizontalGroup(
            shopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        shopLayout.setVerticalGroup(
            shopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(shop, "shop");

        Pge1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel6.setBackground(new java.awt.Color(255, 59, 0));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel17.setText("Videos and Livestreams");

        back3.setBackground(new java.awt.Color(255, 59, 0));
        back3.setBorder(null);
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Pge1Layout = new javax.swing.GroupLayout(Pge1);
        Pge1.setLayout(Pge1Layout);
        Pge1Layout.setHorizontalGroup(
            Pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pge1Layout.setVerticalGroup(
            Pge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pge1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vidsliveLayout = new javax.swing.GroupLayout(vidslive);
        vidslive.setLayout(vidsliveLayout);
        vidsliveLayout.setHorizontalGroup(
            vidsliveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pge1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        vidsliveLayout.setVerticalGroup(
            vidsliveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pge1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(vidslive, "vidslive");

        P1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel7.setBackground(new java.awt.Color(255, 59, 0));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Teams and Friends");

        back4.setBackground(new java.awt.Color(255, 59, 0));
        back4.setBorder(null);
        back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout teamsandfriendsLayout = new javax.swing.GroupLayout(teamsandfriends);
        teamsandfriends.setLayout(teamsandfriendsLayout);
        teamsandfriendsLayout.setHorizontalGroup(
            teamsandfriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        teamsandfriendsLayout.setVerticalGroup(
            teamsandfriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(teamsandfriends, "teamsandfriends");

        p1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel8.setBackground(new java.awt.Color(255, 59, 0));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("My Profile");

        back5.setBackground(new java.awt.Color(255, 59, 0));
        back5.setBorder(null);
        back5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel19)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout profiletabLayout = new javax.swing.GroupLayout(profiletab);
        profiletab.setLayout(profiletabLayout);
        profiletabLayout.setHorizontalGroup(
            profiletabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        profiletabLayout.setVerticalGroup(
            profiletabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(profiletab, "profile");

        PGE1.setBackground(new java.awt.Color(255, 102, 0));

        back6.setText("back");
        back6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PGE1Layout = new javax.swing.GroupLayout(PGE1);
        PGE1.setLayout(PGE1Layout);
        PGE1Layout.setHorizontalGroup(
            PGE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PGE1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back6)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        PGE1Layout.setVerticalGroup(
            PGE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PGE1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back6)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout notificationLayout = new javax.swing.GroupLayout(notification);
        notification.setLayout(notificationLayout);
        notificationLayout.setHorizontalGroup(
            notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PGE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        notificationLayout.setVerticalGroup(
            notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PGE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(notification, "notification");

        pGe1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel4.setBackground(new java.awt.Color(255, 59, 0));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Chats");

        back7.setBackground(new java.awt.Color(255, 59, 0));
        back7.setBorder(null);
        back7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("No chats yet");

        javax.swing.GroupLayout pGe1Layout = new javax.swing.GroupLayout(pGe1);
        pGe1.setLayout(pGe1Layout);
        pGe1Layout.setHorizontalGroup(
            pGe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pGe1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel15)
                .addGap(0, 82, Short.MAX_VALUE))
        );
        pGe1Layout.setVerticalGroup(
            pGe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGe1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(jLabel15)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout chatsLayout = new javax.swing.GroupLayout(chats);
        chats.setLayout(chatsLayout);
        chatsLayout.setHorizontalGroup(
            chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pGe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chatsLayout.setVerticalGroup(
            chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pGe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(chats, "chats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
       String email = email2.getText();          // replace 'emailField' with your JTextField name
    String password = new String(password2.getPassword()); // replace 'passwordField' with your JPasswordField name

    // Check if email or password is empty
    if(email.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both email and password.", "Login Error", JOptionPane.WARNING_MESSAGE);
        return; // Stop here, do not redirect
    }

    // If both fields are filled, proceed to Mainmenu
    java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "Mainmenu");
    }//GEN-LAST:event_LogInActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        CardLayout cl = (CardLayout) (mainPanel.getLayout());
        cl.show(mainPanel, "Login");
    }//GEN-LAST:event_loginActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        String userEmail = email.getText();
    String userPassword = String.valueOf(password.getPassword());

    // 1️⃣ Validate input
    if (userEmail.isEmpty() || userPassword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields");
        return;
    }

    try {
        Connection con = connectDB();

        String sql = "INSERT INTO users (email, password) VALUES (?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, userEmail);
        pst.setString(2, userPassword);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Sign up successful!");

        // Clear fields
        email.setText("");
        password.setText("");

        // Go to Login page
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "Login");

    } catch (SQLException e) {

        // 2️⃣ Duplicate email (PRIMARY KEY violation)
        if (e.getErrorCode() == 1062) { // MySQL duplicate key error
            JOptionPane.showMessageDialog(this, "Email already in use");
        } else {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error");
        }
    }
    }//GEN-LAST:event_SignUpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         CardLayout cl = (CardLayout) (mainPanel.getLayout());

        cl.show(mainPanel, "Home");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password2ActionPerformed

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
       java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "chats");
    }//GEN-LAST:event_messageActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "profile");
    }//GEN-LAST:event_profileActionPerformed

    private void notifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "notification");
    new javax.swing.Timer(3000, e -> cl.show(mainPanel, "Mainmenu")).start();
    }//GEN-LAST:event_notifActionPerformed

    private void back5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back5ActionPerformed
         java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "Mainmenu");
    }//GEN-LAST:event_back5ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "Mainmenu");
    }//GEN-LAST:event_back1ActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
         java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "Mainmenu");
    }//GEN-LAST:event_back3ActionPerformed

    private void back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back4ActionPerformed
         java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "Mainmenu");
    }//GEN-LAST:event_back4ActionPerformed

    private void back6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back6ActionPerformed
         java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "Mainmenu");
    }//GEN-LAST:event_back6ActionPerformed

    private void back7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back7ActionPerformed
         java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
    cl.show(mainPanel, "Mainmenu");
    }//GEN-LAST:event_back7ActionPerformed

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "teamsandfriends");
    }//GEN-LAST:event_tfActionPerformed

    private void vlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vlActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "vidslive");
    }//GEN-LAST:event_vlActionPerformed

    private void shopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopsActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "shop");
    }//GEN-LAST:event_shopsActionPerformed

    private void mapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "maps");
    }//GEN-LAST:event_mapActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed

    }//GEN-LAST:event_homeActionPerformed

    private void backkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backkActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "Mainmenu");
    }//GEN-LAST:event_backkActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Mainmenu;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel PGE1;
    private javax.swing.JPanel Page1;
    private javax.swing.JPanel Pg1;
    private javax.swing.JPanel Pge1;
    private javax.swing.JButton SignUp;
    private javax.swing.JPanel Signup;
    private javax.swing.JButton back1;
    private javax.swing.JButton back3;
    private javax.swing.JButton back4;
    private javax.swing.JButton back5;
    private javax.swing.JButton back6;
    private javax.swing.JButton back7;
    private javax.swing.JButton backk;
    private javax.swing.JPanel chats;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email2;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton login;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton map;
    private javax.swing.JPanel maps;
    private javax.swing.JButton message;
    private javax.swing.JButton notif;
    private javax.swing.JPanel notification;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel pGe1;
    private javax.swing.JPanel page1;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JPanel pg1;
    private javax.swing.JPanel pge1;
    private javax.swing.JButton profile;
    private javax.swing.JPanel profiletab;
    private javax.swing.JPanel shop;
    private javax.swing.JButton shops;
    private javax.swing.JPanel teamsandfriends;
    private javax.swing.JButton tf;
    private javax.swing.JPanel vidslive;
    private javax.swing.JButton vl;
    // End of variables declaration//GEN-END:variables
}
