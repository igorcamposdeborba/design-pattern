package adapter.adapters;

import adapter.payoneer.Payoneer;
import adapter.paypal.IPaypalPayment;
import adapter.utils.Token;

public class PayoneerAdapter implements IPaypalPayment { // Adaptador para se adaptar a classe principal

	private Token token;
	private Payoneer payoneer;
	
	public PayoneerAdapter(Payoneer payoneer) {
		this.payoneer = payoneer;
		System.out.println("adaptando o payoneer usando as assinaturas de métodos abstratos do Paypal");
	}
	
	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.payoneer.sendPayment();
	}

	@Override
	public void paypalReceive() {
		this.payoneer.receivePayment();
	}
	
	
}
