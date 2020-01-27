package com.polimorfism;

public class Microphone extends Speaker {
	
	public Microphone(int maxVolume) {
		super(maxVolume);
	}
	
	public Microphone(int maxVolume, int crtVolume) {
		super(maxVolume, crtVolume);
	}
	
	public boolean increaseVolume() {
		if(this.getCrtVolume() < this.getMaxVolume()) {
			this.setCrtVolume(this.getCrtVolume() + 1);
			return true;
		}
		return false;
	}
	
	public boolean decreaseVolume() {
		if(this.getCrtVolume() > 0) {
			this.setCrtVolume(this.getCrtVolume() - 1);
			return true;
		}
		return false;
	}
	
	public void muteMicrophone() {
		this.setCrtVolume(0);
	}

}
