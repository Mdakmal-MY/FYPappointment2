/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fypappointment2;

import java.awt.Color;
import javaBean.users;
import javax.swing.JOptionPane;

/**
 *
 * @author KaizoDono
 */
public class adminUpdate extends javax.swing.JFrame implements Info {

    /**
     * Creates new form adminUpdate
     */
    public adminUpdate() {
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

        bgPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        displayName = new javax.swing.JLabel();
        homeBtn = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        manageBtn = new javax.swing.JPanel();
        manageLabel = new javax.swing.JLabel();
        manageIcon = new javax.swing.JLabel();
        updateBtn = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        updateIcon = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        fnameField = new javax.swing.JTextField();
        FnameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        LnameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        lnameField = new javax.swing.JTextField();
        emailField1 = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        phoneNumLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        updateBtn2 = new javax.swing.JPanel();
        updateLabel2 = new javax.swing.JLabel();
        useridField = new javax.swing.JTextField();
        useridLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setPreferredSize(new java.awt.Dimension(850, 597));

        menuPanel.setBackground(new java.awt.Color(41, 41, 48));

        welcomeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome");

        displayName.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        displayName.setForeground(new java.awt.Color(255, 255, 255));
        displayName.setText("Welcome");

        homeBtn.setBackground(new java.awt.Color(41, 41, 48));
        homeBtn.setForeground(new java.awt.Color(0, 153, 153));
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText("Home");

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fypappointment2/icon/003-home.png"))); // NOI18N

        javax.swing.GroupLayout homeBtnLayout = new javax.swing.GroupLayout(homeBtn);
        homeBtn.setLayout(homeBtnLayout);
        homeBtnLayout.setHorizontalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(homeLabel)
                .addGap(18, 18, 18)
                .addComponent(homeIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeBtnLayout.setVerticalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        manageBtn.setBackground(new java.awt.Color(41, 41, 48));
        manageBtn.setForeground(new java.awt.Color(0, 153, 153));
        manageBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageBtnMouseExited(evt);
            }
        });

        manageLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        manageLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageLabel.setText("User Managament");

        manageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fypappointment2/icon/004-employee.png"))); // NOI18N

        javax.swing.GroupLayout manageBtnLayout = new javax.swing.GroupLayout(manageBtn);
        manageBtn.setLayout(manageBtnLayout);
        manageBtnLayout.setHorizontalGroup(
            manageBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageBtnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(manageLabel)
                .addGap(18, 18, 18)
                .addComponent(manageIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageBtnLayout.setVerticalGroup(
            manageBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updateBtn.setBackground(new java.awt.Color(225, 43, 56));
        updateBtn.setForeground(new java.awt.Color(0, 153, 153));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnMouseExited(evt);
            }
        });

        updateLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        updateLabel.setForeground(new java.awt.Color(255, 255, 255));
        updateLabel.setText("Update Account");

        updateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fypappointment2/icon/002-settings.png"))); // NOI18N

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(updateLabel)
                .addGap(18, 18, 18)
                .addComponent(updateIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoutBtn.setBackground(new java.awt.Color(41, 41, 48));
        logoutBtn.setForeground(new java.awt.Color(0, 153, 153));
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Logout");

        logoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fypappointment2/icon/005-logout.png"))); // NOI18N

        javax.swing.GroupLayout logoutBtnLayout = new javax.swing.GroupLayout(logoutBtn);
        logoutBtn.setLayout(logoutBtnLayout);
        logoutBtnLayout.setHorizontalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel)
                .addGap(18, 18, 18)
                .addComponent(logoutIcon)
                .addGap(52, 52, 52))
        );
        logoutBtnLayout.setVerticalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel)
                .addGap(31, 31, 31)
                .addComponent(displayName)
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel)
                    .addComponent(displayName))
                .addGap(43, 43, 43)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(225, 43, 56));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FnameLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        FnameLabel.setText("First Name:");

        usernameLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        usernameLabel.setText("User Name:");

        LnameLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LnameLabel.setText("Last Name:");

        passwordLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        passwordLabel.setText("Password:");

        phoneNumLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        phoneNumLabel.setText("Phone Number:");

        emailLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        emailLabel.setText("Email Address:");

        updateBtn2.setBackground(new java.awt.Color(62, 182, 80));
        updateBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtn2MouseExited(evt);
            }
        });

        updateLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        updateLabel2.setForeground(new java.awt.Color(255, 255, 255));
        updateLabel2.setText("Update");

        javax.swing.GroupLayout updateBtn2Layout = new javax.swing.GroupLayout(updateBtn2);
        updateBtn2.setLayout(updateBtn2Layout);
        updateBtn2Layout.setHorizontalGroup(
            updateBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateBtn2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(updateLabel2)
                .addGap(21, 21, 21))
        );
        updateBtn2Layout.setVerticalGroup(
            updateBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateBtn2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateLabel2)
                .addContainerGap())
        );

        useridField.setEditable(false);

        useridLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        useridLabel.setText("User ID");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLabel)
                            .addComponent(FnameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(phoneNumLabel)
                            .addComponent(emailLabel)
                            .addComponent(useridLabel))
                        .addGap(18, 18, 18)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgPanelLayout.createSequentialGroup()
                                        .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LnameLabel))
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(useridField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useridField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useridLabel))
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel))
                        .addGap(26, 26, 26)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FnameLabel)
                            .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumLabel))
                        .addGap(18, 18, 18)
                        .addComponent(emailField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailLabel))
                .addGap(26, 26, 26)
                .addComponent(updateBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(148, 148, 148))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        // TODO add your handling code here:
        adminHome goHome = new adminHome();
        goHome.setDisplayName(displayName.getText());
        goHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        // TODO add your handling code here:
        homeBtn.setBackground(new Color( 225, 43, 56 ));
        updateBtn.setBackground(new Color( 225, 43, 56));
        manageBtn.setBackground(new Color( 41, 41, 48 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 225, 43, 56));
        manageBtn.setBackground(new Color( 41, 41, 48));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_homeBtnMouseExited

    private void manageBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBtnMouseEntered
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 225, 43, 56));
        manageBtn.setBackground(new Color( 225, 43, 56 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_manageBtnMouseEntered

    private void manageBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBtnMouseExited
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 225, 43, 56));
        manageBtn.setBackground(new Color( 41, 41, 48 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_manageBtnMouseExited

    private void updateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseEntered
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 225, 43, 56));
        manageBtn.setBackground(new Color( 41, 41, 48 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_updateBtnMouseEntered

    private void updateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseExited
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 225, 43, 56));
        manageBtn.setBackground(new Color( 41, 41, 48 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_updateBtnMouseExited

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        // TODO add your handling code here:
        Login main = new Login();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 225, 43, 56));
        manageBtn.setBackground(new Color( 41, 41, 48));
        logoutBtn.setBackground(new Color( 225, 43, 56));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color(225, 43, 56));
        manageBtn.setBackground(new Color( 41, 41, 48));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void updateBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn2MouseClicked
        users u = new users();
        u.setUserID(useridField.getText());
        u.setUsername(usernameField.getText());
        u.setFname(fnameField.getText());
        u.setLname(lnameField.getText());
        u.setPassword(passwordField.getText());
        u.setEmail(emailField1.getText());
        u.setPhoneNum(phoneField.getText());
        String status = appointmentsysDAO.updateAccStaff(u);
        if(!status.equals(null))
        {
            JOptionPane.showMessageDialog(null, "Updated", "Status", JOptionPane.INFORMATION_MESSAGE);
            setDisplayName(status);
        }
    }//GEN-LAST:event_updateBtn2MouseClicked

    private void updateBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn2MouseEntered
        updateBtn2.setBackground(new Color( 5, 124, 23));
    }//GEN-LAST:event_updateBtn2MouseEntered

    private void updateBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn2MouseExited
        updateBtn2.setBackground(new Color( 62, 182, 80));
    }//GEN-LAST:event_updateBtn2MouseExited

    private void manageBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBtnMouseClicked
        adminManage goManage = new adminManage();
        goManage.setDisplayName(displayName.getText());
        goManage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageBtnMouseClicked
    
    public void setDisplayName(String name)
    {        
        displayName.setText(name);
        users u = appointmentsysDAO.updateAccStaff(name);
        useridField.setText(u.getUserID());
        usernameField.setText(u.getUsername());
        fnameField.setText(u.getFname());
        lnameField.setText(u.getLname());
        emailField1.setText(u.getEmail());
        passwordField.setText(u.getPassword());
        phoneField.setText(u.getPhoneNum());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FnameLabel;
    private javax.swing.JLabel LnameLabel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel displayName;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField emailField1;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fnameField;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lnameField;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel manageBtn;
    private javax.swing.JLabel manageIcon;
    private javax.swing.JLabel manageLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneNumLabel;
    private javax.swing.JPanel updateBtn;
    private javax.swing.JPanel updateBtn2;
    private javax.swing.JLabel updateIcon;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JLabel updateLabel2;
    private javax.swing.JTextField useridField;
    private javax.swing.JLabel useridLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
