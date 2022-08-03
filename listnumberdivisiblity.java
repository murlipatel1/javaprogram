import java.util.Scanner;

public class listnumberdivisiblity {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two number for range");
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        System.out.println(" enter two number which is to checked for divisibility");

        int m1= sc.nextInt();
        int m2= sc.nextInt();

        System.out.println("the numbers are");
        for(int i=n1 ; i<=n2; i++){
            if(n1%m1==0 && n1%m2==0){
                System.out.println(i);
            }
        }

        sc.close();
        
    }
}
