
public class TestThreads extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
System.out.println("running");	
}

	public static void main(String[] args) {
		TestThreads t1= new TestThreads();
		t1.start();
		t1.start();
		System.out.println(t1.getName());

		
	}
}
