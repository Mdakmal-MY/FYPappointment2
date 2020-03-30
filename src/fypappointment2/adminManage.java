/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fypappointment2;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javaBean.users;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KaizoDono
 */
public class adminManage extends javax.swing.JFrame implements Info {

    /**
     * Creates new form adminManage
     */
    public adminManage() {
        initComponents();
        tableComponents();
        viewUser();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        idDisplay = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JPanel();
        deleteLabel = new javax.swing.JLabel();
        addBtn = new javax.swing.JPanel();
        addLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        manageBtn.setBackground(new java.awt.Color(225, 43, 56));
        manageBtn.setForeground(new java.awt.Color(0, 153, 153));
        manageBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
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

        updateBtn.setBackground(new java.awt.Color(41, 41, 48));
        updateBtn.setForeground(new java.awt.Color(0, 153, 153));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
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
                .addContainerGap(156, Short.MAX_VALUE))
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
                .addContainerGap(48, Short.MAX_VALUE)
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

        userTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Username", "First Name", "Last Name", "Level", "Last Login"
            }
        ));
        userTable.setFocusable(false);
        userTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        userTable.setRowHeight(25);
        userTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        userTable.setShowVerticalLines(false);
        userTable.getTableHeader().setResizingAllowed(false);
        userTable.getTableHeader().setReorderingAllowed(false);
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        idDisplay.setEditable(false);
        idDisplay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        deleteBtn.setBackground(new java.awt.Color(225, 43, 56));
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnMouseExited(evt);
            }
        });

        deleteLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deleteLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteLabel.setText("Delete");

        javax.swing.GroupLayout deleteBtnLayout = new javax.swing.GroupLayout(deleteBtn);
        deleteBtn.setLayout(deleteBtnLayout);
        deleteBtnLayout.setHorizontalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBtnLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(deleteLabel)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        deleteBtnLayout.setVerticalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteLabel)
                .addContainerGap())
        );

        addBtn.setBackground(new java.awt.Color(62, 182, 80));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
        });

        addLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        addLabel.setForeground(new java.awt.Color(255, 255, 255));
        addLabel.setText("Add Lecturer");

        javax.swing.GroupLayout addBtnLayout = new javax.swing.GroupLayout(addBtn);
        addBtn.setLayout(addBtnLayout);
        addBtnLayout.setHorizontalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addLabel)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        addBtnLayout.setVerticalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBtnLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(addLabel)
                .addContainerGap())
        );

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(idDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idDisplay)
                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableComponents()
    {
        userTable.getTableHeader().setFont(new Font("Calibri",Font.BOLD, 14));
        userTable.getTableHeader().setOpaque(false);
        userTable.getTableHeader().setBackground(new Color(255, 22, 22));
        userTable.getTableHeader().setForeground(Color.white);
        userTable.setRowHeight(25);
    
    }
    
    public void viewUser()
    {
        model = (DefaultTableModel) userTable.getModel();
        ArrayList<users> User = appointmentsysDAO.getveiwUser();
        Object data[] = new Object[6];

        for(int i= 0; i<User.size(); i++)
        {
            data[0] = User.get(i).getUserID();
            data[1] = User.get(i).getUsername();
            data[2] = User.get(i).getFname();
            data[3] = User.get(i).getLname();
            data[4] = User.get(i).getUserLevel();
            data[5] = User.get(i).getDate();
            model.addRow(data); 
        }
    }
    
    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        // TODO add your handling code here:
        homeBtn.setBackground(new Color( 225, 43, 56 ));
        updateBtn.setBackground(new Color( 41, 41, 48));
        manageBtn.setBackground(new Color( 225, 43, 56 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 41, 41, 48));
        manageBtn.setBackground(new Color( 225, 43, 56 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_homeBtnMouseExited

    private void manageBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBtnMouseEntered
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 41, 41, 48));
        manageBtn.setBackground(new Color( 225, 43, 56 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_manageBtnMouseEntered

    private void manageBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBtnMouseExited
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 41, 41, 48));
        manageBtn.setBackground(new Color( 225, 43, 56 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_manageBtnMouseExited

    private void updateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseEntered
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 225, 43, 56));
        manageBtn.setBackground(new Color( 225, 43, 56 ));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_updateBtnMouseEntered

    private void updateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseExited
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 41, 41, 48));
        manageBtn.setBackground(new Color( 225, 43, 56 ));
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
        updateBtn.setBackground(new Color( 41, 41, 48));
        manageBtn.setBackground(new Color( 225, 43, 56));
        logoutBtn.setBackground(new Color( 225, 43, 56));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        homeBtn.setBackground(new Color( 41, 41, 48));
        updateBtn.setBackground(new Color( 41, 41, 48));
        manageBtn.setBackground(new Color( 225, 43, 56));
        logoutBtn.setBackground(new Color( 41, 41, 48));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        // TODO add your handling code here:
        adminHome goHome = new adminHome();
        goHome.setDisplayName(displayName.getText());
        goHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        int row = userTable.getSelectedRow();
        idDisplay.setText(model.getValueAt(row, 0).toString());
    }//GEN-LAST:event_userTableMouseClicked

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        addBtn.setBackground(new Color( 5, 124, 23));
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
        addBtn.setBackground(new Color( 62, 182, 80));
    }//GEN-LAST:event_addBtnMouseExited

    private void deleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseEntered
        deleteBtn.setBackground(new Color(192, 0, 32));
    }//GEN-LAST:event_deleteBtnMouseEntered

    private void deleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseExited
        deleteBtn.setBackground(new Color( 225, 43, 56));
    }//GEN-LAST:event_deleteBtnMouseExited

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        appointmentsysDAO.deleteUser(idDisplay.getText());
        model.setRowCount(0);
        viewUser();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        adminAdd goAdd = new adminAdd();
        goAdd.setVisible(true);
    }//GEN-LAST:event_addBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        adminUpdate goUpdate = new adminUpdate();
        goUpdate.setDisplayName(displayName.getText());
        goUpdate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateBtnMouseClicked
    public void setDisplayName(String name)
    {
        displayName.setText(name);
    }
    
    
    private DefaultTableModel model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBtn;
    private javax.swing.JLabel addLabel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JPanel deleteBtn;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel displayName;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JTextField idDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel manageBtn;
    private javax.swing.JLabel manageIcon;
    private javax.swing.JLabel manageLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel updateBtn;
    private javax.swing.JLabel updateIcon;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JTable userTable;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
