package testing;

import org.junit.Assert;
import org.junit.Test;

import main.Numbers;

public class NumbersTesting {

	@Test
	public void testNumberAdder() {
		int num1 = Numbers.addNumbers(2);
		int num2 = Numbers.addNumbers(25);
		int num3 = Numbers.addNumbers(257);
		
		Assert.assertEquals(2, num1);
		Assert.assertEquals(7, num2);
		Assert.assertEquals(14, num3);
	}

}
