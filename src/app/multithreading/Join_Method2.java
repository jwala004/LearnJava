package app.multithreading;

public class Join_Method2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print(Thread.currentThread().getName()+"["+i+"]"+"  ");
			/*try {
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println(e);
			}*/
		}
	}
public static void main(String[] args) {
	
	System.out.print(Thread.currentThread().getName());
	
	Join_Method2 sleep1=new Join_Method2();
	sleep1.start();
	sleep1.setName("T1");
	
	Join_Method2 sleep2=new Join_Method2();
	sleep2.start();
	sleep2.setName("T2");
	try {
		sleep2.join();
		}catch (InterruptedException e) {
			System.out.println(e);
		}	
	Join_Method2 sleep3=new Join_Method2();
	sleep3.start();
	sleep3.setName("T3");
	
	Join_Method2 sleep4=new Join_Method2();
	sleep4.start();
	sleep4.setName("T4");
	
	
	Join_Method2 join2=new Join_Method2();
}
}
