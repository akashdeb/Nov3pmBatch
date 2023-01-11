package testNg;

import org.testng.annotations.Test;

public class Priority {
	
	//@Test annotated method
	@Test (priority = -3)
	public void ademo() {
		System.out.println("Demo Test a");	
	}
	
	@Test(priority = 2)
	public void Ademo() {
		System.out.println("Demo Test A");	
	}
	
	@Test (priority = 4)
	public void Bdemo() {
		System.out.println("Demo Test B");	
	}
	
	@Test(priority = 1)
	public void bdemo() {
		System.out.println("Demo Test b");	
	}
	


}
