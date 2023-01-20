class MathCalc{
    int count =1;
    synchronized void PrintingPower(int n){
        int temp=1;
        for (count = 1; count <=5 ; count++) {
            temp = temp*n;
            System.out.println("Power of "+ n+ "^"+ count + "is "+temp);
        }
    }
}

public class MathCalcTesting {
    static MathCalc m = new MathCalc();

    public static void main(String[] args) {
        Runnable r1 = new Runnable(){
            public void run() {
                m.PrintingPower(2);
            }
        };

        Runnable r2 = new Runnable(){
            public void run() {
                m.PrintingPower(10);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();

        t2.start();
    }
}