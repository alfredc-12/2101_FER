package com.mycompany.fer_main;

import javax.swing.*;
import java.util.ArrayList;

public class FER_Main {

    public static ArrayList<Order> currentOrderList = new ArrayList<>();
    public static ArrayList<Equipments> equipmentList = new ArrayList<>();
    public static ArrayList<Package> packageList = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Film Equipment Rental System");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI gui = new GUI(equipmentList, packageList);
                frame.add(gui);
                frame.setSize(800, 600);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
