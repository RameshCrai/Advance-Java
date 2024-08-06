package hashCode;

import java.util.Objects;

public class Human {
	private int age;
	private String fname;
	
	public Human(int a, String f) {
		this.age =a;
		this.fname = f;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(age, fname);
//	}

	@Override
	public int hashCode() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		Human another = (Human)obj;
		if(another.age != this.age) {
			return false;
		}
		return true;
	}
	
	

}
