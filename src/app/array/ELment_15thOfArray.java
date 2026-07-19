package app.array;

	// Java program to find the n-th  
	// term in series 1 3 6 10 ...  
	
	public class ELment_15thOfArray{ 
		    // Function to find the nth term of series 
		    static int term(int n) 
		    {      
		        // Loop to add numbers 
		        int ans = 0; 
		        for (int i = 1,j=2; i <= n; i++,j++)  
		           // ans += i;  
		        	ans = ans+i;  
		          
		        return ans; 
		    } 
		  
		    // Driver code 
		    public static void main(String args[]) 
		    { 
		        int n = 4; 
		        System.out.println(term(n)); 
		    } 
		} 
		  
		/*  
	    // Function to find nth term 
	    static int term(int n){ 
	        return n * (n + 1) / 2; 
	    } 
	      
	    // Driver Code 
	    public static void main (String[] args) { 
	        int n = 4; 
	        System.out.println(term(n)); 
	    } 
	} */
			