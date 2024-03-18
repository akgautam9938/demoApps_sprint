package tyestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchDiffrentProductForMultipletimes {
	@Test(dataProvider = "data")    // this test case runs 5 times
	public void addToCart(String productId, String productName, int QTY)
	{
		System.out.println("Product Id is:"+productId+"Product name is:"+productName+"Quantity"+QTY);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] arr = new Object[5][3];
		
		//product id
		arr[0][0]="F001";
		arr[1][0]="F002";
		arr[2][0]="F003";
		arr[3][0]="F004";
		arr[4][0]="F005";
		
		//product name
		arr[0][1]="Iphone";
		arr[1][1]="TV";
		arr[2][1]="Laptop";
		arr[3][1]="Bluethoot Speaker";
		arr[4][1]="Washing machine";
		
		
		//quantity
		arr[0][2]=05;
		arr[1][2]=04;
		arr[2][2]=100;
		arr[3][2]=9;
		arr[4][2]=15;
		
		return arr;
		
	}

}
