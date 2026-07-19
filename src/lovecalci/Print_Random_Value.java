package com.java.lovecalci;

import java.util.*;

public class Print_Random_Value {

	public static void main(String[] args) {

		String[] ss= {"jwala1", "jwala2", "jwala3", "jwala4","jwala5",  "jwala6", "jwala7", "jwala8", "jwala9", "jwala10",};
		
		Random random = new Random();
		int ii = random.nextInt(ss.length);
		
		System.out.println(ss[ii]);
		
	}

}
