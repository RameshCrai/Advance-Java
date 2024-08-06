package hashCode;

public class Test {
	public static void main(String[] args) {
		Human hum, hum2;
		hum = new Human(23, "Abhilash");
		hum2 = new Human(24, "rameshj");

		/*
		 * HashCode 1) hashCode is not a memory Address Each object has a unique memory
		 * address which helps the object class hashcode() to generate an unique hashcode
		 * for each object that hashcode belong with object class () that is used to
		 * creating unique number for each different object
		 */
		System.out.println(hum.hashCode());
		System.out.println(hum2.hashCode());
		System.out.println(hum.getFname() + " age is =" + hum.getAge());

	
		String ramesh = new String("RameshOM_AIX");
		System.out.println(ramesh);
		int rameshHashcode = ramesh.hashCode();
		System.out.println(rameshHashcode);
		
//		
		String str1 = "FB";
		String str2 = "Ea";
		/*1) if two objects are equal their hashcode will be same 
		 * 2) if two objects hashcode are same you can't guaranty that the objects are equal*/
		
		
		System.out.println(str1.equals(str2));
		System.out.println("hashcode =="+str1.hashCode() +" "+str2.hashCode());
	}
}
