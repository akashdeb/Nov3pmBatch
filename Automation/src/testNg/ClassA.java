package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test(groups = "smoke")
	public void login() {
		System.out.println("Logged in succesfully");
	}
	
	@Test (groups = "regression")
	public void search() {
		System.out.println("Product found");
	}
	
	@Test(groups = "regression")
	public void select() {
		Assert.fail();
		System.out.println("Product has been selected");
	}
	
	@Test(groups = "regression")
	public void addToCart() {
		System.out.println("Product Added");
	}
	
	

}
