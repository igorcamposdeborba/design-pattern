package adapter;

import adapter.adapters.PayoneerAdapter;
import adapter.payoneer.Payoneer;
import adapter.paypal.IPaypalPayment;
public class Main {
	public static void main(String [] args) {
		
		IPaypalPayment payment = new PayoneerAdapter(new Payoneer()); // adaptador no construtor
		
		payment.paypalPayment();
		payment.paypalReceive();
	}
}
