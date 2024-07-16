package adapter.mercadoPago;

import adapter.utils.Token;

public class MercadoPago implements IMercadoPago {

	private Token token;
	
	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void getPayments() {
		System.out.println("Recebidos todos os pagamentos do Mercado Pago");
		
	}

	@Override
	public void pushPayments() {
		System.out.println("Enviados todos os pagamentos para o Mercado Pago");
		
	}

}
