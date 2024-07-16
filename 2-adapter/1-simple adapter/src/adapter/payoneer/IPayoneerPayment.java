package adapter.payoneer;

import adapter.utils.Token;

public interface IPayoneerPayment {

	Token authToken();
	void sendPayment();
	void receivePayment();
}
