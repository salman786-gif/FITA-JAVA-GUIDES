package fita.guides.oops.part.two;

/*
 * An interface defines a contract that different payment classes implement.
 * Each payment type provides its own version of pay().
 */
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Cash: " + amount);
    }
}

/*
 * An abstract class can implement an interface without implementing
 * every interface method. Its concrete child class completes the contract.
 */
abstract class OnlinePayment implements Payment {
    void validatePayment() {
        System.out.println("Payment validated");
    }
}

class QRPayment extends OnlinePayment {
    @Override
    public void pay(double amount) {
        validatePayment();
        System.out.println("Paid using QR: " + amount);
    }
}

/*
 * Run this class to see interface-based polymorphism:
 * java fita.guides.oops.part.two.PaymentDemo
 */
class PaymentDemo {
    public static void main(String[] args) {
        Payment[] paymentMethods = {
            new CreditCardPayment(),
            new UpiPayment(),
            new CashPayment(),
            new QRPayment()
        };

        double[] amounts = {1000.0, 500.0, 200.0, 300.0};

        for (int i = 0; i < paymentMethods.length; i++) {
            paymentMethods[i].pay(amounts[i]);
        }
    }
}
