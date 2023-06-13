import java.util.*;

public class hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insert
        map.put("India",120);
        map.put("China",12);
        map.put("US",10);

        // System.out.println(map); 

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }
}