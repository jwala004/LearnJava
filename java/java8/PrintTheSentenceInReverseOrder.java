package java8;

public class PrintTheSentenceInReverseOrder {

	/*
	 * Consider a string “Hello Good Morning” it should print the sentence in
	 * reverse order output should be “Morning Good Hello”
	 * 
	 */
	public static void main(String[] args) {

		String str1 = "Hello Good Morning";

		PrintTheSentenceInReverseOrder.printSentenceReversed(str1);
	}

	private static void printSentenceReversed(String str) {

		String[] strArry = str.split(" ");

		for (int i = strArry.length - 1; i >= 0; i--) {

			System.out.print(strArry[i] + " ");

		}

	}

}
