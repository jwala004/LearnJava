package app.multithreading;

public class Join_Method extends Thread{
	/* 
	if u will run the o/p by putting the join method on thread 1st thread(1st user defined thred),
	then u will get correct o/p.Other than 1st thred, 
	if u will put join on any other thred than, 
	u will get unexpected o/p.
	No idea how? and why?
	ask some expert??
	
	*/
	
	/*
	Sleep() method  is not working other than 1st user deined thred and main thread
	How to give sleep/pause to some particular thead other than 1st user defined thread and main thread 
	If u r giving sleep before main method(i.e just after extending the thread class, then it is working for 1st user defined thread)
	and for main method if u r decalaring the sleep anywhere in the main body then it is working for main.
	so, how to give pause to some particular thread/or targeted thread??????
	
	*/
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
		System.out.print(Thread.currentThread().getName()+"["+i+"]"+"  ");
		/*try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}*/
		}
	}
public static void main(String[] args) {
	
	Join_Method sleep1=new Join_Method();
	sleep1.start();
	sleep1.setName("T1");
/*try {
		sleep1.join();
		}catch (InterruptedException e) {
			System.out.println(e);
		}*/
	Join_Method sleep2=new Join_Method();
	sleep2.start();
	sleep2.setName("T2");
	
	Join_Method sleep3=new Join_Method();
	sleep3.start();
	sleep3.setName("T3");
	
	for (int i = 0; i < 3; i++) {     // this logic is for main thread or main method
		System.out.print(" main thread  "); // ;;  ;;   ;;  ;;
	
	/*
	try {
		sleep2.join();
		sleep3.join();
	} catch (InterruptedException e) {	
		*/
}
}
}
