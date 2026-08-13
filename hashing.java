// Hashmap are unordered. and can be mutable 
import java.util.*;
public class hashing {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();  //initialise hashmap  // name of my hashmap is map 
        //insertion
        map.put("India",120);
        map.put("china",150);
        map.put("austrailia",100);
        System.out.println(map);
        
        // searching 
        if (map.containsKey("India")){
            System.out.println("yes key exit");
        }else{
            System.out.println("No it does not exist");
        }

        //.get
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));//null

        // for loop 
        int arr[]={1,2,3,4,5,6};
        for(int val:arr){
            System.out.println(val);
        }
        //for loop on hashmap 
        for(Map.Entry<String ,Integer> e :map.entrySet()){  
            System.out.println(e.getKey() + " "+ e.getValue());  // to get the values from the hashset 
            // System.out.println(e.getValue()); 
        }
        // to remove 
        map.remove("china");
        System.out.println(map);
    }
}
