/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GroupProject;

import javax.swing.*;
import java.util.List;

/**
 *
 * @author dianaevtimova
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        LogoSide = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DataSide = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        password_input = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();
        noaccount = new javax.swing.JLabel();
        sigup_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        LogoSide.setBackground(new java.awt.Color(255, 255, 255));
        LogoSide.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon("src/Java.png"));// NOI18N
        jLabel1.setBounds(0, 0, 400, 500);
        jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel1.setVerticalAlignment(SwingConstants.TOP);
        //jLabel1.setPreferredSize(new java.awt.Dimension(330, 400));
        //jLabel1.setMaximumSize(new java.awt.Dimension(1246, 2272));
        //jLabel1.setMinimumSize(new java.awt.Dimension(1246, 2272));

        javax.swing.GroupLayout LogoSideLayout = new javax.swing.GroupLayout(LogoSide);
        LogoSide.setLayout(LogoSideLayout);
        LogoSideLayout.setHorizontalGroup(
            LogoSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoSideLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        LogoSideLayout.setVerticalGroup(
            LogoSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoSideLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanel1.add(LogoSide);
        LogoSide.setBounds(0, 0, 400, 500);

        DataSide.setBackground(new java.awt.Color(255, 204, 153));
        DataSide.setMinimumSize(new java.awt.Dimension(400, 500));

        login.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        login.setForeground(new java.awt.Color(50, 91, 110));
        login.setText("LOGIN");

        username.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(50, 91, 110));
        username.setText("Username: ");

        username_input.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        password.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(50, 91, 110));
        password.setText("Password:");

        login_button.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        login_button.setForeground(new java.awt.Color(50, 91, 110));
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        noaccount.setFont(new java.awt.Font("Georgia", 2, 16)); // NOI18N
        noaccount.setText("You don't have an account?");

        sigup_button.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sigup_button.setForeground(new java.awt.Color(50, 91, 110));
        sigup_button.setText("Sign Up");
        sigup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigup_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataSideLayout = new javax.swing.GroupLayout(DataSide);
        DataSide.setLayout(DataSideLayout);
        DataSideLayout.setHorizontalGroup(
            DataSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataSideLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(DataSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataSideLayout.createSequentialGroup()
                        .addGroup(DataSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DataSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataSideLayout.createSequentialGroup()
                                    .addComponent(noaccount)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sigup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username)
                                .addComponent(password)
                                .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataSideLayout.createSequentialGroup()
                        .addComponent(login)
                        .addGap(129, 129, 129))))
        );
        DataSideLayout.setVerticalGroup(
            DataSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataSideLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(login)
                .addGap(42, 42, 42)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(DataSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sigup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noaccount))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(DataSide);
        DataSide.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sigup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigup_buttonActionPerformed
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
         
        //Let the frame be displayed in the center
        SignUpFrame.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_sigup_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed

        String enteredUsername = username_input.getText();
        String enteredPassword = new String(password_input.getPassword());

        // Hash the entered password for comparison
        String hashedPassword = HashingUtil.hashPassword(enteredPassword);

        List<User> users = CsvHandler.readUsers();

        for (User user : users) {
            if (user.getUsername().equals(enteredUsername) && user.getHashedPassword().equals(hashedPassword)) {
                // User found, proceed with login
                Difficulty DifficultyFrame = new Difficulty();
                DifficultyFrame.setVisible(true);
                DifficultyFrame.pack();
                DifficultyFrame.setLocationRelativeTo(null);
                this.dispose();
                return;
            }
        }

        // Display a message that the user doesn't exist
        JOptionPane.showMessageDialog(this, "User doesn't exist", "Login Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_login_buttonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataSide;
    private javax.swing.JPanel LogoSide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel noaccount;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JButton sigup_button;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}
