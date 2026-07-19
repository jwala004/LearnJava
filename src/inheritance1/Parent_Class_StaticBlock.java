package coom.app.inheritance1;


class AB{
	{
		System.out.println("Parent class Instance Block");
	}
	static{
		System.out.println("Parent class Static Block");
	}
	public AB(){
		System.out.println("Parent class Constructor");
	}
}
public class Parent_Class_StaticBlock extends AB {

	{
		System.out.println("Child class Instance Block");
	}
	static{
		System.out.println("Child class Static Block");
	}
	public Parent_Class_StaticBlock() {
		System.out.println("Child class Constructor");
	}
	public static void main(String[] args) {

		new Parent_Class_StaticBlock();//nameless object creation
		
		
	}

}
