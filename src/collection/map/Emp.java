package collection.map;

	public class Emp {
	int EmpId;
	String EmpName;
	String EmpContactNo;
	public Emp(int EmpId, String EmpName, String EmpContactNo) {
		
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.EmpContactNo = EmpContactNo;
	}
	public String toString() {
		return  EmpId+ " " + EmpName + "  " + EmpContactNo ;
	}
	}

