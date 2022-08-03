import java.util.Scanner;

public class primeinfunction {
    static boolean isPrime(int n) {
        if (n == 1 || n == 0)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total prime number you want ");
        int M= sc.nextInt();
        System.out.println("Enter number till which we wnat ");
        int N = sc.nextInt();

        int count=0;
        for (int i = 1; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            if(count==M){
                break;
            }
        }
        sc.close();
    }
}