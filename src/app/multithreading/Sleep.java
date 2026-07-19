package app.multithreading;

public class Sleep extends Thread{
		
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				//System.out.println(currentThread().getState()+"["+i+"]");
				//System.out.println(currentThread().getId().getState()+"["+i+"]");
				//System.out.println(currentThread()+"["+i+"]");
				//System.out.println(getId());
				//System.out.println(currentThread()+"["+i+"]");
				//System.out.println(currentThread().getId()+"["+i+"]");
				//System.out.println(currentThread().toString()+"["+i+"]");
				try {
					Thread.sleep(1000);
					}catch (InterruptedException exception) {
						System.out.println(exception);
					}
				System.out.println(i);	
				}
			}
	public static void main(String[] args) {
		Sleep sleep1=new Sleep();
		sleep1.start();
		//System.out.println(currentThread().getState());
		Sleep sleep2=new Sleep();
		sleep2.start();
		Sleep sleep3=new Sleep();
		sleep3.start();
	}
	}
