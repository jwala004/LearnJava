package java8.naveenautomationlabs.interviewquestions;

public class DuplicateElements {

	public static void main(String[] args) {

		String[] arr = { "Java", "Python", "Python", "Java", "Java", "Javascript", "Java", "Javascript", "Javascript",
				"Ruby", "C" };

//		M1: using Brute-force
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
				break; // using break will print the duplicate values only once, otherwise it will be printed based on occurance
			}
		}
		
//		M2: using HashSet 
		

	}

}
