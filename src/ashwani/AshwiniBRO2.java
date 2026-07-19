package ashwani;

public class AshwiniBRO2 {

	static {
		System.out.println("static block 1");
	}

	static {
		System.out.println("static block 2");
	}

//{
//	System.out.println(" block 1");
//}
//
// {
//	System.out.println(" block 2");
//}

// if u will declare instance block inside class, then as many times object will be created,
//as many time instance block will execute.
//But In case if it is declared inside main method, even if u don't create the object, instance block will
// execute once. ( Reason behind is, inside main method instance block will be treated as static block)
	public static void main(String[] args) {
//		 AshwiniBRO2 ashwiniBRO2= new AshwiniBRO2();

//		 AshwiniBRO2 ashwiniBRO22= new AshwiniBRO2();
		int b = 3;
		System.out.println("gggggggg");

//	static{
//			 int a=19;
//			System.out.println(" block 1"+a);
//		}

		{
			int a = 19;
			System.out.println(" block 1" + a);
		}
		{
			System.out.println(" block 2  " + b);
		}
	}
}
