import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int  n = scanner.nextInt();

        for(int i=n; i>=1 ; i--){
            for( int j=i; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        scanner.close();
    }
}
