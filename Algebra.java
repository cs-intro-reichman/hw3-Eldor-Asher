// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(100,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(25));
		//System.out.println(sqrt(263169));
   		//System.out.println(sqrt(76123));
	}  
	public static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return negate(x);
        }
    }

    
    public static int negate(int x) {
        int negX = 0;
        int x_abs = abs(x);
        
        if (x >= 0) {
           
            for (int i = 0; i < x_abs; i++) {
                negX--;
            }
        } else {
            
            for (int i = 0; i < x_abs; i++) {
                negX++;
            }
        }
        return negX;
    }
	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if (x2 >0)
		{
			for (int i= 0; i< x2; i++)
			{
				x1++;
			}
		}
		else 
		{
			for	(int i=0; i>x2; i--)
			{
				x1--;
			}
			
		}
		
			return x1;
		}
		

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		
		for (int i= 0; i< x2; i++)
		{
			x1--;
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int sum = x1;
		for (int i=1; i<x2; i++)
		{
			sum = plus(sum, x1);
		}
		return sum;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int times = x;
		for (int i=1; i<n; i++)
		{
			times = times(times, x);
		}
		return times;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int counter = 0;
		int delta = x1;
		while (delta >= x2)
		{
			if (minus(delta, x2) >= 0)
			{

				delta = minus(delta, x2);
				counter++;
			}
			
		}
		return counter;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {

		return minus(x1, times(x2, div(x1, x2)));
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		if (x == 0 || x == 1)
        return x;

    	int index = div(x, 2);
    	int prev = 0;

    	while (index != prev) {
        	prev = index;
        	index = div(plus(index, div(x, index)), 2);  
		}
    	if (times(index, index) > x) {
        	index = minus(index, 1);
   		}

    	return index;
		
		
	}	  	  
}