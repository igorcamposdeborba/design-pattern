package factoryMethod.service;

import factoryMethod.Iphone;
import factoryMethod.entities.IphoneProImpl;
import factoryMethod.entities.IphoneStandardImpl;

public class IphoneSimpleFactory {
	
	public static Iphone create(String generation, String level) {
		Iphone iphone = null;
		
		switch(generation.toLowerCase()) {
			case "pro":
				if ("standard".equalsIgnoreCase(level)) {
					iphone = new IphoneStandardImpl(); // classe concreta 1
				}
				if ("advanced".equalsIgnoreCase(level)) {
					iphone = new IphoneProImpl(); // classe concreta 2
				}
		}
		iphone.getHardware();
		
		return iphone;
	}
}
