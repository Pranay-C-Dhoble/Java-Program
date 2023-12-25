package collection_in_java.Map;
import java.util.Map;
import java.util.LinkedHashMap;
//What is LinkedHashMap?
//LinkedHashMap is a class which is part of java.util package.
//LinkedHashMap is used to store data in key and value pair.
//LinkedHashMap class is a part of Java Collection Framework.
//LinkedHashMap class is implemented by HashTable.
//LinkedHashMap class is used to create a collection of key and value pair.
//LinkedHashMap class is same as HashMap class except that it maintains insertion order.
//LinkedHashMap class is not synchronized.
//LinkedHashMap class is slower than HashMap class.
//LinkedHashMap class is the best choice if our frequent operation is insertion and deletion operation.
//LinkedHashMap class is faster than HashTable class.
//LinkedHashMap class is faster than TreeMap class.
//LinkedHashMap class is slower than HashMap class.
public class linkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "A"); //put() method is used to add element in LinkedHashMap.
        map.put(2, "B");
        map.put(9, "C");
        map.put(3, "C");
        map.put(4, "D");
        map.put(7, "E");
        System.out.println(map); //Output: {1=A, 2=B, 3=C, 4=D}
        //LinkedHashMap maintains insertion order.
        //LinkedHashMap allows null key and null values.
        //LinkedHashMap allows duplicate values but not duplicate keys.
        //LinkedHashMap is not synchronized.
        //LinkedHashMap is the best choice if our frequent operation is insertion and deletion operation.
        //LinkedHashMap is faster than HashTable.
        //LinkedHashMap is faster than TreeMap.
        //LinkedHashMap is slower than HashMap.
        //LinkedHashMap Methods
        System.out.println(map.get(1)); //Output: A //get() method is used to get element from LinkedHashMap.
        System.out.println(map.containsKey(1)); //Output: true //containsKey() method is used to check whether the specified key is present in LinkedHashMap or not.
        System.out.println(map.containsValue("A")); //Output: true //containsValue() method is used to check whether the specified value is present in LinkedHashMap or not.
        System.out.println(map.isEmpty()); //Output: false //isEmpty() method is used to check whether the LinkedHashMap is empty or not.
        System.out.println(map.size()); //Output: 4 //size() method is used to get the size of LinkedHashMap.
        System.out.println(map.remove(1)); //Output: A //remove() method is used to remove element from LinkedHashMap.
        System.out.println(map); //Output: {2=B, 3=C, 4=D}
        map.clear(); //clear() method is used to remove all elements from LinkedHashMap.
        System.out.println(map); //Output: {}
        System.out.println(map.isEmpty()); //Output: true
    }
}
