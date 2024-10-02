package structural.adapter;

public class PaymentAdapter implements NewPaymentSystem {
	private OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

@Override
public void processPayment(double amount) {
    // Convert dollars to cents and call old system's method
    int amountInCents = (int) (amount * 100);
    oldPaymentSystem.makeTransaction(amountInCents);
}
}