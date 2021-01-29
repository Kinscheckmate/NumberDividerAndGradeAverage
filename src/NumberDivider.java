import java.util.Arrays;

/***
A positive integer is called a number divider if every decimal digit of
the number is a divisor of the number.  That is, if the number is evenly
divisible by each one of its digits.  For example, 128 is a number divider
because it is evenly divisible by 1, 2 and 8.  However, 26 is not a number
divider because if is not evenly divisible by 6.  Note that 0 is not
considered to be a divisor of any number, so any number containing a 0 
digit is NOT a number divider.  
***/
public class NumberDivider {
	/** @param number the number to be tested
	*		Precondition: number >0
	* 	@return true if every decimal digit of number divides evenly
	*		into the number, false otherwise
	*/
	public static boolean isNumberDivider(int number)
	{
		int temp = number;
		while (1 < temp)
		{
			if (temp % 10 == 0 || number % (temp % 10) != 0)
			{
				return false;
			}
			temp /= 10;
		}
		return true;
	}
	
	/** @param start starting point for values to be checker
	*		Precondition: start >0
	*	@param x the size of the array to be returned
	*		Precondition: num > 0
	*	@return an array containing the first num integers >= start
	*		that are number dividers
	**/
	public static int [] firstXNumberDividers(int start, int x)
	{
		int [] a = new int[x];

		for(int i = 0; i < x; i++)
		{
			while (!isNumberDivider(start)) { start++; }
			a[i]= start;
			start++;
		}
		return a;
	}

	public static void main(String[] args) {
		
		int a = 128, b = 124, c= 26, d = 101, e = 1, f = 312;
		System.out.println("Is " + a + " a number divider? " + isNumberDivider(a));
		System.out.println("Is " + b + " a number divider? " + isNumberDivider(b));
		System.out.println("Is " + c + " a number divider? " + isNumberDivider(c));
		System.out.println("Is " + d + " a number divider? " + isNumberDivider(d));
		System.out.println("Is " + e + " a number divider? " + isNumberDivider(e));
		System.out.println("Is " + f + " a number divider? " + isNumberDivider(f));
		
		int [] divArr1 = firstXNumberDividers(128, 4);
		System.out.println(Arrays.toString(divArr1));
		int [] divArr2 = firstXNumberDividers(1024, 6);
		System.out.println(Arrays.toString(divArr2));
		int [] divArr3 = firstXNumberDividers(5, 6);
		System.out.println(Arrays.toString(divArr3));
		int [] divArr4 = firstXNumberDividers(24, 9);
		System.out.println(Arrays.toString(divArr4));
		int [] divArr5 = firstXNumberDividers(51, 5);
		System.out.println(Arrays.toString(divArr5));
		int [] divArr6 = firstXNumberDividers(144, 15);
		System.out.println(Arrays.toString(divArr6));
	}

}
