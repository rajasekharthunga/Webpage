package bankAccount;

public class Bank {
	
//	public void setAmount(float amount) {
//		this.amount = amount;
//	}

	float amount = 1000;
	
//	public float getAmount() {
//		return this.amount;
//	}
	
	public synchronized void  deposit(float add){
		amount += add ;
		System.out.println("After deposit"+ amount);
	}
	
	public synchronized void withDraw(float sub) {
		amount -= sub;
		System.out.println("After withDraw :" + amount);
	}
	
}
	
