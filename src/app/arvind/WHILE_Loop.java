package app.arvind;

public class WHILE_Loop {

	public static void main(String[] args) {
		int i = 0, j = 2;
		do {
			i = ++i;
			j--;
//System.out.println("i values: "+i);
		} while (j > 0);
//System.out.println("final value of i"+i);
		System.out.println(+i);
	}

}
