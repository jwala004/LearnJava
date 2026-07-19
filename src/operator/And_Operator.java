package operator;

public class And_Operator {

	public static void main(String[] args) {
		int a = 4;
		int b = -5;
		System.out.println(4 & -5);//0
		System.out.println(4 & (-5));//0
		System.out.println(-4 & (-5));//-8
		System.out.println(a & b);//0
	}

}
