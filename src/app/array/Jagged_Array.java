package app.array;

public class Jagged_Array {
	public static void main(String[] args) {
		int[][] a= new int[3][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[2];
		for(int i=0;i<=3;i++) {
			for (int j = 0; j < 4; j++) {
				
					System.out.println(" null");
				
				System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}


