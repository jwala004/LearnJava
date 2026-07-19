package number;

//5) What is the value of the Postfix expression 4 5 7 2 + - *

//a) -16
//b) 4
//c) 5
//d) None of the given options

// Solution

//First put the postfix expression in simple form so that we can calculate easily.
//
//The operators will be used from backside, like this:
//
//4*(5-(7+2))
//
//After simplifying, we get
//
//4*(-4) =-16
//
//Thus, the value of the given postfix expression is -16.


public class Test {

	public static void main(String[] args) {

		int i = 4*(5-(7+2));

		System.out.println(i);
	}

}
