/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.CustomerSide;

import GUI.Extras.EquipmentCount;
import GUI.Extras.EquipmentDAO;
import GUI.Extras.EquipmentTableCellRenderer;
import GUI.Extras.EquipmentTableModel;
import GUI.Extras.RoundButtonUI;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableColumn;

public class Store extends javax.swing.JFrame {
    
    private List<EquipmentCount> cartItems = new ArrayList<>();
    private JPanel cardPanel;
    private boolean loginFrame = false;
    private EquipmentDAO equipmentDAO;
    private CardLayout cardLayout; 
    private Cart cartPanel;
    private JTable currentTable; 
    private EquipmentCount currentlyPreviewedEquipment;
    public Map<String, Integer> equipmentQuantities = new HashMap<>();
    private Map<String, Integer> initialAvailableQuantities = new HashMap<>();

    public Store() {
        equipmentDAO = new EquipmentDAO();
        this.setUndecorated(true); 
        initComponents();
        initializeEquipmentQuantities();
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        enablePanelDragging(MainPanelDrag);
        setResizable(false);
        addExitButtonListener();
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        cartPanel = new Cart(this);
        customizeButton();
        cardPanel.add(this.getContentPane(), "StorePanel");
        cardPanel.add(cartPanel, "CartPanel");
        
        setContentPane(cardPanel);
        loadEquipmentTables();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LightingScroll = new javax.swing.JScrollPane();
        lightingTable = new javax.swing.JTable();
        AudioScroll = new javax.swing.JScrollPane();
        audioTable = new javax.swing.JTable();
        packageScroll = new javax.swing.JScrollPane();
        packageTable = new javax.swing.JTable();
        CameraScroll = new javax.swing.JScrollPane();
        cameraTable = new javax.swing.JTable();
        MiscellanScroll = new javax.swing.JScrollPane();
        miscellaneousTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JLabel();
        imagePanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        EquipmentName = new javax.swing.JLabel();
        Price = new javax.swing.JPanel();
        priceBox = new javax.swing.JLabel();
        Add1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descBox = new javax.swing.JTextArea();
        Price2 = new javax.swing.JPanel();
        qtyBox = new javax.swing.JLabel();
        proceed = new javax.swing.JButton();
        MainPanelDrag = new javax.swing.JPanel();
        Resize_front = new javax.swing.JButton();
        Exit_front = new javax.swing.JButton();
        Minimize_front = new javax.swing.JButton();
        user = new javax.swing.JButton();
        customBundle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "FER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lightingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LightingScroll.setViewportView(lightingTable);

        audioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        AudioScroll.setViewportView(audioTable);

        packageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        packageScroll.setViewportView(packageTable);

        CameraScroll.setBackground(new java.awt.Color(255, 255, 255));

        cameraTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CameraScroll.setViewportView(cameraTable);

        miscellaneousTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MiscellanScroll.setViewportView(miscellaneousTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LightingScroll)
                    .addComponent(AudioScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addComponent(packageScroll, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CameraScroll, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MiscellanScroll, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CameraScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LightingScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AudioScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MiscellanScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(packageScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        imagePanel.setBackground(new java.awt.Color(51, 51, 51));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EquipmentName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EquipmentName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EquipmentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EquipmentName, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        Price.setBackground(new java.awt.Color(51, 51, 51));
        Price.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        priceBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceBox.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PriceLayout = new javax.swing.GroupLayout(Price);
        Price.setLayout(PriceLayout);
        PriceLayout.setHorizontalGroup(
            PriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priceBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PriceLayout.setVerticalGroup(
            PriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priceBox, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        Add1.setBackground(new java.awt.Color(51, 51, 51));
        Add1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add1.setForeground(new java.awt.Color(255, 255, 255));
        Add1.setText("Add to Cart");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });

        descBox.setEditable(false);
        descBox.setBackground(new java.awt.Color(51, 51, 51));
        descBox.setColumns(20);
        descBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descBox.setForeground(new java.awt.Color(255, 255, 255));
        descBox.setLineWrap(true);
        descBox.setRows(5);
        descBox.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descBox);

        Price2.setBackground(new java.awt.Color(51, 51, 51));
        Price2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        qtyBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        qtyBox.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Price2Layout = new javax.swing.GroupLayout(Price2);
        Price2.setLayout(Price2Layout);
        Price2Layout.setHorizontalGroup(
            Price2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qtyBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        Price2Layout.setVerticalGroup(
            Price2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qtyBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Add1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        proceed.setBackground(new java.awt.Color(51, 51, 51));
        proceed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        proceed.setForeground(new java.awt.Color(255, 255, 255));
        proceed.setText("Proceed to Cart");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

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

        user.setBackground(new java.awt.Color(51, 51, 51));
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-25.png"))); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        customBundle.setBackground(new java.awt.Color(51, 51, 51));
        customBundle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customBundle.setForeground(new java.awt.Color(255, 255, 255));
        customBundle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-25.png"))); // NOI18N
        customBundle.setText("BUNDLE");
        customBundle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customBundleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(customBundle, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(proceed)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(MainPanelDrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MainPanelDrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(customBundle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializeEquipmentQuantities() {
        List<EquipmentCount> allEquipment = equipmentDAO.getAllEquipment();
        Map<String, Integer> totalCountMap = new HashMap<>();
        Map<String, Integer> availableCountMap = new HashMap<>();

        for (EquipmentCount equipment : allEquipment) {
            String name = equipment.getName();
            totalCountMap.put(name, totalCountMap.getOrDefault(name, 0) + 1);
            if (equipment.isAvailable()) {
                availableCountMap.put(name, availableCountMap.getOrDefault(name, 0) + 1);
            }
        }

        for (String name : totalCountMap.keySet()) {
            int totalCount = totalCountMap.get(name);
            int availableCount = availableCountMap.getOrDefault(name, 0);
            initialAvailableQuantities.put(name, availableCount);
            equipmentQuantities.put(name, 0); // Start with 0 in the cart
        }

        System.out.println("Initialized equipment quantities: " + equipmentQuantities);
        System.out.println("Initialized available quantities: " + initialAvailableQuantities);
    }

    private void customizeButton() {
        // Assuming the button is named exitButton in the design mode
        Exit_front.setUI(new RoundButtonUI());
        Minimize_front.setUI(new RoundButtonUI());
        Resize_front.setUI(new RoundButtonUI());
    }
    
    public List<EquipmentCount> getCartItems() {
        return cartItems;
    }

    private void addToCart(EquipmentCount item, boolean isPackageItem, double packagePrice) {
        String itemName = item.getName();
        int initialCount = initialAvailableQuantities.getOrDefault(itemName, 0);
        int currentCartCount = equipmentQuantities.getOrDefault(itemName, 0);

        if (currentCartCount < initialCount) {
            equipmentQuantities.put(itemName, currentCartCount + 1);

            EquipmentCount newItem = new EquipmentCount(item.getID(), item.getName(), item.getPrice(), item.getTotalCount(), item.getAvailableCount(), item.getCategoryID(), item.getDescription(), item.getImage(), item.isAvailable());
            newItem.setPartOfPackage(isPackageItem);
            newItem.setPrice(isPackageItem && currentCartCount == 0 ? packagePrice : item.getPrice());

            this.getCartItems().add(newItem);

            System.out.printf("Added %s to cart. Current in-cart count: %d, Initial count: %d%n", itemName, equipmentQuantities.get(itemName), initialCount);
        } else {
            JOptionPane.showMessageDialog(this, "Cannot add more " + itemName + ". Maximum stock reached.", "Stock Limit", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public CardLayout getCardLayout() {
        return cardLayout;
    } 
    
    public JPanel getCardPanel() { 
        return cardPanel;
    }
    
    private void addPackageToCart(EquipmentCount packageEquipment) {
        List<EquipmentCount> packageItems = equipmentDAO.getEquipmentListDetailsByPackageID(packageEquipment.getID());
        boolean allAvailable = true;
        int packageAvailableCount = Integer.MAX_VALUE;

        System.out.printf("Adding package: %s, Package ID: %d%n", packageEquipment.getName(), packageEquipment.getID());
        System.out.printf("Total items in package: %d%n", packageItems.size());

        for (EquipmentCount item : packageItems) {
            String itemName = item.getName();
            int initialCount = initialAvailableQuantities.getOrDefault(itemName, 0);
            int inCartCount = equipmentQuantities.getOrDefault(itemName, 0);
            int availableCount = initialCount - inCartCount;

            System.out.printf("Item: %s, Initial Count: %d, In Cart: %d, Available: %d%n", itemName, initialCount, inCartCount, availableCount);

            if (availableCount <= 0) {
                allAvailable = false;
                System.out.printf("No available stock for item: %s%n", itemName);
                JOptionPane.showMessageDialog(this, "No available stock for " + itemName, "Stock Unavailable", JOptionPane.ERROR_MESSAGE);
                break;
            } else {
                packageAvailableCount = Math.min(packageAvailableCount, availableCount);
            }
        }

        System.out.printf("Final package availability calculated: %d%n", packageAvailableCount);
        System.out.printf("All items available: %b%n", allAvailable);

        if (allAvailable) {
            this.getCartItems().add(packageEquipment);  // Add the package to the cart
            System.out.printf("Added package: %s, New Package Available Count: %d%n", packageEquipment.getName(), packageAvailableCount - 1);
            int newPackageAvailableCount = packageAvailableCount - 1;
            qtyBox.setText(String.format("Available: %d", newPackageAvailableCount));
        } else {
            System.out.printf("Failed to add package: %s due to insufficient stock%n", packageEquipment.getName());
        }

        // Debugging: Print updated equipment quantities
        System.out.println("Updated equipment quantities after adding package: " + equipmentQuantities);
    }

    private void loadEquipmentTables() {
        // Load and set up tables for each category
        loadEquipmentTable(CameraScroll, equipmentDAO.getEquipmentCountByCategory(1), cameraTable);
        loadEquipmentTable(AudioScroll, equipmentDAO.getEquipmentCountByCategory(3), audioTable);
        loadEquipmentTable(LightingScroll, equipmentDAO.getEquipmentCountByCategory(2), lightingTable);
        loadEquipmentTable(MiscellanScroll, equipmentDAO.getEquipmentCountByCategory(4), miscellaneousTable);
        loadEquipmentTable(packageScroll, equipmentDAO.getPackageList(), packageTable); // Added package data loading
    }

    private void loadEquipmentTable(JScrollPane scrollPane, List<EquipmentCount> equipmentList, JTable table) {
        EquipmentTableModel tableModel = new EquipmentTableModel(equipmentList);
        table.setModel(tableModel);
        table.setDefaultRenderer(Object.class, new EquipmentTableCellRenderer(equipmentDAO)); // Pass EquipmentDAO
        table.setRowHeight(95); // Adjust row height to fit images and names

        // Disable column resizing
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);

        // Remove column headers
        table.setTableHeader(null);

        // Adjust column width based on content
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Disable automatic resizing
        for (int i = 0; i < table.getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth(130); // Adjust width for each column to handle long names
        }

        // Add mouse listener for double-click to preview equipment or package
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                currentTable = table; // Update currentTable when the table is clicked
                if (e.getClickCount() == 2) {
                    int row = table.getSelectedRow();
                    int column = table.getSelectedColumn(); // Ensure column is correctly referenced
                    EquipmentCount equipment = (EquipmentCount) table.getValueAt(row, column);
                    int equipmentID = equipment.getID();
                    System.out.println("Selected Equipment ID: " + equipmentID);

                    if (table == packageTable) {
                        EquipmentCount detailedEquipment = equipmentDAO.getPackageByName(equipment.getName());
                        if (detailedEquipment != null) {
                            detailedEquipment.setPartOfPackage(true);  // Mark as part of a package
                            currentlyPreviewedEquipment = detailedEquipment;
                            updateDetails(detailedEquipment, equipmentID);
                            table.setColumnSelectionInterval(column, column); // Ensure correct column selection
                        } else {
                            System.out.println("No detailed package found for " + equipment.getName());
                        }
                    } else {
                        EquipmentCount detailedEquipment = equipmentDAO.getEquipmentByName(equipment.getName());
                        if (detailedEquipment != null) {
                            detailedEquipment.setPartOfPackage(false);  // Mark as not part of a package
                            currentlyPreviewedEquipment = detailedEquipment;
                            updateDetails(detailedEquipment, equipmentID);
                            table.setColumnSelectionInterval(column, column); // Ensure correct column selection
                        } else {
                            System.out.println("No detailed equipment found for " + equipment.getName());
                        }
                    }
                }
            }
        });

        // Set table inside scroll pane
        scrollPane.setViewportView(table);
        scrollPane.setPreferredSize(new Dimension(618, 100)); // Set scroll pane dimensions
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); // Enable horizontal scrolling
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER); // Disable vertical scrolling

        // Hide scrollbars while keeping scrolling functionality
        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
    }

    private void updateDetails(EquipmentCount equipment, int packageID) {
        EquipmentName.setText(equipment.getName());
        categoryLabel.setText(packageID > 0 ? "Package" : "Equipment");
        String equipmentList = packageID > 0 ? equipmentDAO.getEquipmentListByPackageID(packageID) : "";
        descBox.setText(equipmentList + "\n\n" + equipment.getDescription());

        byte[] imageBytes = equipment.getImage();
        System.out.println("Image bytes length: " + (imageBytes != null ? imageBytes.length : "null"));

        if (imageBytes != null && imageBytes.length > 0) {
            ImageIcon imageIcon = new ImageIcon(imageBytes);
            int imageWidth = 165;
            int imageHeight = 165;

            Dimension panelSize = new Dimension(imageWidth, imageHeight);
            imagePanel.setPreferredSize(panelSize);
            imagePanel.setMaximumSize(panelSize);
            imagePanel.setMinimumSize(panelSize);
            imagePanel.setSize(panelSize);

            Image image = imageIcon.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(image));
            imageLabel.setSize(panelSize);

            imagePanel.removeAll();
            imagePanel.add(imageLabel);
            imagePanel.revalidate();
            imagePanel.repaint();
        } else {
            imagePanel.removeAll();
            imagePanel.revalidate();
            imagePanel.repaint();
        }

        priceBox.setText(String.format("%.2f per day", equipment.getPrice()));

        if (packageID > 0) {
            List<EquipmentCount> packageItems = equipmentDAO.getEquipmentListDetailsByPackageID(packageID);
            int packageAvailableCount = Integer.MAX_VALUE;
            for (EquipmentCount item : packageItems) {
                int initialCount = initialAvailableQuantities.getOrDefault(item.getName(), 0);
                int inCartCount = equipmentQuantities.getOrDefault(item.getName(), 0);
                int availableCount = initialCount - inCartCount;
                packageAvailableCount = Math.min(packageAvailableCount, availableCount);
            }
            System.out.println("Package availability calculated: " + packageAvailableCount);
            qtyBox.setText(String.format("Available: %d", packageAvailableCount));
        } else {
            int initialCount = initialAvailableQuantities.getOrDefault(equipment.getName(), 0);
            int inCartCount = equipmentQuantities.getOrDefault(equipment.getName(), 0);
            int availableStock = initialCount - inCartCount;
            qtyBox.setText(String.format("Available: %d", availableStock));
        }
    }

    private void addExitButtonListener() {
        // Assuming the button is named exitButton in your GUI builder
        Exit_front.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_frontActionPerformed(evt);
            }
        });
    }

    public void enablePanelDragging(JComponent component) {
        final Point[] initialClick = new Point[1]; // Use array to allow final variable in inner class
        component.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick[0] = e.getPoint();
            }
        });

        component.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Get location of the JFrame
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // Determine how much the mouse moved since the initial click
                int xMoved = e.getX() - initialClick[0].x;
                int yMoved = e.getY() - initialClick[0].y;

                // Move the JFrame to its new location
                int x = thisX + xMoved;
                int y = thisY + yMoved;
                setLocation(x, y);
            }
        });
    }
    
    private void addIndividualEquipmentToCart(EquipmentCount equipment) {
        String equipmentName = equipment.getName();
        int initialCount = initialAvailableQuantities.getOrDefault(equipmentName, 0);
        int inCartCount = equipmentQuantities.getOrDefault(equipmentName, 0);
        int availableCount = initialCount - inCartCount;

        if (availableCount > 0) {
            addToCart(equipment, false, 0);

            equipmentQuantities.put(equipmentName, inCartCount + 1);

            int newAvailableCount = initialCount - (inCartCount + 1);
            qtyBox.setText(String.format("Available: %d", newAvailableCount));
            System.out.println("Added to cart: " + equipmentName);
        } else {
            System.out.println("No available stock for " + equipmentName);
            JOptionPane.showMessageDialog(this, "No available stock for " + equipmentName, "Stock Unavailable", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public List<EquipmentCount> getPackageItems(int packageID) {
        return equipmentDAO.getEquipmentListDetailsByPackageID(packageID);
    }
    
    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        
        if (SignUp.signedUpUserName == null && SignUp.signedUpUserEmail == null && Login.loggedInUserName == null && Login.loggedInUserEmail == null) {
            JOptionPane.showMessageDialog(this, "Please log in to add items to your cart.", "Login Required", JOptionPane.WARNING_MESSAGE);
            if (!loginFrame) {
            Login login = new Login();
            login.setVisible(true);
            loginFrame = true; // Update flag when frame is opened

            // Add a listener to reset the flag when the frame is closed
            login.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    loginFrame = false;
                }
            });
            }
        }
        
        if (currentlyPreviewedEquipment != null) {
            boolean isFromPackageTable = (currentTable == packageTable);
            boolean isPackageItem = currentlyPreviewedEquipment.isPartOfPackage();

            if (isFromPackageTable || isPackageItem) {
                addPackageToCart(currentlyPreviewedEquipment);
            } else {
                addIndividualEquipmentToCart(currentlyPreviewedEquipment);
            }
        } else {
            System.out.println("No equipment or package is currently previewed.");
        }
    }//GEN-LAST:event_Add1ActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        cartPanel.updateCartTable(getCartItems());
        cardLayout.show(cardPanel, "CartPanel");
    }//GEN-LAST:event_proceedActionPerformed

    private void Resize_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resize_frontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Resize_frontActionPerformed

    private void Exit_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_frontActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Exit_frontActionPerformed

    private void Minimize_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minimize_frontActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Minimize_frontActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        if (!loginFrame) {
            Login login = new Login();
            login.setVisible(true);
            loginFrame = true; // Update flag when frame is opened

            // Add a listener to reset the flag when the frame is closed
            login.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    loginFrame = false;
                }
            });
        }
    }//GEN-LAST:event_userActionPerformed

    private void customBundleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customBundleActionPerformed
       
         

       CustomBundle equip = new CustomBundle(this);

        // Set the new panel as the content pane
        this.setContentPane(equip);

        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_customBundleActionPerformed

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.put("Button.arc", 6);
        UIManager.put("Component.arc", 5);
        UIManager.put("CheckBox.arc", 4);
        UIManager.put("ProgressBar.arc", 4);
        UIManager.put("TextComponent.arc", 5);

        // Set the look and feel
        try {
            FlatDarkLaf.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add1;
    private javax.swing.JScrollPane AudioScroll;
    private javax.swing.JScrollPane CameraScroll;
    private javax.swing.JLabel EquipmentName;
    private javax.swing.JButton Exit_front;
    private javax.swing.JScrollPane LightingScroll;
    private javax.swing.JPanel MainPanelDrag;
    private javax.swing.JButton Minimize_front;
    private javax.swing.JScrollPane MiscellanScroll;
    private javax.swing.JPanel Price;
    private javax.swing.JPanel Price2;
    private javax.swing.JButton Resize_front;
    private javax.swing.JTable audioTable;
    private javax.swing.JTable cameraTable;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton customBundle;
    private javax.swing.JTextArea descBox;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lightingTable;
    private javax.swing.JTable miscellaneousTable;
    private javax.swing.JScrollPane packageScroll;
    private javax.swing.JTable packageTable;
    private javax.swing.JLabel priceBox;
    private javax.swing.JButton proceed;
    private javax.swing.JLabel qtyBox;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
