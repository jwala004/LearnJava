package java8.naveenautomationlabs.lombokproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Data 
public class Customer {
// @Data : we can use @Data in the place for @ToString, @Setter, @Getter and
// @EqualsAndHashCode

	/*
	 * What is Java Project Lombok? To reduce boilerplate code. And to reduce lines
	 * of code.
	 * 
	 */

	private String name;
	private int age;
	private String address;
	private int zip;
	private int phoneNum;

//	public Customer() {
//		
//	}
//	public Customer(String name, int age, String address, int zip, int phoneNum) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.address = address;
//		this.zip = zip;
//		this.phoneNum = phoneNum;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public int getZip() {
//		return zip;
//	}
//
//	public void setZip(int zip) {
//		this.zip = zip;
//	}
//
//	public int getPhoneNum() {
//		return phoneNum;
//	}
//
//	public void setPhoneNum(int phoneNum) {
//		this.phoneNum = phoneNum;
//	}
//
//	@Override
//	public String toString() {
//		return "Customer [name=" + name + ", age=" + age + ", address=" + address + ", zip=" + zip + ", phoneNum="
//				+ phoneNum + "]";
//	}

}
