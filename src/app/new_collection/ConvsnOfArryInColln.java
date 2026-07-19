package app.new_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvsnOfArryInColln {

	public static void main(String[] args) {
	
		Integer[] a={11,12,13,14,15};
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		System.out.print("{");
		for(Integer i: list) {
		System.out.print(i+" ");
		}
		System.out.print("}");
	}

}
/*String[] a={"aa","bb","cc","dd"};
ArrayList<String> list=new ArrayList<String>(Arrays.asList(a));
list.add("111");
list.add("ee");
list.add("ef");
list.add("eg");
list.add("eh");
*/
//System.out.println("["+i+"]");