abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void processPayment() {
        System.out.println("Processing $" + amount + " payment via Credit Card: " + cardNumber);
    }
}

class PayPalPayment extends Payment {
    String email;

    PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    void processPayment() {
        System.out.println("Processing $" + amount + " payment via PayPal: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment(200.0, "1234-5678-9012-3456");
        Payment paypal = new PayPalPayment(150.0, "user@example.com");

        creditCard.processPayment();
        paypal.processPayment();
    }
}
