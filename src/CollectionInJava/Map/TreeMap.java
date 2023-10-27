package CollectionInJava.Map;
import java.util.Map;
import java.util.TreeMap;
//What is TreeMap?
//TreeMap is a class which is part of java.util package.
//TreeMap is used to store data in key and value pair.
//TreeMap class is a part of Java Collection Framework.
//TreeMap class is implemented by Red-Black Tree.
//TreeMap class is used to create a collection of key and value pair.
//TreeMap class is same as HashMap class except that it maintains ascending order.
//TreeMap class is not synchronized.
//TreeMap class is slower than HashMap class.
//TreeMap class is the best choice if our frequent operation is search operation.
//TreeMap class is faster than HashTable class.
//TreeMap class is slower than LinkedHashMap class.
public class Treemap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "A"); //put() method is used to add element in TreeMap.
        map.put(6, "B");
        map.put(7, "C");
        map.put(8, "D");
        map.put(5, "D");
        map.put(2, "D");
        map.put(3, "D");
        map.put(4, "D");
        System.out.println(map); //Output: {1=A, 2=B, 3=C, 4=D}
        //TreeMap maintains ascending order.
        //TreeMap doesn't allow null key but allows multiple null values.
        //TreeMap allows duplicate values but not duplicate keys.
        //TreeMap is not synchronized.
        //TreeMap is the best choice if our frequent operation is search operation.
        //TreeMap is faster than HashTable.
        //TreeMap is slower than LinkedHashMap.
        //TreeMap Methods
        System.out.println(map.get(1)); //Output: A //get() method is used to get element from TreeMap.
        System.out.println(map.containsKey(1)); //Output: true //containsKey() method is used to check whether the specified key is present in TreeMap or not.
        System.out.println(map.containsValue("A")); //Output: true //containsValue() method is used to check whether the specified value is present in TreeMap or not.
        System.out.println(map.isEmpty()); //Output: false //isEmpty() method is used to check whether the TreeMap is empty or not.
        System.out.println(map.size()); //Output: 4 //size() method is used to get the size of TreeMap.
        System.out.println(map.remove(1)); //Output: A //remove() method is used to remove element from TreeMap.
        System.out.println(map); //Output: {2=B, 3=C, 4=D}
        map.clear(); //clear() method is used to remove all elements from TreeMap.
        System.out.println(map); //Output: {}
        System.out.println(map.isEmpty()); //Output: true
    }
}
