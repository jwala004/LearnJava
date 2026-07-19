package app.printcharacter;

public class Print_B {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 3; j++) {
			
				if(i==2 && j==2 || i==4 && j==2 ) {
				
					System.out.print("  ");// double space there
				
				}else if(i==1 && j==3 || i== 3 && j== 3 || i== 5 && j == 3 ) {
//					System.out.print("  ");// double space there
					
				}else {
					System.out.print("B ");
				}
			}
			System.out.println();

		}
	}
}
