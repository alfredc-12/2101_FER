/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.AdminDashboard;
import GUI.AdminDashboard.PackageEquip;
import GUI.AdminDashboard.Main_Menu;
import GUI.Extras.EquipmentDAO;
import GUI.Extras.Equipment;
import GUI.Extras.EquipmentCount;
import GUI.Extras.EquipmentListCellRenderer;
import GUI.Extras.NonEditableTableModel;
import GUI.GuiFer;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author asadagreat
 */
public class Display_Inv extends javax.swing.JPanel {

    private GuiFer parentFrame;
    private EquipmentDAO equipmentDAO;
    private NonEditableTableModel tableModel;
    private int currentCategoryID = 1;
    public Display_Inv(GuiFer frame) {
        this.parentFrame = frame;
        equipmentDAO = new EquipmentDAO();
        initComponents();
        parentFrame.enablePanelDragging(MainPanelDrag);
        postInitComponents();
        loadEquipment(1);
        
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
        EmptyPannel = new javax.swing.JPanel();
        CameraBut = new javax.swing.JButton();
        LightBut = new javax.swing.JButton();
        AudioBut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        equipmentScrollPane = new javax.swing.JScrollPane();
        equipmentTable = new javax.swing.JTable();
        Editbutton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        MisceBut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DisplayBut = new javax.swing.JButton();
        BundleBut = new javax.swing.JButton();
        CustomerOrderBut = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        OpenMenu = new javax.swing.JButton();
        Reports = new javax.swing.JButton();
        EditFront = new javax.swing.JButton();
        Returncalc = new javax.swing.JButton();
        AddBut = new javax.swing.JButton();
        MainPanelDrag = new javax.swing.JPanel();
        Resize_front = new javax.swing.JButton();
        Exit_front = new javax.swing.JButton();
        Minimize_front = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EmptyPannel.setBackground(new java.awt.Color(102, 102, 102));
        EmptyPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        CameraBut.setBackground(new java.awt.Color(51, 51, 51));
        CameraBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CameraBut.setForeground(new java.awt.Color(255, 255, 255));
        CameraBut.setText("CAMERA");
        CameraBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CameraBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CameraButActionPerformed(evt);
            }
        });

        LightBut.setBackground(new java.awt.Color(51, 51, 51));
        LightBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LightBut.setForeground(new java.awt.Color(255, 255, 255));
        LightBut.setText("LIGHTING");
        LightBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LightBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LightButActionPerformed(evt);
            }
        });

        AudioBut.setBackground(new java.awt.Color(51, 51, 51));
        AudioBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AudioBut.setForeground(new java.awt.Color(255, 255, 255));
        AudioBut.setText("AUDIO");
        AudioBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AudioBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AudioButActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        equipmentScrollPane.setBackground(new java.awt.Color(102, 102, 102));

        equipmentTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        equipmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Equipment Name", "Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        equipmentTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        equipmentScrollPane.setViewportView(equipmentTable);

        Editbutton.setBackground(new java.awt.Color(102, 102, 102));
        Editbutton.setForeground(new java.awt.Color(255, 255, 255));
        Editbutton.setText("Edit");
        Editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbuttonActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(equipmentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Editbutton)
                        .addGap(255, 255, 255))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equipmentScrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editbutton)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12))
        );

        MisceBut.setBackground(new java.awt.Color(51, 51, 51));
        MisceBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MisceBut.setForeground(new java.awt.Color(255, 255, 255));
        MisceBut.setText("MISCELLANEOUS");
        MisceBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MisceBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisceButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmptyPannelLayout = new javax.swing.GroupLayout(EmptyPannel);
        EmptyPannel.setLayout(EmptyPannelLayout);
        EmptyPannelLayout.setHorizontalGroup(
            EmptyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(EmptyPannelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(CameraBut, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LightBut, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AudioBut, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MisceBut, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmptyPannelLayout.setVerticalGroup(
            EmptyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmptyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CameraBut)
                    .addComponent(LightBut)
                    .addComponent(AudioBut)
                    .addComponent(MisceBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CUSTOMER");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(21, 21, 21))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ADMIN");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(45, 45, 45))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DisplayBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BundleBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CustomerOrderBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(10, 10, 10)
                .addComponent(EmptyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(MainPanelDrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(MainPanelDrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmptyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String[] columnNames = {"Name", "Rented Price", "Availability"};

        tableModel = new NonEditableTableModel(columnNames, 0);

        equipmentTable.setModel(tableModel);

        equipmentScrollPane.setViewportView(equipmentTable);
        
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

    }

    public void loadEquipment(int categoryID) {
        tableModel.setRowCount(0); // Clear existing items from the table
        List<EquipmentCount> equipmentCounts = equipmentDAO.getEquipmentCountByCategory(categoryID);
        for (EquipmentCount equipmentCount : equipmentCounts) {
            Object[] rowData = {
                equipmentCount.getName(),
                String.format("%.2f", equipmentCount.getPrice()),
                equipmentCount.getAvailableCount() + "/" + equipmentCount.getTotalCount()
            };
            tableModel.addRow(rowData); // Add each equipment item to the table model
        }
    }

    private void filterTable() {
        String query = searchField.getText().toLowerCase();
        tableModel.setRowCount(0); // Clear existing rows

        List<EquipmentCount> equipmentCounts = equipmentDAO.getEquipmentCountByCategory(currentCategoryID); // Use a variable to track the current category
        for (EquipmentCount equipmentCount : equipmentCounts) {
            if (equipmentCount.getName().toLowerCase().contains(query)) {
                Object[] rowData = {
                    equipmentCount.getName(),
                    String.format("%.2f", equipmentCount.getPrice()),
                    equipmentCount.getAvailableCount() + "/" + equipmentCount.getTotalCount()
                };
                tableModel.addRow(rowData);
            }
        }
    }
    
    public void refreshTable() {
        loadEquipment(currentCategoryID); // Reload equipment based on the current category
    }
    
    private void EditbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbuttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = equipmentTable.getSelectedRow();
            if (selectedRow != -1) {
                // Retrieve data from the selected row
                String name = (String) tableModel.getValueAt(selectedRow, 0);
                double price = Double.parseDouble((String) tableModel.getValueAt(selectedRow, 1));
                String availability = (String) tableModel.getValueAt(selectedRow, 2);

                // Fetch detailed information from the database based on the name
                EquipmentCount equipmentCount = equipmentDAO.getEquipmentByName(name);

                // Open and populate the EditEquipment frame
                EditEquipment editFrame = new EditEquipment(equipmentCount, this);
                editFrame.setVisible(true);
            }
    }//GEN-LAST:event_EditbuttonActionPerformed

    private void AudioButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AudioButActionPerformed
        // TODO add your handling code here:
        loadEquipment(3);
    }//GEN-LAST:event_AudioButActionPerformed

    private void LightButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LightButActionPerformed
        // TODO add your handling code here:
        loadEquipment(2);
    }//GEN-LAST:event_LightButActionPerformed

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

    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed
        
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

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void CameraButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CameraButActionPerformed
        // TODO add your handling code here:
        loadEquipment(1);
    }//GEN-LAST:event_CameraButActionPerformed

    private void MisceButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MisceButActionPerformed
        // TODO add your handling code here:
        loadEquipment(4);
    }//GEN-LAST:event_MisceButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBut;
    private javax.swing.JButton AudioBut;
    private javax.swing.JButton BundleBut;
    private javax.swing.JButton CameraBut;
    private javax.swing.JButton CustomerOrderBut;
    private javax.swing.JButton DisplayBut;
    private javax.swing.JButton EditFront;
    private javax.swing.JButton Editbutton;
    private javax.swing.JPanel EmptyPannel;
    private javax.swing.JButton Exit_front;
    private javax.swing.JButton LightBut;
    private javax.swing.JPanel MainPanelDrag;
    private javax.swing.JButton Minimize_front;
    private javax.swing.JButton MisceBut;
    private javax.swing.JButton OpenMenu;
    private javax.swing.JButton Reports;
    private javax.swing.JButton Resize_front;
    private javax.swing.JButton Returncalc;
    private javax.swing.JScrollPane equipmentScrollPane;
    private javax.swing.JTable equipmentTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
