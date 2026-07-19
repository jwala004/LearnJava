package com.java.lovecalci;

import java.util.Scanner;

public class loveCalcultorASHWini {

	static int total1 = 10;
	static int total2 = 20;
	static int total3 = 30;
	static int total4 = 40;
	static int total5 = 50;
	static int total6 = 60;
	static int total7 = 70;

	public static void main(String[] args) {
		
//		String s1="";
//		String s2=" ";String s3="  ";String s4="   ";
//		
//		System.out.println(s1.toString().trim().length()+" "+s2.toString().trim().length()+" "+s3.toString().trim().length()+" "+s4.toString().trim().length());

		while (true) {

			System.out.println("Enter Your name ");
			Scanner scanner1 = new Scanner(System.in);
			String sc1 = scanner1.nextLine();

			System.out.println("Enter Your name");
			Scanner scanner2 = new Scanner(System.in);
			String sc2 = scanner2.nextLine();

//		int ii=0;	
//			int j;

//		System.out.println("Love Percentage:  "+sc1.compareTo(sc2));

			if (sc1.toString().trim().length()!= 0 && sc2.toString().trim().length()!= 0) {

			int	j = sc1.compareToIgnoreCase(sc2);


//			System.out.println(j);

				if (j <= 0) {

					j = -j;
					System.out.println(j);

				}
				System.out.println(j);

				if (j >= 0 && j < 10) {

					int percentage1 = j * 100 / total1;

					System.out.println("Love Percentage:  " + percentage1 + " %");
//					break;

				} else if (j >= 10 && j < 20) {

					int percentage2 = j * 100 / total2;

					System.out.println("Love Percentage:  " + percentage2 + " %");

				} else if (j >= 20 && j < 30) {

					int percentage3 = j * 100 / total3;

					System.out.println("Love Percentage:  " + percentage3 + " %");

				} else if (j >= 30 && j < 40) {

					int percentage4 = j * 100 / total4;

					System.out.println("Love Percentage:  " + percentage4 + " %");
				} else if (j >= 40 && j < 50) {

					int percentage5 = j * 100 / total5;

					System.out.println("Love Percentage:  " + percentage5 + " %");

				} else {
					System.out.println("!!Love error!!  " + j + " %");
				}
			}else {
				System.out.println("Enter names/values in both the fields ");
			}
		}
	}
}
