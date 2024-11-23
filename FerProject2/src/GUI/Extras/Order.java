package GUI.Extras;

import java.util.Date;

public class Order {
    private int customerOrderID;
    private String startDate;  // Change to String
    private String endDate;    // Change to String
    private String paymentMethod;
    private double totalCost;

    public Order(int customerOrderID, String startDate, String endDate, String paymentMethod, double totalCost) {
        this.customerOrderID = customerOrderID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentMethod = paymentMethod;
        this.totalCost = totalCost;
    }

    public int getCustomerOrderID() {
        return customerOrderID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getTotalCost() {
        return totalCost;
    }
}