package Equals;

import hashCode.Human;

public class EqualsDemo {
	public static void main(String[] args) {
		
		Human hum = new Human(25,"Ramesh");
		Human hum1 = new Human(26,"Binu");
		
//		==operator => (check for identity) use heap memory
		System.out.println(hum == hum1);
		
//		Equals => use for object here is inherited from Object class
		boolean  check = hum.equals(hum1);
		System.out.println(check);
		
	}

}
