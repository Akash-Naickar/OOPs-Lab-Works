class PaymentProcessor {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " in cash.");
    }

    void pay(String cardNumber, double amount) {
        System.out.println("Paid $" + amount + " using Card: " + cardNumber);
    }

    void pay(String upiID, double amount, boolean isUPI) {
        System.out.println("Paid $" + amount + " using UPI ID: " + upiID);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment = new PaymentProcessor();
        
        payment.pay(100.0);
        payment.pay("1234-5678-9012-3456", 250.0);
        payment.pay("user@upi", 500.0, true);
    }
}
