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
	
	public static int sayNumbers(int input) {
		int output = 0;
		String strInput = String.format("%s",input);
		String[] parts = strInput.split("");
		
		int position = parts.length-1;
		for (String part : parts) {
			if (position > 3) {
				System.out.println("Number beyond 9999");
			} else if (position == 3) {
				
				switch(Integer.parseInt(part)) {

				case 0:
					System.out.println("");
					break;
				case 1:
					System.out.println("One Thousand");
					break;
				case 2:
					System.out.println("Two Thousand");
					break;
				case 3:
					System.out.println("Three Thousand");
					break;
				case 4:
					System.out.println("Four Thousand");
					break;
				case 5:
					System.out.println("Five Thousand");
					break;
				case 6:
					System.out.println("Six Thousand");
					break;
				case 7:
					System.out.println("Seven Thousand");
					break;
				case 8:
					System.out.println("Eight Thousand");
					break;
				case 9:
					System.out.println("Nine Thousand");
					break;
				}
				
			}else if (position == 2) {
				
				switch(Integer.parseInt(part)) {

				case 0:
					System.out.println("");
					break;
				case 1:
					System.out.println("One Hundred");
					break;
				case 2:
					System.out.println("Two Hundred");
					break;
				case 3:
					System.out.println("Three Hundred");
					break;
				case 4:
					System.out.println("Four Hundred");
					break;
				case 5:
					System.out.println("Five Hundred");
					break;
				case 6:
					System.out.println("Six Hundred");
					break;
				case 7:
					System.out.println("Seven Hundred");
					break;
				case 8:
					System.out.println("Eight Hundred");
					break;
				case 9:
					System.out.println("Nine Hundred");
					break;
				}
				
			}else if (position == 1) {
				
				switch(Integer.parseInt(part)) {

				case 0:
					System.out.println("And");
					break;
				case 1:
					System.out.println("Onety");
					break;
				case 2:
					System.out.println("Twenty");
					break;
				case 3:
					System.out.println("Thirty");
					break;
				case 4:
					System.out.println("Fourty");
					break;
				case 5:
					System.out.println("Fifty");
					break;
				case 6:
					System.out.println("Sixty");
					break;
				case 7:
					System.out.println("Seventy");
					break;
				case 8:
					System.out.println("Eighty");
					break;
				case 9:
					System.out.println("Ninety");
					break;
				}
				
			}else if (position == 0) {
				
				switch(Integer.parseInt(part)) {

				case 0:
					System.out.println("");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				}
				
			} else {
				break;
			}
			
			position--;
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


