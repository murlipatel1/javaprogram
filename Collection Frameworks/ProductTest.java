import java.io.*;
import java.util.*;

class Product implements Serializable{
    protected int pId;
    protected String pName;
    protected int pRate;

    static int count;
    {
        count++;
    }

    public static void getProductCount(){
        System.out.println(count);
    }

    public String getName(){
        return pName;
    }

    public void setpName(String pName){
        this.pName= pName;
    }

    public int getpId(){
        return pId;
    }

    public void setpId( int id){
        pId = id;
    }

    public int getpRate(){
        return pRate;
    }

    // return total number of id created
    public int getCount(){
        return count;
    }

    public Product(String name , int rate){
        pName = name;
        pRate = rate;
    }

    public String toString(){
        return " Product id is " + pId + " name is" +pName ;
    }

        
    public Product() {
    }
}




public class ProductTest{

    public static int totalRate(Product[] prd){
        int sum=0 ;
        for (int i = 0; i < prd.length; i++) {
            sum = sum + prd[i].getpRate();
        }
        return sum;
    }
     public static void main(String[] args) {

        Product p1 = new Product("Murli" , 100);

        Product p2 = new Product("Harshit", 1000);

        Product p3 = new Product("Murli" , 100);

        System.out.println(p1.getName());

        System.out.println(p2);

        Product[] prd = { new Product("Book ", 35), new Product(" gg", 56)};

        System.out.println(totalRate(prd));

        List ls = new ArrayList();

        ls.add(new Product("Murli", 100));
        ls.add(p1);

        Iterator i = ls.iterator();
        while (i.hasNext()) {
            Product emp = (Product) i.next();
            System.out.println(emp + "\t" + emp.getName());    
        }

        // Comparator cmp = new Comparator() ;

        Set<String> set = new HashSet<String>();
        
        set.add("Murli");
        set.add("Milan");
        set.add("Murli");
        set.add("Dev");
        set.add("Aryan");

        Iterator<String> is=set.iterator();  
           while(is.hasNext())  
           {  
           System.out.println(is.next());  
           }  

           Set pr = new HashSet();
           pr.add(p1);
           pr.add(p3);

           Iterator it=set.iterator();  
           while(it.hasNext())  
           {  
           System.out.println(it.next());  
           }  

           Comparator cmp = new Comparator() {
            public int compare(Object first , Object second){

                Product pd1 = (Product) first;
                Product pd2 = (Product) second;

                if(pd1.getpId() > pd2.getpId()) return pd2.getpRate() - pd1.getpRate();
                return pd1.getpRate() - pd2.getpRate();

            }
           };

           Set st = new TreeSet(cmp);

           st.add(p1);
           st.add(p2);

           Iterator itr=st.iterator();  
           while(it.hasNext())  
           {  
           System.out.println(it.next());  
           } 
           

     }

}


// Employee name id hour rate required constructors getter/setter methods 

// getNetIncome () calculate income
// getcountofEmployees() return total count
// totalGetNetIncome(Employee[]) return totalIncome