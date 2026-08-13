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
    }
}
