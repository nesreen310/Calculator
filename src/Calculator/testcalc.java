package Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;


public class testcalc {

	@Test
	public void testAdd() {
		
		Operations op= new Operations();
		int num1 = 3;
	  	int num2 = 2;
	  	int total = 5;
	  	int sum = 0;
	  	sum = op.add(num1, num2);
	  	Assert.assertEquals(sum, total);	
	}
	@Test
	public void testMultiply() {
		Operations op= new Operations();
		int num1 = 3;
	  	int num2 = 2;
	  	int total = 6;
	  	int sum = 0;
	  	sum = op.multiply(num1, num2);
	  	Assert.assertEquals(sum, total);	
	}
	
	@Test
	public void testSubStract() {
		Operations op= new Operations();
		int num1 = 3;
	  	int num2 = 2;
	  	int total = 1;
	  	int sum = 0;
	  	sum = op.substract(num1, num2);
	  	Assert.assertEquals(sum, total);
		
}
	@Test
	public void testDivide() {
		Operations op= new Operations();
		int num1 = 4;
	  	int num2 = 2;
	  	int total = 2;
	  	int sum = 0;
	  	sum = op.divide(num1, num2);
	  	Assert.assertEquals(sum, total);
		
}
}
