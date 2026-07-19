package app.printcharacter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int i, j, k = 1;
//		char ch;
		System.out.println("Input an Alphabet in capital letters that you want to print:");

		Scanner ch = new Scanner(System.in);

		char c = ch.next().charAt(0);
//		System.out.println("/n");
		switch (c) {
		case 'A':
//			System.out.println("/t");
			for (i = 1; i <= 20; ++i) {
				for (j = 0; j <= 11; ++j) {
					if (i == 1 || i == 2 || i == 10 || i == 9)
						System.out.print("*");
					else {
						if (j == 0 || j == 9)
							System.out.print("** ");
						else
							System.out.print(" ");
					}
				}
				System.out.println(" ");

			}
			break;
			// For Character 'B'
		case 'B':

			while(k<=2)
			{
			for(i=1;i<=9;++i)
			{
			for(j=0;j<=i;++j)
			{
			if(j==0||j==i)
			System.out.print("** ");
			else
				System.out.print(" ");
			}

			System.out.println("");
			}
			for(i=1;i<=10;++i)
			{
			if(i==1||i==10)
				System.out.print("** ");
			else
				System.out.print(" ");
			}
			System.out.println("");

			for(i=1;i<=10;++i)
			{
			if(i==1||i==10)
				System.out.print("** ");
			else
				System.out.print(" ");
			}
			System.out.println("");
			for(i=9;i>=1;--i)
			{
			for(j=0;j<=i;++j)
			{
			if(j==0||j==i)
				System.out.print("** ");
			else
				System.out.print(" ");
			}
			System.out.println("");
			}
			++k;
			}
			break;
		default:

		}
	}

}
