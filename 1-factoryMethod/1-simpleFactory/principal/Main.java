package factoryMethod.principal;

import factoryMethod.Iphone;
import factoryMethod.service.IphoneSimpleFactory;

public class Main {
	public static void main (String [] args) {
		Iphone iphone1 = IphoneSimpleFactory.create("Pro", "Standard");
		System.out.println(iphone1 + "\n");
		
		Iphone iphone2 = IphoneSimpleFactory.create("Pro", "Advanced");
		System.out.println(iphone2);
	}
}
