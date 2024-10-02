package structural.adapter;

public class OldPaymentSystem {
	public void makeTransaction(int amountInCents) {
        System.out.println("Processing payment of " + amountInCents + " cents in the old system.");
    }
}
