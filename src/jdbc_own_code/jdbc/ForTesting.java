package com.app.jdbc;

import com.app.probean.TCSRegistation;

	public class ForTesting {
	public static void main(String[] args) {
		
						//save 
		TCSRegistation registation=new TCSRegistation();
		registation.setTCSRegistationcoladdress("GZB");
		registation.setTCSRegistationcoladhar("956082203512");
		registation.setTCSRegistationcoldob("");
		registation.setTCSRegistationcolEduction("MCA");
		registation.setTCSRegistationcolemail("ashu@gmail.com");
		registation.setTCSRegistationcolemployeeid("A10");
		registation.setTCSRegistationcolfname("Ashutosh");
		registation.setTCSRegistationcolname("mishra");
		registation.setTCSRegistationcolmobile("9560822035");
		registation.setTCSRegistationcolpancard("24354361512");
		registation.setTCSRegistationcolpassword("admin");
		registation.setTCSRegistationcolrepassword("admin");
		FiveStep.save(registation);
		
		/*TCSRegistation registation2=new TCSRegistation();
		registation2.setTCSRegistationcolemployeeid("A10");*/
		//FiveStep.delete(registation2);
	}
	}
