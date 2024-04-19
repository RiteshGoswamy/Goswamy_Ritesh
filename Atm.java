package practise;

public abstract class Atm {
	
	public void welcomeNote() {
		System.out.println("Hello, Welcome to Online Bank");
	}
	
	public void changePassword(String oldpassword) {
		
		System.out.println("Password changed successfully");
	}
	
	public abstract void balanceCheck();
	public abstract void withDraw(double amount);
	

}
