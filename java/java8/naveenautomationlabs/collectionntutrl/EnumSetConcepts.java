package java8.naveenautomationlabs.collectionntutrl;

import java.util.EnumSet;

public class EnumSetConcepts {

	enum LangClass{
		JAVA,
		CPLUSPLUS,
		PYTHON,
		C,
		JAVASCRIPT
	}
	
	public static void main(String[] args) {

//		Creating a new EnumSet using enum
		EnumSet<LangClass> langs = EnumSet.allOf(LangClass.class);
		System.out.println(langs);
		
//		Empty enum sets
		EnumSet<LangClass> l = EnumSet.noneOf(LangClass.class);
		System.out.println(l);
		
//		Range (x to y)
		EnumSet<LangClass> enumRange = EnumSet.range(LangClass.JAVA, LangClass.PYTHON );
		System.out.println(enumRange);
		
		
		
	}

}
