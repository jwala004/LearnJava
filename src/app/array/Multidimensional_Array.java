package app.array;

public class Multidimensional_Array {
public static void main(String[] args) {
	int a[][]= {{1,2,3,4,2},{2,3,1,4,2},{1,2,3,4,2},{1,2,3,8,7}};
	//1st bracket is for row and 2nd bracket is for column
	
	/*for (int i = 0; i <4; i++) {
	for (int j = 0; j <=4; j++) {*/
	for (int i = 0; i <a.length; i++) {
	for (int j = 0; j <=a.length; j++) {
	
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
}
}
/*System.out.println(a[0][2]);
System.out.println(a[0][0]);
System.out.println(a[1][1]);
System.out.println(a[1][3]);
System.out.println(a[1][4]);
System.out.println(a[1][2]);
System.out.println(a[2][2]);*/

/*int a[][]= {{1,2,3,4,2},{2,3,1,4,2}
for (int i = 0; i <2; i++) {
	for (int j = 0; j <=2; j++) {
}*/