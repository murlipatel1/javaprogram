class OddEven{
    boolean flag = false;
    synchronized void tockprint(){
        for (int i = 1; i <= 5; i++) { 
            if(flag){
                System.err.println("Tock");
                try{
                    wait();
                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            flag =true;
            notify();
        }
    }

    synchronized void tickprint(){
        for (int i = 1; i <= 5; i++) {
            if(!flag){
                
                System.out.println("Tick");
                try{
                    wait();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            flag = false;
            notify();
        }
    }
}

public class ticktock {
    public static void main(String[] args) {
    OddEven eo = new OddEven();

    Runnable r1 = new Runnable() {
        public void run(){
            eo.tickprint();
        }
    };
    Runnable r2 = new Runnable() {
        public void run(){
            eo.tockprint();
        }
    };
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();
    }
}
