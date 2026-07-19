package app.string;

//Java program to Convert characters  
//of a string to opposite case 
 class Convert_String_Characters_INTO_OPPOSITE_CASE_2_Geeks_For_Geeks{ 
    
  /*// Method to convert characters  
  // of a string to opposite case 
  static void convertOpposite(StringBuffer str) 
  { 
     int ln = str.length(); 
         char ch1;
     // Conversion using predefined methods 
     for (int i=0; i<ln; i++) 
     { 
         Character c = str.charAt(i); 
         if (Character.isLowerCase(c)) 
         {
              ch1= Character.toUpperCase(c);
            System.out.print(ch1);
         }
         else if(Character.isUpperCase(c))
         {
//             str.replace(i, i+1, Character.toLowerCase(c)+""); 
        	ch1= Character.toLowerCase(c); 
         System.out.print(ch1);
     } 
         else
         {
        	 
         }
     }
     
  } 
    
  public static void main(String[] args)  
  { 
      StringBuffer str = new StringBuffer("GeEkSfOrGeEkS"); 
      // Calling the Method 
      convertOpposite(str); 
        
//      System.out.println(str); 
     } 
} */
	 
	       
	     // Method to convert characters  
	     // of a string to opposite case 
	     static void convertOpposite(StringBuffer str) 
	     { 
	        int ln = str.length(); 
	            
	        // Conversion using predefined methods 
	            
	        for (int i=0; i<ln; i++) 
	        { 
	            Character c = str.charAt(i); 
	            if (Character.isLowerCase(c))
	            {
//	            	System.out.println(c);
//	                str.replace(i, i+1, Character.toUpperCase(c)+"");
	                System.out.print(Character.toUpperCase(c));
	            }
	            else if(Character.isUpperCase(c))
	            {
//	                str.replace(i, i+1, Character.toLowerCase(c)+""); 
	            
	              System.out.print(Character.toLowerCase(c));
	            }
	            else if(Character.isSpaceChar(c)) {
	            	//System.out.print(Character.isWhitespace(c));
	            	System.out.print(" ");
	            }
	            else
		        {
		        	
		        }    
	        } 
	        
	     }
 
	     
	   
	       
	     public static void main(String[] args)  
	     { 
	         StringBuffer str = new StringBuffer("My Name Is Jwala Kumar"); 
	         // Calling the Method 
         convertOpposite(str); 
	           
//	         System.out.println(str); 
	         /*for(int z=0;z<=255;z++) {
	        	 
	        	 char ch=(char)z;
	        	 System.out.println("ASCII value of " +z+ " "+ch);
	         }*/
	        	
	        	 
	       
	        
	 } 
 }