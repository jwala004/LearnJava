package app.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inserting_anElement_into_String_Array {

	public static void main(String[] args) {
	
	String[] s= {"jwala1","jwala2","jwala3","jwala4","jwala5"};
	
	List<String> list= new ArrayList<String>(Arrays.asList(s));
	
	System.out.print("Before adding element into String Array "+list);
	
	list.add("sonu");//by default values will be added in the end
	list.add(2, "newSonu");
	
	System.out.print("After adding element's into String Array "+list);
	
	}

}
