package com.polimorfism;

public class Speaker {
	private int maxVolume;
	private int crtVolume;
	
	public int getMaxVolume() {
		return maxVolume;
	}

	public void setMaxVolume(int maxVolume) {
		this.maxVolume = maxVolume;
	}

	public int getCrtVolume() {
		return crtVolume;
	}

	public void setCrtVolume(int crtVolume) {
		this.crtVolume = crtVolume;
	}

	public Speaker(int maxVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = (int)0.25 * getCrtVolume();
	}
	
	public Speaker(int maxVolume, int crtVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = crtVolume;
	}
	
	public boolean increaseVolume() {
		if(getCrtVolume() < getMaxVolume()) {
			this.crtVolume = getCrtVolume() + 1;
			return true;
		}
		return false;
	}
	
	public boolean decreaseVolume() {
		if(getCrtVolume() > 0) {
			this.crtVolume = getCrtVolume() - 1;
			return true;
		}
		return false;
	}
	
	public void setSilenceMode() {
		this.crtVolume = 0;
	}
}
