package Day42;

import org.testng.annotations.Test;

/*
 * paymentinrupees - sanity
paymentindollar - sanity  & regression
paymentReturnbyBank  - regression

 */
public class PaymentTest {
	@Test(priority=1, groups= {"sanity"})
	void paymentinrupees()
	{
		System.out.println("This is paymentinrupees");
	}
	@Test(priority=2, groups= {"sanity","regression"})
	void paymentindollar()
	
	{
		System.out.println("This is paymentindollar");
	}
	@Test(priority=3, groups= {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("This is paymentReturnbyBank");
	}
}
