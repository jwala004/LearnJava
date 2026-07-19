package app.multithreading;

public class Sleep2 extends Thread{
		
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				try {
				Thread.sleep(1000);
				}catch (InterruptedException exception) {
					System.out.println(exception);
				}
			System.out.println(i);	
			}
		}
	public static void main(String[] args) {
		Sleep2 sleep1=new Sleep2();
		sleep1.start();
		Sleep2 sleep2=new Sleep2();
		sleep2.start();
		Sleep2 sleep3=new Sleep2();
		sleep3.start();
		
	}
	}
