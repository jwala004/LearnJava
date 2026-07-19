package app.string;

public class Frequency_of_Character_IN_a_STRING_4 {

	public static int countCharacter(String ss, char cc) {
		int count = 0;
		int index = 0;

		while (index < ss.length()) {
			if (ss.charAt(index) == cc) {
				count++;
			}
			index++;
		}
		return count;
	}

	public static void main(String[] args) {
		
//		System.out.println(Frequency_of_Character_IN_a_STRING_4.countCharacter("ABRAKADABRA",'A' ));
		
		System.out.println("Frequency of "+'A'+" in "+"ABRAKADABRA"+" is "+ Frequency_of_Character_IN_a_STRING_4.countCharacter("ABRAKADABRA",'A' ));
	}
}