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
    private Point initialClick;

    private ImageFileTransferHandler imageFileTransferHandler;
    private Connection connect;
    
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
        jPanel2 = new javax.swing.JPanel();
        DisplayBut = new javax.swing.JButton();
        BundleBut = new javax.swing.JButton();
        CustomerOrderBut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        OpenMenu = new javax.swing.JButton();
        Reports = new javax.swing.JButton();
        EditFront = new javax.swing.JButton();
        Returncalc = new javax.swing.JButton();
        AddBut = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        DisplayBut.setBackground(new java.awt.Color(153, 153, 153));
        DisplayBut.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        DisplayBut.setForeground(new java.awt.Color(255, 255, 255));
        DisplayBut.setText("DISPLAY ");
        DisplayBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayButActionPerformed(evt);
            }
        });

        BundleBut.setBackground(new java.awt.Color(153, 153, 153));
        BundleBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BundleBut.setForeground(new java.awt.Color(255, 255, 255));
        BundleBut.setText("BUNDLE +");
        BundleBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BundleButActionPerformed(evt);
            }
        });

        CustomerOrderBut.setBackground(new java.awt.Color(153, 153, 153));
        CustomerOrderBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CustomerOrderBut.setForeground(new java.awt.Color(255, 255, 255));
        CustomerOrderBut.setText("CUSTOMER ORDER");
        CustomerOrderBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerOrderButActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CUSTOMER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADMIN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        OpenMenu.setBackground(new java.awt.Color(153, 153, 153));
        OpenMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OpenMenu.setForeground(new java.awt.Color(255, 255, 255));
        OpenMenu.setText("OPEN MENU");
        OpenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuActionPerformed(evt);
            }
        });

        Reports.setBackground(new java.awt.Color(153, 153, 153));
        Reports.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reports.setForeground(new java.awt.Color(255, 255, 255));
        Reports.setText("REPORT");
        Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsActionPerformed(evt);
            }
        });

        EditFront.setBackground(new java.awt.Color(153, 153, 153));
        EditFront.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditFront.setForeground(new java.awt.Color(255, 255, 255));
        EditFront.setText("EDIT CUSTOMER");
        EditFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditFrontActionPerformed(evt);
            }
        });

        Returncalc.setBackground(new java.awt.Color(153, 153, 153));
        Returncalc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Returncalc.setForeground(new java.awt.Color(255, 255, 255));
        Returncalc.setText("RETURN CALC");
        Returncalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturncalcActionPerformed(evt);
            }
        });

        AddBut.setBackground(new java.awt.Color(153, 153, 153));
        AddBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddBut.setForeground(new java.awt.Color(255, 255, 255));
        AddBut.setText("ADD +");
        AddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Returncalc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditFront, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OpenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DisplayBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BundleBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CustomerOrderBut)
                    .addComponent(AddBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DisplayBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BundleBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CustomerOrderBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OpenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditFront, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Returncalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmptyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(MainPanelDrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MainPanelDrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmptyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void DisplayButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayButActionPerformed
        // TODO add your handling code here:
        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();
        
        Display_Inv display = new Display_Inv(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(display);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_DisplayButActionPerformed

    private void BundleButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BundleButActionPerformed
        // TODO add your handling code here:
        
        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();
        
        PackageEquip equip = new PackageEquip(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(equip);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_BundleButActionPerformed

    private void CustomerOrderButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerOrderButActionPerformed
        // TODO add your handling code here:
        
        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();
        
        ViewCusto custo = new ViewCusto(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(custo);

        parentFrame.revalidate();
        parentFrame.repaint();
        
    }//GEN-LAST:event_CustomerOrderButActionPerformed

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

                String query = "INSERT INTO equipment (EquipmentID, EquipmentName, EquipmentCategoryID, EquipmentPrice, EquipmentDesc, EquipmentImage, EquipmentAvailability) " +
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

    private void OpenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuActionPerformed
        // TODO add your handling code here:
        parentFrame.openCustomerFrame();
    }//GEN-LAST:event_OpenMenuActionPerformed

    private void ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportsActionPerformed

    private void EditFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditFrontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditFrontActionPerformed

    private void ReturncalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturncalcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturncalcActionPerformed

    private void priceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceBoxActionPerformed

    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed
        // TODO add your handling code here:
        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();
    
        // Pass the JFrame to the Main_Menu constructor
        Main_Menu menu = new Main_Menu(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(menu);

        parentFrame.revalidate();
        parentFrame.repaint();    
    }//GEN-LAST:event_AddButActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBut;
    private javax.swing.JButton Addbutton;
    private javax.swing.JButton BundleBut;
    private javax.swing.JButton CustomerOrderBut;
    private javax.swing.JButton DisplayBut;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceBox;
    private javax.swing.JSpinner quantity;
    // End of variables declaration//GEN-END:variables

}
