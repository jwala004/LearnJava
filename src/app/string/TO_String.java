package app.string;

public class TO_String {

	private int id;
	private String name;
	private String bloodGroup;
	private String Session;
	private String Mobile_NO;
	private String Standard;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getSession() {
		return Session;
	}

	public void setSession(String session) {
		Session = session;
	}

	public String getMobile_NO() {
		return Mobile_NO;
	}

	public void setMobile_NO(String mobile_NO) {
		Mobile_NO = mobile_NO;
	}

	public String getStandard() {
		return Standard;
	}

	public void setStandard(String standard) {
		Standard = standard;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student Ankit Details [id=" + id + ", name=" + name + ", bloodGroup=" + bloodGroup + ", Session="
				+ Session + ", Mobile_NO=" + Mobile_NO + ", Standard=" + Standard + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		TO_String aa = new TO_String();

		aa.setId(1111);
		aa.setName("Ankit kumar");
		aa.setSession("2019-2020");
		aa.setBloodGroup("O+");
		aa.setStandard("11th");
		aa.setMobile_NO("999999999");
	
		
		Address ad = new Address();
		ad.setVillage("Bhatauli");
		ad.setPincode(802164);
		ad.setPost_office("Bhatauli");
		ad.setCountry("India");
		ad.setState("Bihar");
		ad.setDistrict("Ara");

		aa.setAddress(ad);
		
		System.out.println(aa);// address reference is passed in employee,so as we will print STUDENT Details, address data will be also printed.
//		System.out.println(ad);
	}

}
