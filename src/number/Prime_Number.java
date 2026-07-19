package number;

import java.util.Scanner;

//M-1 to find Prime number

public class Prime_Number {

	public static void main(String[] args) {

	int num=4;
	int count=0;
	
    
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
		   	count++;
		}
	
	}
	  if(count==2)
	  {
		  System.out.println(num+" is a Prime Number");
	  }
	  
	  else 
	  {
		  System.out.println(num+" is not a Prime Number");
	  }
	}

}

/*

//prime number code by taking input from user

import java.util.Scanner;
public class Prime_Number {

	public static void main(String[] args) {

	int num;
	int count=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
    
	num=obj.nextInt();
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
		   	count++;
		}
	
	}
	  if(count==2)
	  {
		  System.out.println("Number is prime" +num);
	  }
	  
	  else 
	  {
		  System.out.println("Number is not prme" +num);
	  }
	}

}
*/