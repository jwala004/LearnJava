package app.printcharacter;

public class Print_O {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
			
				if(i==1 && j==1 || i== 4 && j== 1) {
				
					System.out.print("  ");// double space there
				
				}else if(i==2 && j==2 || i== 2 && j== 3 || i== 3 && j== 2 || i== 3 && j== 3 ) {
					System.out.print("  ");// double space there
					
				}else if(i==1 && j==4 || i== 4 && j== 4 ) {
//					System.out.print("  ");// double space there
					
				}else {
					System.out.print("O ");
				}
			}
			System.out.println();

		}
	}
}
