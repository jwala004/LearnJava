package com.java.lovecalci;

import java.util.*;

public class Print_Random_Value_By_Taking_User_INPUT {

	public static void main(String[] args) {
		
		while (true) {
			
			System.out.println("Enter some integer value, to generate Random String value : ");
			
			String[] ss = { "jwala1", "jwala2", "jwala3", "jwala4", "jwala5", "jwala6", "jwala7", "jwala8", "jwala9",
					"jwala10" };

			Random random = new Random();

			Scanner scanner = new Scanner(System.in);

			int ii = scanner.nextInt();
			
			int iii= random.nextInt(ii);
			
			System.out.println(ss[iii]);

		}
	}

}
