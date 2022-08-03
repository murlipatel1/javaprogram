import java.util.Scanner;

public class arrayminmax {
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] array= new int[n];

        for(int i=0 ;i<n ; i++ ){
            array[i]= sc.nextInt();
        }


        sc.close();
        
    }

    static void sum(int array[], int n){
        int sum=0;
        for(int i=0;i<n; i++){
            sum=sum+ array[i];
        }
        System.out.println("Sum " +sum);
    }

    static void product(int array[] , int n){
        int prod=1;
        for(int i=0;i<n; i++){
            prod=prod *array[i];
        }
        System.out.println("Product " +prod);
    }

    static void maxnum(int array[], int n){
        int max=array[0];
        for(int i=1 ; i<n ; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
    }

    static void minnum(int array[], int n){
        int min=array[0];
        for(int i=1 ; i<n ; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
    }
}
