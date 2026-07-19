package app.calculator;

import java.util.Scanner; //Scanner class for taking input from user
import java.time.LocalDateTime; //Library file for time and date from system

//public class AgeCalci {
//
//}

class AgeCalci    
{	int udate,umonth,day,i,uyear;
	Scanner sc=new Scanner(System.in);                
    String str=new String();   
	
	//this class is used to take dob from user and validate dob
	public int getdob()
	{
		System.out.println("Enter date of birth in dd-mm-yyyy format");
								str=sc.nextLine(); 
								if(str.length()==10 && str.charAt(2)=='-' && str.charAt(5)=='-')					
								  {
									  udate=Integer.valueOf(str.substring(0,2));
									  umonth=Integer.valueOf(str.substring(3,5));
									  uyear=Integer.valueOf(str.substring(6,10)); 
									  
									  switch(umonth)
										{
											case 1:case 3: case 5: case 7: case 8: case 10:case 12:day=31;break;
											case 4:case 6: case 9:case 11:day=30;break;
											case 2:
											if(uyear%4==0)
											day=29;
											else
											day=28; 
										}
									  if(udate>day || umonth>12){i=0;}
									  else i=1;
								  }
								else 
								 i=0;
			return i;
	}
	
  //below methods are use to transfer data into main function for processing
	public int givedate()
	{
		return udate;
	}
	public int givemonth()
	{
		return umonth;
	}
	public int giveyear()
	{
		return uyear;
	}
	public int giveday()
	{
		return day;
	}
//}
	
//
//class main
//{
	
	
    public static void main(String args[])
    {   AgeCalci user=new AgeCalci();
        LocalDateTime obj=LocalDateTime.now();
        Scanner sc=new Scanner(System.in);                
        int date,month,year; //variables that store data from system 
        int udate,umonth,uyear; //variables that store data from user
        int adate,amonth,ayear;  //variables that store age444                              
        int day=0; //use to count no. of days in month 
        int i=0;
        
        //date,month,year form system
        date=obj.getDayOfMonth();        
        month=obj.getMonthValue();
        year=obj.getYear();
       
       //taking input from user 
          i=user.getdob();
		  
		  
		  while(i!=1)
		  {   System.out.println("Entered data is not valid  ple9ase enter again ");
			  i=user.getdob();
		  }
		  
			udate=user.givedate();
			umonth=user.givemonth();
			uyear=user.giveyear();
			day=user.giveday();
		  
         //calculating age         
          ayear=year-uyear-1;
          amonth=12-(umonth-month)-1;
          adate=day-udate+date;
        if(adate>=day)
            {
                adate=adate-day;            
                amonth=amonth+1;
            }  
        if(amonth>=12)
           {
                amonth=amonth-12;
                ayear=ayear+1;
            }
            
          
              
        System.out.println("age: "+ayear+" year "+amonth+" month "+adate+" day");
        if(adate==0 && amonth==0)
        System.out.println("Happy Birthday Dear");
        
    }
}