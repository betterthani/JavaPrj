package thread_;

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
		
		// 스레드 만들기
		Thread t1 = new Thread(new MyRunnable());
		t1.start();// main, t1 2개 스레드 실행됨
	
		// 스레드 만들기 2 - 바로 구현해도됨.
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0 ; i < 10; i++) {
					System.out.println("********************");
					 // block pool로 감 -> 자다가 안 돌아올 경우에 lock플래그 반납을 못할 수도 있기 떄문에  
					try {Thread.sleep(1000);} catch (InterruptedException e) { } // interruptedException or Exception 예외처리를 해줘야한다.
				}
			}
		});
		t2.start();
		
		MyThread t3 = new MyThread();
		t3.start();
		
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("1234567890");
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("---------------------");
			try {Thread.sleep(1000);} catch (InterruptedException e) { }
		}
	}
}


