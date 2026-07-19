package app.array;

public class SwapTwoNumbers {

	int num1 = 10;
	int num2 = 20;
	
	int temp;
	
	public static void main(String[] args) {
		SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers();
				swapTwoNumbers.swapNumbers();
		
		System.out.print("Num1 value "+swapTwoNumbers.num1+" "+"Num2 value "+swapTwoNumbers.num2);
	}
	
	private void swapNumbers() {
		temp = num1;
		num1 = num2;
		num2 = temp;
	}

}
