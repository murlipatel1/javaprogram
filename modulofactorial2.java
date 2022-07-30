
public class modulofactorial2 {
		public static void main(String args[]) {
			System.out.println(factorial(12));
		}
		
		static long factorial(int n)
		{
			long start = System.currentTimeMillis();
			long M = 1000000007;

			long f = 1;
			for (int i = 1; i <= n; i++)
				f = (f*i) % M; // Now f never can
					// exceed 10^9+7
			System.out.println(start);
			return f;
		}

		// This code is contributed by Dharanendra L V.

}
