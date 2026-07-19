package app.calculator;

import java.util.Scanner;

public class Ashwini_Currency_Converter implements CurrencyConverter{

	public void rupeesToDollar()
	{
		float rupees;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter rupees:");

        rupees = in.nextFloat();

        float dollars = rupees / 64;

        System.out.println(dollars + " Dollars");

	}
	
	public void rupeesToPound()
	{
		float rupees;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter rupees:");

        rupees = in.nextFloat();

        float dollars = rupees / 74;

        System.out.println(dollars + " Pound");

		
	}
	
	
	void switchm1() {
		

		System.out.println("1.Rupees to Dollar ");
		System.out.println("2.Rupees to Pound ");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		
		switch(choice)
		{
			
			case 1:
			
			{
				rupeesToDollar();
				
				break;
			}
			case 2:
			{
			   rupeesToPound();	
			}
		}
		
		
	}
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ashwini_Currency_Converter ash = new Ashwini_Currency_Converter();
		
		ash.switchm1();
		
	}	
	

}
