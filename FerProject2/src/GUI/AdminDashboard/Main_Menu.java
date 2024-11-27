/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.AdminDashboard;

import GUI.Extras.Connectosql;
import GUI.GuiFer;
import GUI.Extras.ImageFileTransferHandler;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Base64;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.SQLException;
import javax.swing.border.Border;

/**
 *
 * @author asadagreat
 */
public class Main_Menu extends javax.swing.JPanel {
    
    private GuiFer parentFrame;

    private ImageFileTransferHandler imageFileTransferHandler;
    
    public Main_Menu(GuiFer frame) {
        this.parentFrame = frame;
        initComponents();
                
        quantity.setForeground(Color.BLUE);
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) quantity.getEditor();
        editor.getTextField().setBackground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        quantity.setBorder(border);
        
        imageFileTransferHandler = new ImageFileTransferHandler(imagePanel);
        imagePanel.setTransferHandler(imageFileTransferHandler);
        imagePanel.setLayout(new BorderLayout());
        parentFrame.enablePanelDragging(MainPanelDrag);
        parentFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EmptyPannel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        equipmentName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceBox = new javax.swing.JTextField();
        categoryBox = new javax.swing.JComboBox<>();
        Addbutton = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descBox = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        quantity = new javax.swing.JSpinner();
        MainPanelDrag = new javax.swing.JPanel();
        Resize_front = new javax.swing.JButton();
        Exit_front = new javax.swing.JButton();
        Minimize_front = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        DisplayBut1 = new javax.swing.JButton();
        BundleBut1 = new javax.swing.JButton();
        CustomerOrderBut1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        OpenMenu = new javax.swing.JButton();
        Reports = new javax.swing.JButton();
        EditFront = new javax.swing.JButton();
        Returncalc = new javax.swing.JButton();
        AddBut = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EmptyPannel.setBackground(new java.awt.Color(102, 102, 102));
        EmptyPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Description");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Upload Photo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        equipmentName.setBackground(new java.awt.Color(51, 51, 51));
        equipmentName.setForeground(new java.awt.Color(255, 255, 255));
        equipmentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentNameActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Equipment Name");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Equipment Category");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price");

        priceBox.setBackground(new java.awt.Color(51, 51, 51));
        priceBox.setForeground(new java.awt.Color(255, 255, 255));
        priceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBoxActionPerformed(evt);
            }
        });

        categoryBox.setBackground(new java.awt.Color(51, 51, 51));
        categoryBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categoryBox.setForeground(new java.awt.Color(255, 255, 255));
        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camera", "Lighting", "Audio", "Miscellaneous" }));
        categoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBoxActionPerformed(evt);
            }
        });

        Addbutton.setBackground(new java.awt.Color(102, 102, 102));
        Addbutton.setForeground(new java.awt.Color(255, 255, 255));
        Addbutton.setText("ADD");
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });

        imagePanel.setBackground(new java.awt.Color(102, 102, 102));
        imagePanel.setForeground(new java.awt.Color(204, 204, 204));

        descBox.setBackground(new java.awt.Color(102, 102, 102));
        descBox.setColumns(20);
        descBox.setForeground(new java.awt.Color(255, 255, 255));
        descBox.setLineWrap(true);
        descBox.setRows(5);
        descBox.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descBox);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quantity");

        quantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        quantity.setAutoscrolls(true);
        quantity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(equipmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceBox, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(Addbutton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Addbutton)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout EmptyPannelLayout = new javax.swing.GroupLayout(EmptyPannel);
        EmptyPannel.setLayout(EmptyPannelLayout);
        EmptyPannelLayout.setHorizontalGroup(
            EmptyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EmptyPannelLayout.setVerticalGroup(
            EmptyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainPanelDrag.setBackground(new java.awt.Color(102, 102, 102));
        MainPanelDrag.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Resize_front.setBackground(new java.awt.Color(255, 204, 0));
        Resize_front.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Resize_front.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resize_frontActionPerformed(evt);
            }
        });

        Exit_front.setBackground(new java.awt.Color(255, 0, 0));
        Exit_front.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Exit_front.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_frontActionPerformed(evt);
            }
        });

        Minimize_front.setBackground(new java.awt.Color(0, 255, 0));
        Minimize_front.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Minimize_front.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minimize_frontActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelDragLayout = new javax.swing.GroupLayout(MainPanelDrag);
        MainPanelDrag.setLayout(MainPanelDragLayout);
        MainPanelDragLayout.setHorizontalGroup(
            MainPanelDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelDragLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Exit_front, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resize_front, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Minimize_front, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelDragLayout.setVerticalGroup(
            MainPanelDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelDragLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(MainPanelDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Minimize_front, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resize_front, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit_front, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        DisplayBut1.setBackground(new java.awt.Color(153, 153, 153));
        DisplayBut1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        DisplayBut1.setForeground(new java.awt.Color(255, 255, 255));
        DisplayBut1.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-show-property-25.png")); // NOI18N
        DisplayBut1.setText("DISPLAY ");
        DisplayBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBut1ActionPerformed(evt);
            }
        });

        BundleBut1.setBackground(new java.awt.Color(153, 153, 153));
        BundleBut1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BundleBut1.setForeground(new java.awt.Color(255, 255, 255));
        BundleBut1.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-add-25.png")); // NOI18N
        BundleBut1.setText("BUNDLE ");
        BundleBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BundleBut1ActionPerformed(evt);
            }
        });

        CustomerOrderBut1.setBackground(new java.awt.Color(153, 153, 153));
        CustomerOrderBut1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        CustomerOrderBut1.setForeground(new java.awt.Color(255, 255, 255));
        CustomerOrderBut1.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-create-order-25.png")); // NOI18N
        CustomerOrderBut1.setText("CUSTOMER ORDER");
        CustomerOrderBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerOrderBut1ActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Gagalin", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ADMIN");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        OpenMenu.setBackground(new java.awt.Color(153, 153, 153));
        OpenMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OpenMenu.setForeground(new java.awt.Color(255, 255, 255));
        OpenMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-menu-squared-25.png")); // NOI18N
        OpenMenu.setText("OPEN MENU");
        OpenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuActionPerformed(evt);
            }
        });

        Reports.setBackground(new java.awt.Color(153, 153, 153));
        Reports.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reports.setForeground(new java.awt.Color(255, 255, 255));
        Reports.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-report-25.png")); // NOI18N
        Reports.setText("REPORT");
        Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsActionPerformed(evt);
            }
        });

        EditFront.setBackground(new java.awt.Color(153, 153, 153));
        EditFront.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditFront.setForeground(new java.awt.Color(255, 255, 255));
        EditFront.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-edit-25.png")); // NOI18N
        EditFront.setText("EDIT BUNDLE");
        EditFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditFrontActionPerformed(evt);
            }
        });

        Returncalc.setBackground(new java.awt.Color(153, 153, 153));
        Returncalc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Returncalc.setForeground(new java.awt.Color(255, 255, 255));
        Returncalc.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-return-25.png")); // NOI18N
        Returncalc.setText("RETURN");
        Returncalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturncalcActionPerformed(evt);
            }
        });

        AddBut.setBackground(new java.awt.Color(153, 153, 153));
        AddBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddBut.setForeground(new java.awt.Color(255, 255, 255));
        AddBut.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-add-25.png")); // NOI18N
        AddBut.setText("ADD   ");
        AddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Gagalin", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CUSTOMER");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Returncalc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EditFront, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OpenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(AddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DisplayBut1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BundleBut1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CustomerOrderBut1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DisplayBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BundleBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CustomerOrderBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(OpenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditFront, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Returncalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(EmptyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(MainPanelDrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MainPanelDrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmptyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void equipmentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipmentNameActionPerformed

    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed
        
        int equipQuan = (int) quantity.getValue();
        String equipID = "";
        String equipName = equipmentName.getText();
        String category = categoryBox.getSelectedItem().toString();
        if (category.equals("Camera")) {
            equipID = "1";
        } else if (category.equals("Lighting")) {
            equipID = "2";
        } else if (category.equals("Audio")) {
            equipID = "3";
        } else if (category.equals("Miscellaneous")) {
            equipID = "4";
        }
        
        String price = priceBox.getText();
        String desc = descBox.getText();
        byte[] image = imageFileTransferHandler.getImageByteArray();
        String Simage = Base64.getEncoder().encodeToString(image);
        
        int counts = 1;
                
        if (equipName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Equipment Name is REQUIRED");
        } else if (category.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Category is REQUIRED");
        } else if (price.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Price is REQUIRED");
        } else if (desc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Description is REQUIRED");
        } else if (imageFileTransferHandler.getImageByteArray() == null) {
            JOptionPane.showMessageDialog(null, "Image is REQUIRED");
        } else {
            double PriceBox;
            try {
                PriceBox = Double.parseDouble(price);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Price must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the price is not valid
            }
            // Use the existing connection
            try (Connection connect = Connectosql.getInstance().getConnection();
                 Statement stmt = connect.createStatement()) {

                String query = "INSERT INTO equipment (EquipmentID, EquipmentName, EquipmentCategoryID, RentedPrice, EquipmentDesc, EquipmentImage, EquipmentAvailability) " +
                        "VALUES (NULL, '" + equipName + "', '" + equipID + "', '" + PriceBox + "', '" + desc + "', '" + Simage + "', true)";
                while (counts <= equipQuan){
                    stmt.execute(query);
                    counts++;
                }
                Notifications notif = new Notifications();
                notif.setNotificationText("Equipment Added!");
                notif.setVisible(true);

                equipmentName.setText("");
                categoryBox.setSelectedIndex(0);
                priceBox.setText("");
                descBox.setText("");
                imageFileTransferHandler = new ImageFileTransferHandler(imagePanel); 
                imagePanel.setTransferHandler(imageFileTransferHandler);
                imagePanel.removeAll(); 
                imagePanel.revalidate();
                imagePanel.repaint();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error adding equipment: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddbuttonActionPerformed

    private void categoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBoxActionPerformed

    private void priceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceBoxActionPerformed

    private void Resize_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resize_frontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Resize_frontActionPerformed

    private void Exit_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_frontActionPerformed
        // TODO add your handling code here:
        parentFrame.dispose();
    }//GEN-LAST:event_Exit_frontActionPerformed

    private void Minimize_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minimize_frontActionPerformed
        // TODO add your handling code here:
        parentFrame.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Minimize_frontActionPerformed

    private void DisplayBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBut1ActionPerformed
        // TODO add your handling code here:

        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        Display_Inv display = new Display_Inv(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(display);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_DisplayBut1ActionPerformed

    private void BundleBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BundleBut1ActionPerformed
        // TODO add your handling code here:

        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        PackageEquip equip = new PackageEquip(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(equip);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_BundleBut1ActionPerformed

    private void CustomerOrderBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerOrderBut1ActionPerformed
        // TODO add your handling code here:

        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        ViewCusto custo = new ViewCusto(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(custo);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_CustomerOrderBut1ActionPerformed

    private void OpenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuActionPerformed
        // TODO add your handling code here:
        parentFrame.openCustomerFrame();
    }//GEN-LAST:event_OpenMenuActionPerformed

    private void ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsActionPerformed
        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        // Pass the JFrame to the Main_Menu constructor
        Reports rep = new Reports(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(rep);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_ReportsActionPerformed

    private void EditFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditFrontActionPerformed
        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        // Pass the JFrame to the Main_Menu constructor
        EditBundle edit = new EditBundle(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(edit);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_EditFrontActionPerformed

    private void ReturncalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturncalcActionPerformed
        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        // Pass the JFrame to the Main_Menu constructor
        ReturnCalc calc = new ReturnCalc(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(calc);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_ReturncalcActionPerformed

    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed

        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        // Pass the JFrame to the Main_Menu constructor
        Main_Menu menu = new Main_Menu(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(menu);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_AddButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBut;
    private javax.swing.JButton Addbutton;
    private javax.swing.JButton BundleBut1;
    private javax.swing.JButton CustomerOrderBut1;
    private javax.swing.JButton DisplayBut1;
    private javax.swing.JButton EditFront;
    private javax.swing.JPanel EmptyPannel;
    private javax.swing.JButton Exit_front;
    private javax.swing.JPanel MainPanelDrag;
    private javax.swing.JButton Minimize_front;
    private javax.swing.JButton OpenMenu;
    private javax.swing.JButton Reports;
    private javax.swing.JButton Resize_front;
    private javax.swing.JButton Returncalc;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JTextArea descBox;
    private javax.swing.JTextField equipmentName;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceBox;
    private javax.swing.JSpinner quantity;
    // End of variables declaration//GEN-END:variables

}
