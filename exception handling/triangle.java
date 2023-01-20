import java.util.Scanner;

class InvalidBoxException extends Exception{
    public InvalidBoxException(String s){
        System.out.println("length breath");
    }
}

class InvalidTriangleException extends RuntimeException{
    public InvalidTriangleException(String sc){
        sc="Triangle caught invalid length";
        System.out.println(sc);
    }

}

public class triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length,breath,height;

        length = sc.nextInt();
        breath = sc.nextInt();
        height = sc.nextInt();


        //Exception handling 
        try {
            if(length <=0 && breath <=0 && height <=0)
            throw new InvalidBoxException("InvalidBox length breth height > 0");

        }
        catch(InvalidBoxException ex){
            System.out.println("Caught length breath height ");
            
            System.out.println(ex.getMessage());

        }


        
    }
}