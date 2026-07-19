package app.test;

import java.util.Arrays;
import java.util.Stack;

public class InfixToPostFix {
 
	// class InfixToPostFix
	boolean check_error=false;//check the first character is positive or negative, check error
	
	public String standardizeDouble(double num) {
		
		int a=(int)num;
		if(a==num)
			return Integer.toString(a);
		else
			return Double.toString(a);
		
	}

	public boolean isCharPi(char c) { // Pi char code is Alt+27
		
		if(c=='p')// inside char sign or single quote there would be pi symbol, // enter pi(either copy from somewhere or follow Alt +227 trick, find which one is works or working)
		
			return true;
		else return false;
	}
	
	public boolean isNumPi(Double num) {
		if(num==Math.PI) return true;
		else return false;
			
	}

	public boolean isNum(char c) {

		if(Character.isDigit(c) || isCharPi(c))
			
			return true;
		else return false;
		
	}
 
	public String numToString(double num) {
		
		if(isNumPi(num)) 
			return "pi";// write the symbol of p here;
		else return standardizeDouble(num);
	}

	public double stringToNum(String s) {
		
		if(isCharPi(s.charAt(0)))
			return Math.PI;
		else return Double.parseDouble(s);
		
	}

	public boolean isOperator(char c) {
		char operator[]= {'+','-','*','/','^','~','s','c','t','@','!','%',')','('};// ~ is instance of negative, @ is square root
		
		Arrays.sort(operator);
		if(Arrays.binarySearch(operator,c) > 1)
		
		return true;
		
		else return false;
	}
	
	public int priority(char c) {
		switch(c) {
		case '+': case '-' // check how he resolved the error later on
		return 1;
		case '*': case '/':
		return 2;
		case '~':
		return 3;
		
		case '@': case '!':case'^': return 4;
		case 's': case 'c':case't': return 5;
		default:
		return 0;
		
		}
	}

	public boolean isOneMath(char c) {

		char operator[] = {'s','c','t','@','('};
		Arrays.sort(operator);
		if(Arrays.binarySearch(operator,c) > -1)
			return true;
		else return false;
	}
	
	public String standardize(String s) {
		
		String s1="";
		s=s.trim();
		s=s.replace("\\s+", "");
		
		int open=0,close=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') open++;
			if(c== ')') close++;
		}
		for(int i=0;i<(open-close);i++) // auto append ")"
			s+=')';
		for(int i=0;i<s.length();i++) {
				
			if(i>0 && isOneMath(s.charAt(i)) && (s.charAt(i-1) ==')' || isNum(s.charAt(i-1))))
			s1+="*"; // fix..) (... to ...)*(...
			if((i==0 || (i>0 && !isNum(s.charAt(i-1)))) && s.charAt(i) =='-' && isNum(s.charAt(i+1)))
			s1+="~"; // check negative
			
			else if(i>0 && isNum(s.charAt(i-1)) || s.charAt(i-1)== ')'  && isCharPi(s.charAt(i)))
				s=s1+'*'+s.charAt(i); // Ex : 6/pi(symbol of pi),...) pi(symbol of pi) to 6*pi(symbol of pi)...)*pi
			else 
				s1=s1+s.charAt(i);
		}
		return s1;
	}
	
	public String[] processString(String sMath) {
		
		String s1="",elementMath[]=null;
		sMath=standardize(sMath);
		
		InfixToPostFix ITP= new InfixToPostFix();
		
		for(int i=0;i<sMath.length();i++) {
			char c= sMath.charAt(i);
			if(i<sMath.length()-1 && isCharPi(c) && !ITP.isOperator(sMath.charAt(i+1))) {
				
				check_error=true;
				return null;
			}else if(!ITP.isOperator(c))
				s1=s1+c;
			else s1=s1+" "+c+" ";
		}
		s1= s1.trim();
		s1= s1.replaceAll("\\s+", " ");
		elementMath=s1.split(" ");
		return elementMath;
		}
	
	public String[] postfix(String[] elementMath) {
		InfixToPostFix ITP= new InfixToPostFix();
		String s1="",E[];
		Stack<String> s=new Stack<String>();
		for(int i=0;i<elementMath.length;i++) {
			char c=elementMath[i].charAt(0); // c is first character of each element 
			if(!ITP.isOperator(c))        // if c is not operator
				s1=s1+elementMath[i]+ " "; // s1= element
			else {     // if c is operator
				if(c=='(') s.push(elementMath[i]);  // push c to stack
				else {
					if(c==')') { //else if c is ')'
					char c1;
					do {
						c1=s.peek().charAt(0); // c1 is first character in stack
						if(c1!='(')
						s1=s1+s.peek()+" ";
						s.pop();
					}while(c1!='(');
				}else {
//			Stack is not null and while element in stack have priority >= this element
					while(!s.isEmpty() && ITP.priority(s.peek().charAt(0)) >= ITP.priority(c))
						s1=s1+s.pop()+"";
					s.push(elementMath[i]); // push this element to Stack
				}
			}
		}
	}
//		if stack have remaining element then push all to s1;
	while(!s.isEmpty()) s1=s1+s.pop()+" ";
	E=s1.split(" ");
	return E;
}
	
	public String valueMath(String[] elementMath) {
		Stack<Double> s=new Stack<>();
		InfixToPostFix ITP= new InfixToPostFix();
		double num=0.0;
		for(int i=0;i<elementMath.length;i++) {
			char c=elementMath[i].charAt(0);
			
			if(isCharPi(c)) s.push(Math.PI);
			else {
				
			if(!ITP.isOperator(c)) s.push(Double.parseDouble(elementMath[i]));
			else {
				double num1=s.pop();
				switch(c) {
				case '~': num=-num1;break;
				case 's': num=Math.sin(num1);break;
				case 'c': num=Math.cos(num1);break;
				case 't': num=Math.tan(num1);break;
				case '%': num=num1/100;break;
				case '@':{
					if(num1 >=0) {
						num=Math.sqrt(num1);
					}else check_error=true;
				}
				case '!':{
					if(num1>0 && (int) num1==num1) {
						num=1;
						for(int j=1;j<=(int)num1;j++) {
							num*=j;
						}
					}
						else check_error=true;
					}
					default: break;
				}
				if(!s.empty()) {
					double num2=s.peek();
					switch(c) {
					case '+' : num=num2+num1;s.pop();break;
					case '-' : num=num2-num1;s.pop();break;
					case '*' : num=num2*num1;s.pop();break;
					case '/' : {
						if(num1 !=0) num=num2/num1;
						else check_error=true;
						s.pop();
					}
					break;
					case '^': num=Math.pow(num2, num1);s.pop();break;
					
					}
				}
				s.push(num);
				
				}
			}
		}
		return numToString(s.pop());
		}

	
	
	
	
	
	
	
	}
