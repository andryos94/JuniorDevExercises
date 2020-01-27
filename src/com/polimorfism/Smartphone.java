package com.polimorfism;

public class Smartphone {
	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;
	
	public Smartphone(int noOfPixels, int width, int length, int depth, int maxVolumeSpeaker, int maxVolumeMicrophone) {
		Dimensions dimensions = new Dimensions(width, length, depth);
		this.theScreen = new Screen(noOfPixels, dimensions);
		this.theSpeaker = new Speaker(maxVolumeSpeaker);
		this.theMicrophone = new Microphone(maxVolumeMicrophone);
		this.theCase = new Case();
	}
	
	public Smartphone(int noOfPixels, int width, int length, int depth, int maxVolumeSpeaker, int crtVolumeSpeaker, int maxVolumeMicrophone, int crtVolumeMicrophone) {
		Dimensions dimensions = new Dimensions(width, length, depth);
		this.theScreen = new Screen(noOfPixels, dimensions);
		this.theSpeaker = new Speaker(maxVolumeSpeaker, crtVolumeSpeaker);
		this.theMicrophone = new Microphone(maxVolumeMicrophone, crtVolumeMicrophone);
		this.theCase = new Case();
	}
	
	public void pressVolumeUp() {
		this.theCase.pressVolumeUp();
		this.theSpeaker.increaseVolume();
	}
	
	public void pressVolumeDown() {
		this.theCase.pressVolumeDown();
		this.theSpeaker.decreaseVolume();
	}
	
	public void setPixel(int indexOfPixel, String color) {
		this.theScreen.setPixel(indexOfPixel, color);
	}
	
	public void colorScreen(String color) {
		this.theScreen.colorScreen(color);
	}
	
	public void increaseMicrophoneVolume() {
		this.theMicrophone.increaseVolume();
	}
	
	public void decreaseMicrophoneVolume() {
		this.theMicrophone.decreaseVolume();
	}
	
	public void muteMicrophone() {
		this.theMicrophone.muteMicrophone();
	}
	
	public void setSilenceMode() {
		this.theSpeaker.setCrtVolume(0);
	}
	
	public Screen getScreen() {
		return this.theScreen;
	}
	public String toString() {
		return ("The smartphone has the following features:\n\t - Width: " + this.theScreen.getDimensions().getWidth() +
				"\n\t - Length: " + this.theScreen.getDimensions().getLength() +
				"\n\t - Depth: " + this.theScreen.getDimensions().getDepth() +
				"\n\t - No. of pixels: " + this.theScreen.getPixels().size() +
				"\n\t - Current volume of Speaker: " + this.theSpeaker.getCrtVolume() + 
				"\n\t - Current volume of Microphone: " + this.theMicrophone.getCrtVolume());
	}
}
