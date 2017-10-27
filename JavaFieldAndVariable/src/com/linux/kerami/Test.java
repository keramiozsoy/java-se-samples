package com.linux.kerami;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Instance Variable(Non-Static Fields) [BEGIN] */

		/**
		 * currentSpeed is a instance variable because if you dont create
		 * instance Bicycle dont use currentSpeed
		 */
		Bicycle b1 = new Bicycle();
		b1.setCurrentSpeed(5);

		Bicycle b2 = new Bicycle();
		b2.setCurrentSpeed(6);

		System.out.println("Bicycle b1 speed : " + b1.getCurrentSpeed());
		System.out.println("Bicycle b2 speed : " + b2.getCurrentSpeed());
		System.out.println("-----------------------------------------------");
		/* Instance Variable(Non-Static Fields) [END] */
		/* Class Variable(Static Fields) [BEGIN] */
		
		/**
		 * Instances are use same variable.The variable name is gear.
		 * If you increment gear value you can get same result any instance of class.
		 * The reason is a gear static field.
		 */

		Bicycle b3 = new Bicycle();	
		Bicycle b4 = new Bicycle();
		
		System.out.println("Bicycle b3 gear : " + Bicycle.gear); // You should use value it this way
		b3.incrementGear();
		b4.incrementGear();
		
		System.out.println("Bicycle gear : " + Bicycle.gear);  // you should use value it this way
		System.out.println("Bicycle b3 gear incremented : " + b3.gear); // You should not use it this way
		System.out.println("Bicycle b4 gear incremented : " + b4.gear); // You should not use it this way
		System.out.println("-----------------------------------------------");
		/* Class Variable(Static Fields) [END] */
		
		
		

	}

}
