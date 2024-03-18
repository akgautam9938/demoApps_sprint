package tyestNG;

import org.testng.annotations.Test;

public class SearchSameProductForMultipletimes {
	@Test(priority =1)
	public void login()
	{
		System.out.println("User is logged in");
	}
	
	@Test(priority =2, invocationCount = 5)    // this test case runs 5 times
	public void searchProduct()
	{
		
		System.out.println("User is able to search the the product and product is displayed");
	}
	
	@Test(priority =3, dependsOnMethods = "searchProduct")
	public void addToCart()
	{
		System.out.println("User is able to add the product into cart");
	}
	
	@Test(priority =4, dependsOnMethods = "addToCart")
	public void pyament()
	{
		System.out.println("Payment is done");
		
	}
	
	@Test(priority =5, dependsOnMethods = "login")
	public void logout()
	{
		
		System.out.println("User is logout");
	}

}
