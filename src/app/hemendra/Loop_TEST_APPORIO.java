package app.hemendra;

public class Loop_TEST_APPORIO {

	public static void main(String[] args) {

		int j = 0;

		for (int i = 0; i < 10; i++) {

			j = j++ + j++;

			System.out.println(j);

		}
		System.out.println(j);

	}

}

//public class Loop_TEST_APPORIO {
//
//	public static void main(String[] args) {
//
//		int j = 0;
//
//		for (int i = 0; i < 10; i++) {
//
//			j = j++ ;
//
//			System.out.println(j);
//
//		}
//		System.out.println(j);
//
//	}
//
//}
