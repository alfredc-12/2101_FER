package com.mycompany.fer_main;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private String customerPhone;
    private ArrayList<RentedEquipment> rentedEquipments;
    private boolean delivery;
    private double totalCost;
    private String rentalStartDate;
    private String rentalEndDate;
    private Payment paymentMethod;

    public Order() {
        rentedEquipments = new ArrayList<>();
    }

    public void setCustomerDetails(String name, String phone) {
        this.customerName = name;
        this.customerPhone = phone;
    }

    public void addEquipment(Equipments equipment, int rentalDays, double cost) {
        rentedEquipments.add(new RentedEquipment(equipment, rentalDays, cost));
        totalCost += cost;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public void setRentalDates(String startDate, String endDate) {
        this.rentalStartDate = startDate;
        this.rentalEndDate = endDate;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void displayOrderSummary() {
        System.out.println("Order Summary:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + customerPhone);
        System.out.println("Rental Period: " + rentalStartDate + " to " + rentalEndDate);
        System.out.println("Total Cost: $" + totalCost);
    }

    public class RentedEquipment {
        private Equipments equipment;
        private int rentalDays;
        private double totalCost;

        public RentedEquipment(Equipments equipment, int rentalDays, double totalCost) {
            this.equipment = equipment;
            this.rentalDays = rentalDays;
            this.totalCost = totalCost;
        }

        public Equipments getEquipment() {
            return equipment;
        }

        public int getRentalDays() {
            return rentalDays;
        }

        public double getTotalCost() {
            return totalCost;
        }
    }
}
