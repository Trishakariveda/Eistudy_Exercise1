package structural.adapter;

public class Main1 {
	public static void main(String[] args) {
        OldPaymentSystem oldPaymentSystem = new OldPaymentSystem();
        NewPaymentSystem paymentAdapter = new PaymentAdapter(oldPaymentSystem);

        // Process payment using the adapter
        paymentAdapter.processPayment(99.99); // Using new system but it works with the old system
    }
}