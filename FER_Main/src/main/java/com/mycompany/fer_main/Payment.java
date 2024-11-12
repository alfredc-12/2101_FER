package com.mycompany.fer_main;

public abstract class Payment {
    protected double amountPaid;

    public Payment(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public abstract String getPaymentType();

    public abstract void displayPaymentDetails();
}

class CashPayment extends Payment {
    public CashPayment(double amountPaid) {
        super(amountPaid);
    }

    @Override
    public String getPaymentType() {
        return "Cash";
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Paid in Cash: $" + amountPaid);
    }
}

class ChequePayment extends Payment {
    public ChequePayment(double amountPaid) {
        super(amountPaid);
    }

    @Override
    public String getPaymentType() {
        return "Cheque";
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Paid by Cheque: $" + amountPaid);
    }
}

class CardPayment extends Payment {
    public CardPayment(double amountPaid) {
        super(amountPaid);
    }

    @Override
    public String getPaymentType() {
        return "Card";
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Paid by Card: $" + amountPaid);
    }
}

class OnlinePayment extends Payment {
    public OnlinePayment(double amountPaid) {
        super(amountPaid);
    }

    @Override
    public String getPaymentType() {
        return "Online Banking";
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Paid via Online Banking: $" + amountPaid);
    }
}
