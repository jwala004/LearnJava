package app.printcharacter;

public class Print_M_Method_2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
			
				if(i==1 && j==2 || i== 1 && j== 3) {
				
					System.out.print("  ");// double space there
				
				}else if(i==2 && j==2 ) {
					System.out.print("M ");// double space there
					
				}else if(i==2 && j==2 || i==3 && j==2 ) {
					System.out.print("  ");// double space there
					
				}else if(i==3 && j==2 || i== 3 && j== 3) {
					System.out.print("  ");// double space there
					
				}else if(i==4 && j==2 || i== 4 && j== 3) {
					System.out.print("  ");// double space there
					
				}else {
					System.out.print("M ");
				}
			}
			System.out.println();

		}
	}
}
