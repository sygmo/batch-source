package com.revature.beans;

public class Vehicle {
	protected int maxSpeed;
	protected int weightCapacity;
	protected int currentSpeed;
	protected boolean isOperating;
	
	public Vehicle(){
		super();
		this.isOperating = true;
	}

	public Vehicle(int maxSpeed, int weightCapacity, int currentSpeed, boolean isOperating) {
		super();
		this.maxSpeed = maxSpeed;
		this.weightCapacity = weightCapacity;
		this.currentSpeed = currentSpeed;
		this.isOperating = isOperating;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public boolean isOperating() {
		return isOperating;
	}

	public void setOperating(boolean isOperating) {
		this.isOperating = isOperating;
	}
	
	public void speedUp(int increment) {
		this.currentSpeed = this.currentSpeed + increment;
		System.out.println("Vehicle has increased speed by: " +increment);
		System.out.println("Current Vehicle Speed is " +this.currentSpeed);
	}
	
	public void slowDown(int increment) {
		this.currentSpeed = this.currentSpeed - increment;
		System.out.println("Vehicle has decreased speed by: " +increment);
		System.out.println("Current Vehicle Speed is " +this.currentSpeed);
	}
	
	public static void StaticMethod() {
		System.out.println("Super Hero Static Shock!");
	}

	//Hashcode is a unique identifier for an object 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentSpeed;
		result = prime * result + (isOperating ? 1231 : 1237);
		result = prime * result + maxSpeed;
		result = prime * result + weightCapacity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (currentSpeed != other.currentSpeed)
			return false;
		if (isOperating != other.isOperating)
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		if (weightCapacity != other.weightCapacity)
			return false;
		return true;
	}
	
	
	
}