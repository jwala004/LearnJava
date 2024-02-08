
public class AirtelIntervw {

//	Input: Jwala Loves Programming
//	Output: awalJ  soveL grogramminP

	public static void main(String[] args) {

		String str = "Jwala Loves Programming";

		String newStr = null, toReverse = "";

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {

			newStr = i + "";

			for (int j = newStr.length() - 1; j >= 0 ; j--) {
				
				toReverse = toReverse + newStr.charAt(j);
				
			}

		}

	}

}
