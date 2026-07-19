package app.new_collection;

public class Emp implements Comparable<Emp> {
	int id;
	String name;
	String contNo;
	public Emp(int id, String name, String contNo) {
		this.id = id;
		this.name = name;
		this.contNo = contNo;
	}
	public String toString() {
		return id+" "+name+" "+contNo;
	}
	@Override
	public int compareTo(Emp e) {
		return name.compareTo(e.name);
		}
		}

/*//Sorting by using id
public int compareTo(Emp e) {
	if(id==e.id) {
		return 0;
	}else if(id>e.id) {
		return 1;
	}else
		return -1;
	}*/
