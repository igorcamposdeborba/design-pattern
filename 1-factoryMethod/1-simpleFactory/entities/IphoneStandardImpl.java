package factoryMethod.entities;

import factoryMethod.Iphone;

public class IphoneStandardImpl implements Iphone {

	@Override
	public void getHardware() {
		System.out.println("1gb de ram");
		System.out.println("60gb de hd");
	}
}
