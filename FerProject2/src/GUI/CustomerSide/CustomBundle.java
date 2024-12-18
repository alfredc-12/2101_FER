/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.CustomerSide;

import GUI.Extras.EquipmentCount;
import GUI.Extras.EquipmentDAO;
import GUI.Extras.EquipmentTableCellRenderer;
import GUI.Extras.EquipmentTableModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leyzu
 */
public class CustomBundle extends javax.swing.JPanel {

    private Store ParentFrame;
    private EquipmentDAO equipmentDAO;
    private JTable currentTable; 
    private EquipmentCount currentlyPreviewedEquipment;
    private DefaultListModel<String> selectedItemListModel;
    private boolean loginFrame = false;
    
    public CustomBundle(Store ParentFrame) {
        equipmentDAO = new EquipmentDAO();
        this.ParentFrame = ParentFrame;
        initComponents();
        
        ParentFrame.enablePanelDragging(MainPanelDrag);
        ParentFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
        
        selectedItemListModel = new DefaultListModel<>();
        
        
        loadEquipmentTables();
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
        jPanel2 = new javax.swing.JPanel();
        LightingScroll = new javax.swing.JScrollPane();
        lightingTable = new javax.swing.JTable();
        AudioScroll = new javax.swing.JScrollPane();
        audioTable = new javax.swing.JTable();
        CameraScroll = new javax.swing.JScrollPane();
        cameraTable = new javax.swing.JTable();
        MiscellanScroll = new javax.swing.JScrollPane();
        miscellaneousTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SelectedItem = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        Price = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MainPanelDrag = new javax.swing.JPanel();
        Resize_front = new javax.swing.JButton();
        Exit_front = new javax.swing.JButton();
        Minimize_front = new javax.swing.JButton();
        checkout = new javax.swing.JButton();

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
                    .addComponent(LightingScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(AudioScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(CameraScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(MiscellanScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        SelectedItem.setBackground(new java.awt.Color(51, 51, 51));
        SelectedItem.setForeground(new java.awt.Color(255, 255, 255));
        SelectedItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "EQUIPMENT NAME", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SelectedItem);
        if (SelectedItem.getColumnModel().getColumnCount() > 0) {
            SelectedItem.getColumnModel().getColumn(0).setResizable(false);
            SelectedItem.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Price.setBackground(new java.awt.Color(255, 255, 255));
        Price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        checkout.setBackground(new java.awt.Color(102, 102, 102));
        checkout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 255, 255));
        checkout.setText("CHECKOUT");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanelDrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkout)
                .addGap(460, 460, 460))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MainPanelDrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(checkout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
      
    private void loadEquipmentTables() {
        // Load and set up tables for each category
        loadEquipmentTable(CameraScroll, equipmentDAO.getEquipmentCountByCategory(1), cameraTable);
        loadEquipmentTable(AudioScroll, equipmentDAO.getEquipmentCountByCategory(3), audioTable);
        loadEquipmentTable(LightingScroll, equipmentDAO.getEquipmentCountByCategory(2), lightingTable);
        loadEquipmentTable(MiscellanScroll, equipmentDAO.getEquipmentCountByCategory(4), miscellaneousTable);
      
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
        if (e.getClickCount() == 2) {
            int row = table.getSelectedRow();
            int column = table.getSelectedColumn(); // Ensure column is correctly referenced
            EquipmentCount equipment = (EquipmentCount) table.getValueAt(row, column);
            int equipmentID = equipment.getID();
            
            System.out.println("Selected Equipment ID: " + equipmentID);
            
            EquipmentCount detailedEquipment = equipmentDAO.getEquipmentByName(equipment.getName());
            if (detailedEquipment != null) {
                detailedEquipment.setPartOfPackage(false);  // Mark as not part of a package
                currentlyPreviewedEquipment = detailedEquipment;
                
                // Assuming 'Selectitem' is your table for selected items
                DefaultTableModel selectedModel = (DefaultTableModel) SelectedItem.getModel();
                
                // Assuming the price is part of the 'detailedEquipment' object
                double price = detailedEquipment.getPrice(); // Assuming you have a getPrice() method in EquipmentCount
                
                // Add the name and price of the equipment to the table
                Object[] rowData = { detailedEquipment.getName(), price }; // Adding name and price columns
                selectedModel.addRow(rowData); // Add the selected item with price to the "Selected Items" table
                
                // Update the Price JLabel with the current total
                updatePriceLabel();
                
                table.setColumnSelectionInterval(column, column); // Ensure correct column selection
            } else {
                System.out.println("No detailed equipment found for " + equipment.getName());
            }
        }
    }
});

        
        
        
        SelectedItem.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) { // Check if it's a double-click on the selected items table
            int row = SelectedItem.getSelectedRow(); // Get the selected row in the "Selected Items" table
            
            if (row != -1) { // Ensure the row is valid
                DefaultTableModel selectedModel = (DefaultTableModel) SelectedItem.getModel();
                selectedModel.removeRow(row); // Remove the selected row from the "Selected Items" table
                
                // Update the Price JLabel with the current total after removal
                updatePriceLabel();
                
                System.out.println("Removed equipment from the selected items list");
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
    
    
    
    
    private void updatePriceLabel() {
    double totalPrice = 0;

    // Get the model of the table
    DefaultTableModel selectedModel = (DefaultTableModel) SelectedItem.getModel();

    // Check if the table has at least 2 columns
    if (selectedModel.getColumnCount() < 2) {
        Price.setText("Total Price: 0.00"); // Handle case with fewer than 2 columns
        return;
    }

    // Check if the table has rows
    if (selectedModel.getRowCount() == 0) {
        Price.setText("Total Price: 0.00"); // Handle case with no rows
        return;
    }

    // Calculate the total price by iterating over all rows in the SelectedItem table
    for (int i = 0; i < selectedModel.getRowCount(); i++) {
        Object value = selectedModel.getValueAt(i, 1); // Assuming price is in the second column

        // Ensure the value is a valid number
        if (value instanceof Number) {
            double price = ((Number) value).doubleValue();
            totalPrice += price;
        }
    }

    // Update the Price JLabel with the total price
    Price.setText("Total Price: " + totalPrice);
}
    
    private void Resize_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resize_frontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Resize_frontActionPerformed

    private void Exit_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_frontActionPerformed
        // TODO add your handling code here:
        ParentFrame.dispose();
    }//GEN-LAST:event_Exit_frontActionPerformed

    private void Minimize_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minimize_frontActionPerformed
        // TODO add your handling code here:
        ParentFrame.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Minimize_frontActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
    List<EquipmentCount> selectedItems = new ArrayList<>();
    DefaultTableModel selectedModel = (DefaultTableModel) SelectedItem.getModel();
    
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
    } else {
         for (int i = 0; i < selectedModel.getRowCount(); i++) {
        String itemName = (String) selectedModel.getValueAt(i, 0);
        EquipmentCount equipment = equipmentDAO.getEquipmentByName(itemName); // Fetch the EquipmentCount object
        if (equipment != null) {
            selectedItems.add(equipment);
        }
        }

        // If there are no selected items, exit the method
        if (selectedItems.isEmpty()) {
            System.out.println("No items selected.");
            return;
        }

        // Create the Cart panel and pass the selected items to it
        Store parentFrame = (Store) this.getTopLevelAncestor();
        Cart cart = new Cart(ParentFrame, selectedItems);
        cart.retrieveUserInfo();
        parentFrame.setContentPane(cart);    
        parentFrame.revalidate(); // Refresh the frame to show the new panel
        parentFrame.repaint();   
    }
    }//GEN-LAST:event_checkoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AudioScroll;
    private javax.swing.JScrollPane CameraScroll;
    private javax.swing.JButton Exit_front;
    private javax.swing.JScrollPane LightingScroll;
    private javax.swing.JPanel MainPanelDrag;
    private javax.swing.JButton Minimize_front;
    private javax.swing.JScrollPane MiscellanScroll;
    private javax.swing.JLabel Price;
    private javax.swing.JButton Resize_front;
    private javax.swing.JTable SelectedItem;
    private javax.swing.JTable audioTable;
    private javax.swing.JTable cameraTable;
    private javax.swing.JButton checkout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lightingTable;
    private javax.swing.JTable miscellaneousTable;
    // End of variables declaration//GEN-END:variables
}
