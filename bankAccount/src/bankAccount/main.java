package bankAccount;

public class main {
	
	public static void main(String[] args) {
		Bank b = new Bank();
		
		Thread t1= new Thread() {
			
			public void run() {
				b.deposit(300);
				b.withDraw(50);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				b.deposit((float) 203.75);
				b.withDraw(100);
			}
		};
		
		
		t1.start();
		t2.start();
		
//		System.out.println(b.getAmount());
		
		
	}
}
