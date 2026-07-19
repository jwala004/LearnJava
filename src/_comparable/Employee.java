package _comparable;

public class Employee implements Comparable<Employee> {
int id;
String name;
String email;
String mobile;

public Employee(int id,String name, String email, String mobile) {
	this.id=id;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	}
public String toString() {
	return  id+" "+name + " " + email + "  " + mobile ;
}
public int compareTo(Employee e) {
//Sorting on the basis of name
	//return name.compareTo(e.name);
	return email.compareTo(e.email);
	}
	}
/*//Sorting done on the basis of id
public int compareTo(Employee e) {
if(id==e.id)
	return 0;
else if(id>e.id)
	return 1;	
else 
	return -1;
	}
	*/
	