package adapter.adapters;

import adapter.mercadoPago.MercadoPago;
import adapter.paypal.IPaypalPayment;
import adapter.paypal.Paypal;
import adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayment {

	private Token token;
	private MercadoPago mercadoPago;
	
	public MercadoPagoAdapter(MercadoPago mercadoPago) {
		this.mercadoPago = mercadoPago;
		System.out.println("Adaptando o mercado pago  usando as assinaturas de métodos abstratos do Paypal");
	}
	
	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		mercadoPago.getPayments();
		
	}

	@Override
	public void paypalReceive() {
		mercadoPago.pushPayments();
	}

}
