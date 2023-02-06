package Strategy;

public class PaymentContext {
	private PaymentStrategy strategy;
	
	public PaymentContext () {
		this.strategy = new CreditCardPayment();
	}
	
	public void process() {
		System.out.println("--------- debut ----------");
		
		strategy.payer();
	
		System.out.println("----  Fin -----");
	}

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
}
