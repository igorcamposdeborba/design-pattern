package adapter.paypal;

import adapter.utils.Token;

public interface IPaypalPayment {

	Token authToken();
	void paypalPayment();
	void paypalReceive();
}
