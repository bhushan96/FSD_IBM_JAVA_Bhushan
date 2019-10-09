import java.io.IOException;

class Timer extends Thread {
	
	@Override
	public void run() {
		
			for(int i=0;;){
			try {
				Thread.currentThread().sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie );
			}
			System.out.print(++i);
			
			System.out.print("\r");
		}
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Timer timer=new Timer();
		timer.start();
		
		

	}

}
