package number;

public class Generate_Multiplication_TABLE {
	public static void main(String[] args) {

//		M-4 (Using while loop)
		int num = 6;
		int i = 1;
		while (i <= 10) {

			int numM = num * i;
			System.out.println(num + "*" + i + " " + numM);
			i++;
		}
	}
}

/*
 * // M-1 int num = 5; for (int i = 1; i <= 10; i++) {
 * 
 * System.out.println(num + "*" + i + "= " + num * i); }
 */

/*
 * //M-2 int num = 5; for (int i = 1; i <= 10; i++) { int numM=num * i;
 * System.out.println(num + "*" + i + "= "+numM); } } }
 */

/*
 * //M-3(my own method) public static void main(String[] args) {
 * 
 * int i, j; for (i = 5, j = 1; i <= 50 && j <= 10; i += 5, j++) {
 * System.out.println("5 * " + j + " is " + i);
 * 
 * } } }
 */
