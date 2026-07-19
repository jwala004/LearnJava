package app.array;

public class Array_Examle {
	public static void main(String[] args) {
	int a[]=new int[4];
	a[0]=1;
	a[1]=11;
	a[2]=12;
	a[3]=13;
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
	
}
for (int i1 : a) {
	System.out.println(i1);
	
}
	//System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
	
	}
}

/*int []a= {1,2,4,6,5,88};
System.out.println(a[1]);*/