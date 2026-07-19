package app.hemendra;

public class Loop {

	public static void main(String[] args) {
	int[] a= {1,1,1,1,0,22,33,112,2,1212,5};
	for (int i = 0; ; i++) {
		if(a[i]==0) {
			System.out.println(i);
			break;
		}
	}

	
	}

}
