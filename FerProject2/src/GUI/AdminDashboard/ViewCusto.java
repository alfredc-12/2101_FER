/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.AdminDashboard;

import java.sql.Connection;
import GUI.AdminDashboard.Display_Inv;
import GUI.AdminDashboard.Main_Menu;
import GUI.AdminDashboard.PackageEquip;
import GUI.Extras.CustomerOrder;
import GUI.Extras.CustomerOrderDAO;
import GUI.Extras.NonEditableTableModel;
import GUI.GuiFer;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author asadagreat
 */
public class ViewCusto extends javax.swing.JPanel {

    /**
     * Creates new form ViewCusto
     */
    private GuiFer parentFrame;
    private Connection connect;
    private NonEditableTableModel tableModel;
    private CustomerOrderDAO customerOrderDAO = new CustomerOrderDAO(); 
    private String currentQuery = "";
    public ViewCusto(GuiFer frame) {
        this.parentFrame = frame;
        initComponents();
        postInitComponents();
        parentFrame.enablePanelDragging(MainPanelDrag);
        parentFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        EmptyPannel1 = new javax.swing.JPanel();
        customerScroll = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        ViewCus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        MainPanelDrag = new javax.swing.JPanel();
        Resize_front = new javax.swing.JButton();
        Exit_front = new javax.swing.JButton();
        Minimize_front = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        DisplayBut2 = new javax.swing.JButton();
        BundleBut2 = new javax.swing.JButton();
        CustomerOrderBut2 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        OpenMenu = new javax.swing.JButton();
        Reports = new javax.swing.JButton();
        EditFront = new javax.swing.JButton();
        Returncalc = new javax.swing.JButton();
        AddBut = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EmptyPannel1.setBackground(new java.awt.Color(102, 102, 102));
        EmptyPannel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Phone", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerScroll.setViewportView(customerTable);

        ViewCus.setBackground(new java.awt.Color(51, 51, 51));
        ViewCus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ViewCus.setForeground(new java.awt.Color(255, 255, 255));
        ViewCus.setText("View Customer");
        ViewCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCusActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-search-25.png")); // NOI18N

        searchField.setBackground(new java.awt.Color(51, 51, 51));
        searchField.setForeground(new java.awt.Color(255, 255, 255));
        searchField.setText("Search");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmptyPannel1Layout = new javax.swing.GroupLayout(EmptyPannel1);
        EmptyPannel1.setLayout(EmptyPannel1Layout);
        EmptyPannel1Layout.setHorizontalGroup(
            EmptyPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyPannel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(ViewCus)
                .addGap(317, 317, 317))
            .addComponent(customerScroll)
        );
        EmptyPannel1Layout.setVerticalGroup(
            EmptyPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyPannel1Layout.createSequentialGroup()
                .addComponent(customerScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EmptyPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(EmptyPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ViewCus)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
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

        jPanel20.setBackground(new java.awt.Color(102, 102, 102));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel20.setForeground(new java.awt.Color(255, 255, 255));

        DisplayBut2.setBackground(new java.awt.Color(153, 153, 153));
        DisplayBut2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        DisplayBut2.setForeground(new java.awt.Color(255, 255, 255));
        DisplayBut2.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-show-property-25.png")); // NOI18N
        DisplayBut2.setText("DISPLAY ");
        DisplayBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBut2ActionPerformed(evt);
            }
        });

        BundleBut2.setBackground(new java.awt.Color(153, 153, 153));
        BundleBut2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BundleBut2.setForeground(new java.awt.Color(255, 255, 255));
        BundleBut2.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-add-25.png")); // NOI18N
        BundleBut2.setText("BUNDLE ");
        BundleBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BundleBut2ActionPerformed(evt);
            }
        });

        CustomerOrderBut2.setBackground(new java.awt.Color(153, 153, 153));
        CustomerOrderBut2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        CustomerOrderBut2.setForeground(new java.awt.Color(255, 255, 255));
        CustomerOrderBut2.setIcon(new javax.swing.ImageIcon("C:\\Users\\leyzu\\OneDrive\\Desktop\\Fer_Final2024\\2101_FER\\FerProject2\\icons\\icons8-create-order-25.png")); // NOI18N
        CustomerOrderBut2.setText("CUSTOMER ORDER");
        CustomerOrderBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerOrderBut2ActionPerformed(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Gagalin", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ADMIN");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Gagalin", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CUSTOMER");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Returncalc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EditFront, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OpenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(AddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DisplayBut2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BundleBut2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CustomerOrderBut2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DisplayBut2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BundleBut2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CustomerOrderBut2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmptyPannel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(MainPanelDrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(MainPanelDrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(EmptyPannel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void postInitComponents() {
        String[] columnNames = {"Name", "Email", "Phone", "Address"};

        tableModel = new NonEditableTableModel(columnNames, 0);

        customerTable.setModel(tableModel);

        customerScroll.setViewportView(customerTable);

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }
        });

        refreshTable();
    }

    private void filterTable() {
        currentQuery = searchField.getText().toLowerCase();
        refreshTable();
    }

    public void refreshTable() {
        List<CustomerOrder> customerOrders = customerOrderDAO.getCustomerOrders();
        tableModel.setRowCount(0); // Clear existing rows

        for (CustomerOrder customerOrder : customerOrders) {
            if (customerOrder.getName().toLowerCase().contains(currentQuery) || 
                customerOrder.getEmail().toLowerCase().contains(currentQuery) || 
                customerOrder.getPhone().toLowerCase().contains(currentQuery) || 
                customerOrder.getAddress().toLowerCase().contains(currentQuery)) {

                Object[] rowData = {
                    customerOrder.getName(),
                    customerOrder.getEmail(),
                    customerOrder.getPhone(),
                    customerOrder.getAddress()
                };
                tableModel.addRow(rowData);
            }
        }
    }
    
    private void ViewCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCusActionPerformed
        int selectedRow = customerTable.getSelectedRow();
        if (selectedRow != -1) {
            // Retrieve data from the selected row
            String name = (String) customerTable.getValueAt(selectedRow, 0);
            String email = (String) customerTable.getValueAt(selectedRow, 1);
            String phone = (String) customerTable.getValueAt(selectedRow, 2);
            String address = (String) customerTable.getValueAt(selectedRow, 3);

            CustomerOrder customerOrder = customerOrderDAO.getCustomerOrderByName(name);

            // Create and display the orderHistory frame
            orderHistory orderHistoryFrame = new orderHistory(customerOrder);
            orderHistoryFrame.setVisible(true);
        }
    }//GEN-LAST:event_ViewCusActionPerformed

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

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchFieldActionPerformed

    private void DisplayBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBut2ActionPerformed
        // TODO add your handling code here:

        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        Display_Inv display = new Display_Inv(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(display);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_DisplayBut2ActionPerformed

    private void BundleBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BundleBut2ActionPerformed
        // TODO add your handling code here:

        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        PackageEquip equip = new PackageEquip(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(equip);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_BundleBut2ActionPerformed

    private void CustomerOrderBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerOrderBut2ActionPerformed
        // TODO add your handling code here:

        GuiFer parentFrame = (GuiFer) this.getTopLevelAncestor();

        ViewCusto custo = new ViewCusto(parentFrame);

        // Set the new panel as the content pane
        parentFrame.setContentPane(custo);

        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_CustomerOrderBut2ActionPerformed

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
    private javax.swing.JButton BundleBut2;
    private javax.swing.JButton CustomerOrderBut2;
    private javax.swing.JButton DisplayBut2;
    private javax.swing.JButton EditFront;
    private javax.swing.JPanel EmptyPannel1;
    private javax.swing.JButton Exit_front;
    private javax.swing.JPanel MainPanelDrag;
    private javax.swing.JButton Minimize_front;
    private javax.swing.JButton OpenMenu;
    private javax.swing.JButton Reports;
    private javax.swing.JButton Resize_front;
    private javax.swing.JButton Returncalc;
    private javax.swing.JButton ViewCus;
    private javax.swing.JScrollPane customerScroll;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
