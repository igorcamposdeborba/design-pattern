package factoryMethod.entities;

import factoryMethod.Iphone;

public class IphoneProImpl implements Iphone {

	@Override
	public void getHardware() {
		System.out.println("2gb de ram");
		System.out.println("120gb de hd");
		System.out.println("Artificial Intelligence");
	}
}
