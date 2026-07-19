package app.string;

public class Address {
	private String village;
	private int pincode;
	private String post_office;
	private String district;
	private String state;
	private String country;

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPost_office() {
		return post_office;
	}

	public void setPost_office(String post_office) {
		this.post_office = post_office;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [village=" + village + ", pincode=" + pincode + ", post_office=" + post_office + ", district="
				+ district + ", state=" + state + ", country=" + country + "]";
	}

}
