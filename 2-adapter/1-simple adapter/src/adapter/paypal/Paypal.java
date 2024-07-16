package adapter.paypal;

import adapter.utils.Token;

public class Paypal implements IPaypalPayment {
	
	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.token = authToken();
		System.out.println("Enviando pagamentos via PayPal");
		
	}

	@Override
	public void paypalReceive() {
		System.out.println("Recebendo pagamentos via PayPal");
		
	}

	
}
