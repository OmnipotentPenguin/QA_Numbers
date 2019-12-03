package main;

public class Numbers {
	
	public static int addNumbers(int input) {
		int output = 0;
		String strInput = String.format("%s",input);
		String[] parts = strInput.split("");
		for (String part : parts) {
			output += Integer.parseInt(part);
		}
		return output;		
	}
}

/*
 * Create a method that takes a number 10-99, and adds the two digits 
together

 E.G: 74 = 7 + 4 = 11

2.	Create a second method that when given the number 1 – 99 returns 
	a String representation of this number.

For example: 1 = one, 11 = eleven, 21 = twenty-one

3.	As above but 1-999.

4.	As above, but 1-9999.
*/
