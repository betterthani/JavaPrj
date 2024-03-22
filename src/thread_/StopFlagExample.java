package thread_;

public class StopFlagExample {
	public static void main(String[] args) {
		
		PrintThread1 pringThread = new PrintThread1();
		pringThread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) { }
		
		pringThread.setStop(true); // 스레드를 종료하기 위해 stop필드를 true로 변경
	}
}
