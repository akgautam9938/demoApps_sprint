package tyestNG;

import org.testng.annotations.Test;

public class Group {
	
	
	
		@Test(priority = 1, groups="smoke")
		public void login()
		{
			System.out.println("User is logged in");
		}
		
		@Test(priority = 2,groups = "Regression")
		public void searchProduct()
		{
			System.out.println("User is able to search the the product and product is displayed");
		}
		
		@Test(priority = 3, dependsOnMethods = "searchProduct",groups = "Regression")
		public void addToCart()
		{
			System.out.println("User is able to add the product into cart");
		}
		
		@Test(priority = 4, dependsOnMethods = "addToCart",groups = "Regression")
		public void pyament()
		{
			System.out.println("Payment is done");
			
		}
		
		@Test(priority = 5, dependsOnMethods = "login",groups = "smoke")
		public void logout()
		{
			System.out.println("User is logout");
		}

}
