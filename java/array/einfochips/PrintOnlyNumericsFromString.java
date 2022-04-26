package array.einfochips;

public class PrintOnlyNumericsFromString {

	public static void main(String[] args) {


		String str = "a1b2c3d5e7r7t6r9";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) >= 'a' || str.charAt(i) <= 'z' ) {
				
			}else {
				System.out.print(str.charAt(i));
			}
		}

	}

}
