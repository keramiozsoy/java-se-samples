package com.linux.kerami;

public class Bicycle {

	
	int currentSpeed;
	static int gear = 1;
	
	public void incrementGear(){
		gear = gear + 1;
	}
	
	public void changeBicycleColor(){
		String bicycleName = "RED";
		System.out.println(bicycleName);
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	
}
