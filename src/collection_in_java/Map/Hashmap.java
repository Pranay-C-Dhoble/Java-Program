package collection_in_java.Map;

import java.util.Map;
import java.util.HashMap;

//What is HashMap?
//HashMap is a class which is part of java.util package.
//HashMap is used to store data in key and value pair.
//HashMap class is a part of Java Collection Framework.
//HashMap class is implemented by HashTable.
//HashMap class is used to create a collection of key and value pair.
public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A"); //put() method is used to add element in HashMap.
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        System.out.println(map); //Output: {1=A, 2=B, 3=C, 4=D}
        //HashMap doesn't maintain insertion order.
        //HashMap allows null key and null values.
        //HashMap allows duplicate values but not duplicate keys.
        //HashMap is not synchronized.
        //HashMap is the best choice if our frequent operation is search operation.
        //HashMap is faster than HashTable.

        //HashMap Methods
        System.out.println(map.get(1)); //Output: A //get() method is used to get element from HashMap.
        System.out.println(map.containsKey(1)); //Output: true //containsKey() method is used to check whether the specified key is present in HashMap or not.
        System.out.println(map.containsValue("A")); //Output: true //containsValue() method is used to check whether the specified value is present in HashMap or not.
        System.out.println(map.isEmpty()); //Output: false //isEmpty() method is used to check whether the HashMap is empty or not.
        System.out.println(map.size()); //Output: 4 //size() method is used to get the size of HashMap.
        System.out.println(map.remove(1)); //Output: A //remove() method is used to remove element from HashMap.
        System.out.println(map); //Output: {2=B, 3=C, 4=D}
        map.clear(); //clear() method is used to remove all elements from HashMap.
        System.out.println(map); //Output: {
        System.out.println(map.isEmpty()); //Output: true

    }
}
