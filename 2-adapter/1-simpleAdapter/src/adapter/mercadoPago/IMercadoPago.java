package adapter.mercadoPago;

import adapter.utils.Token;

public interface IMercadoPago {

	Token authToken();
	
	void getPayments();
	void pushPayments();
}
