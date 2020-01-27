package com.polimorfism;

public class TestSmartphone {

	public static void main(String[] args) {
		Smartphone device1 = new Smartphone(50, 5, 10, 2, 100, 100);
		Smartphone device2 = new Smartphone(35, 5, 7, 2, 100, 30, 100, 50);
		
		device1.getScreen().displayPixels();
		device1.colorScreen("black");
		System.out.println(device1);
		device1.getScreen().displayPixels();
		device1.setPixel(1, "yellow");
		device1.getScreen().displayPixels();
		device1.pressVolumeDown();
		System.out.println(device1);
		device1.pressVolumeUp();
		System.out.println(device1);
		
		device2.increaseMicrophoneVolume();
		System.out.println(device2);
		device2.decreaseMicrophoneVolume();
		System.out.println(device2);
		device2.muteMicrophone();
		System.out.println(device2);
		device2.setSilenceMode();
		System.out.println(device2);
		

	}

}
