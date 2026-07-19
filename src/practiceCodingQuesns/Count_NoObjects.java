package com.app.practiceCodingQuesns;

public class Count_NoObjects {
	
	static int i=0;
	public Count_NoObjects() {
		i++;
	}
	public static void main(String[] args) {
		Count_NoObjects a=new Count_NoObjects();
		Count_NoObjects b=new Count_NoObjects();
		Count_NoObjects c=new Count_NoObjects();
		Count_NoObjects d=new Count_NoObjects();
		Count_NoObjects e=new Count_NoObjects();
		System.out.println(Count_NoObjects.i);
	
	}
		
}
