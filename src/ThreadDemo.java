 
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<=10; i++){
			System.out.println("main Thread");
			t.sleep(500);
		}

	}

}
class MyThread extends Thread{
	@Override
	public void run() {
		MyThread t1 = new MyThread();
		for(int i=0;i<=10; i++){
			System.out.println("child Thread");
			try {
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	}