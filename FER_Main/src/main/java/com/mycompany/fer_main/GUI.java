package com.mycompany.fer_main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUI extends JPanel {
    
    private List<Equipments> equipmentList;
    private List<Package> availablePackages;
    private JTextField nameField;
    private JTextField priceField;
    private JComboBox<String> categoryComboBox;
    private JButton addEquipmentButton;
    private JButton displayInventoryButton;
    private JButton customerOrderButton;
    private JButton backButton;
    private JPanel contentPanel;

    public GUI(List<Equipments> equipmentList, List<Package> availablePackages) {
        this.equipmentList = equipmentList;
        this.availablePackages = availablePackages;
        this.contentPanel = new JPanel();
        this.contentPanel.setLayout(new BorderLayout());
        setLayout(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);
        showMainMenu(); // Show main menu initially
    }

    private void showMainMenu() {
        contentPanel.removeAll();
        contentPanel.setLayout(new FlowLayout());

        // Welcome Screen
        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new BoxLayout(welcomePanel, BoxLayout.Y_AXIS));
        JLabel welcomeLabel = new JLabel("Welcome!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        welcomePanel.add(welcomeLabel);
        welcomePanel.add(new JLabel("to"));
        JLabel systemLabel = new JLabel("Film Equipment Rental System");
        systemLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomePanel.add(systemLabel);
        contentPanel.add(welcomePanel, BorderLayout.CENTER);

        // After a few seconds, show main menu options
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMainButtons();
            }
        });
        timer.setRepeats(false);
        timer.start();

        revalidate();
        repaint();
    }

    private void showMainButtons() {
        contentPanel.removeAll();
        setLayout(new FlowLayout());

        JButton adminMenuButton = new JButton("Admin Menu");
        adminMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAdminMenu();
            }
        });
        contentPanel.add(adminMenuButton);

        JButton customerMenuButton = new JButton("Customer Menu");
        customerMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCustomerMenu();
            }
        });
        contentPanel.add(customerMenuButton);

        revalidate();
        repaint();
    }

    private void showAdminMenu() {
        contentPanel.removeAll();
        contentPanel.setLayout(new GridLayout(6, 1));

        addEquipmentButton = new JButton("Add Equipment");
        addEquipmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAddEquipmentForm();
            }
        });
        contentPanel.add(addEquipmentButton);

        displayInventoryButton = new JButton("Display Equipment");
        displayInventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCategorySelectionForDisplay();
            }
        });
        contentPanel.add(displayInventoryButton);

        JButton createPackageButton = new JButton("Create Package");
        createPackageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createPackage();
            }
        });
        contentPanel.add(createPackageButton);

        JButton returnEquipmentButton = new JButton("Return Equipment");
        returnEquipmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnEquipment();
            }
        });
        contentPanel.add(returnEquipmentButton);

        backButton = new JButton("Back to Main Menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMainButtons();
            }
        });
        contentPanel.add(backButton);

        revalidate();
        repaint();
    }

    private void showCustomerMenu() {
        contentPanel.removeAll();
        contentPanel.setLayout(new GridLayout(5, 1));

        String[] categories = {"Camera Equipment", "Lighting Equipment", "Audio Equipment", "Miscellaneous"};
        for (String category : categories) {
            JButton categoryButton = new JButton("View " + category);
            categoryButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    displayCategoryEquipment(category);
                }
            });
            contentPanel.add(categoryButton);
        }

        backButton = new JButton("Back to Main Menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMainButtons();
            }
        });
        contentPanel.add(backButton);

        revalidate();
        repaint();
    }

    private void showCategorySelectionForDisplay() {
        contentPanel.removeAll();
        contentPanel.setLayout(new BorderLayout());

        // JComboBox for selecting a category
        String[] categories = {"Camera Equipment", "Lighting Equipment", "Audio Equipment", "Miscellaneous"};
        categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCategoryEquipment((String) categoryComboBox.getSelectedItem());
            }
        });

        // Add the JComboBox to the top of the panel
        contentPanel.add(categoryComboBox, BorderLayout.NORTH);

        // JTextArea to display the equipment list for the selected category
        JTextArea displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        contentPanel.add(scrollPane, BorderLayout.CENTER);

        backButton = new JButton("Back to Admin Menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAdminMenu();
            }
        });
        contentPanel.add(backButton, BorderLayout.SOUTH);

        revalidate();
        repaint();
    }

    private void displayCategoryEquipment(String category) {
        JTextArea displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);

        // Display the equipment of the selected category
        for (Equipments equipment : equipmentList) {
            if (equipment.getCategory().equals(category)) {
                displayArea.append(equipment.toString() + "\n");
            }
        }

        // Update the display area to show the equipment for the selected category
        JScrollPane scrollPane = new JScrollPane(displayArea);
        contentPanel.removeAll();
        contentPanel.add(categoryComboBox, BorderLayout.NORTH);  // Keep the JComboBox
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        contentPanel.add(backButton, BorderLayout.SOUTH);

        revalidate();
        repaint();
    }

    private void showAddEquipmentForm() {
        contentPanel.removeAll();
        contentPanel.setLayout(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Equipment Name:");
        nameField = new JTextField();
        contentPanel.add(nameLabel);
        contentPanel.add(nameField);

        JLabel categoryLabel = new JLabel("Category:");
        String[] categories = {"Camera Equipment", "Lighting Equipment", "Audio Equipment", "Miscellaneous"};
        categoryComboBox = new JComboBox<>(categories);
        contentPanel.add(categoryLabel);
        contentPanel.add(categoryComboBox);

        JLabel priceLabel = new JLabel("Price:");
        priceField = new JTextField();
        contentPanel.add(priceLabel);
        contentPanel.add(priceField);

        JButton submitButton = new JButton("Add Equipment");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEquipment();
            }
        });
        contentPanel.add(submitButton);

        backButton = new JButton("Back to Admin Menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAdminMenu();
            }
        });
        contentPanel.add(backButton);

        revalidate();
        repaint();
    }

    private void addEquipment() {
        String name = nameField.getText();
        String category = (String) categoryComboBox.getSelectedItem();
        double price = Double.parseDouble(priceField.getText());

        Equipments newEquipment = new Equipments(name, category, price);
        equipmentList.add(newEquipment);
        
        // Clear fields and show success message
        nameField.setText("");
        priceField.setText("");
        categoryComboBox.setSelectedIndex(0);
        JOptionPane.showMessageDialog(this, "Equipment added successfully!");
        showAdminMenu();
    }

    private void returnEquipment() {
        String name = JOptionPane.showInputDialog(this, "Enter the equipment name to return:");
        for (Equipments equipment : equipmentList) {
            if (equipment.getName().equals(name)) {
                equipmentList.remove(equipment);
                JOptionPane.showMessageDialog(this, "Equipment returned successfully!");
                break;
            }
        }
    }

    private void createPackage() {
        String name = JOptionPane.showInputDialog(this, "Enter package name:");
        String priceInput = JOptionPane.showInputDialog(this, "Enter package price:");
        double price = Double.parseDouble(priceInput);
        Package newPackage = new Package(name, price);
        availablePackages.add(newPackage);
        JOptionPane.showMessageDialog(this, "Package created successfully!");
    }
}
