package durga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Claass_Check {

	public static void main(String[] args) {

		String[] ss= {"w", "x","z","y"};
		
		List l= Arrays.asList(ss);
		
		System.out.println(l);
		
		l.add("jwala");
		l.add("111");
		l.add("kumar");
//		l.set(1, "new Integer(10)");
		
		System.out.println("After Adding elements into Array : "+l);
		
	}

}
