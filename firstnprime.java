import java.util.Scanner;



class PrimeNumberDemo
{
   public static void main(String args[])
   {
      int n;
      int flag = 1;
      int num = 3;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      n = scanner.nextInt();
      if (n >= 1)
      {
         System.out.println("First "+n+" prime numbers are:");
         System.out.println(2);
      }

      for ( int i = 2 ; i <=n ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               flag = 0;
               break;
            }
         }
         if ( flag != 0 )
         {
            System.out.println(num);
            i++;
         }
         flag = 1;
         num++;
      }  
      
      scanner.close();
   }
}