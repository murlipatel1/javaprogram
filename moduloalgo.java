
public class moduloalgo {

	public static void main(String[] args) {
		System.out.println(factorial(12));
	}
	static long factorial(int n)
	{
	 long start = System.currentTimeMillis();
		long M = 1000000007;
		long f = 1;

		for (int i = 1; i <= n; i++)
			f = f * i; // WRONG APPROACH as
						// f may exceed (2^64 - 1)
		System.out.println(start);
		return f % M;
	}

	// This code is contributed by rutvik_56.


}
