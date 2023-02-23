import java.util.HashSet;

// This code is contributed by Vansh Sodhi.
// Java program to check if a number is a Happy number or not.

class Hack1 {

    static boolean isHappyNumber(int n) {
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            n = numSquareSum(n);
            if (n == 1)
                return true;
            if (st.contains(n))
                return false;
            st.add(n);
        }
    }
	static int numSquareSum(int n)
    {
        int squareSum = 0;
        while (n!= 0)
        {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }
  
//  method return true if n is Happy number
    // static boolean isHappynumber(int n)
    // {
    //     int slow, fast;
    
    //     //  initialize slow and fast by n
    //     slow = fast = n;
    //     do
    //     {
    //         //  move slow number
    //         // by one iteration
    //         slow = numSquareSum(slow);
    
    //         //  move fast number
    //         // by two iteration
    //         fast = numSquareSum(numSquareSum(fast));
    
    //     }
    //     while (slow != fast);
    
    //     //  if both number meet at 1,
    //     // then return true
    //     return (slow == 1);
    // }

	// Driver code
	public static void main(String[] args)
	{
	int n = 3;
	if (isHappyNumber(n))
		System.out.println(n +
		" is a Happy number");
	else
		System.out.println(n +
		" is not a Happy number");
}
}
