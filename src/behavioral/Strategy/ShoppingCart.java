package behavioral.Strategy;

public class ShoppingCart {
	private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) { // Change int to double
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set!");
            return;
        }
        paymentStrategy.pay(amount); // Ensure that paymentStrategy accepts a double
        System.out.println("Payment of " + amount + " made using " + paymentStrategy.getClass().getSimpleName() + ".");
    }
}