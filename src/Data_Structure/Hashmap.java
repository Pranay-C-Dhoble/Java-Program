package Data_Structure;
import java.util.HashMap; //importing HashMap class
import java.util.*; //import all classes from util package

//Hashmap is a Data Structure
//Hashmap is a class which implements map interface
//Hashmap doesn't allow duplicate keys but it allows duplicate values
//Key is always unique
//Value can be duplicate
//Hashmap doesn't maintain insertion order
//Hashmap allows null key and null values
//**** Hashmap store the data in the form of key-value pairs.
//here map is defined as a interface and Map is defined as a class
//interface is a collection of abstract methods


public class Hashmap {
    public static void main(String[] args) {
        // Country(Key) --> Population(Value)
        HashMap<String, Integer> Map = new HashMap<>(); //Map is a object of HashMap class


        //Inserting Elements
        Map.put("India", 135);
        Map.put("China", 200);
        Map.put("USA", 35);

        System.out.println("Size of the Map : "+Map.size());//Size of the Map
        System.out.println("Elements of the Map : "+Map);//Printing Elements

        Map.put("China", 250);// Updating the value of China
        System.out.println("Elements of the Map : "+Map);

        // Russia is not present in the Map
        Map.put("Russia", 200);// Inserting new key-value pair
        System.out.println("Elements of the Map : "+Map);

        //Searching Elements --ContainKey() method
        if(Map.containsKey("India")){
            System.out.println("India is present in the Map");
        }
        else {
            System.out.println("India is not present in the Map");
        }

        //Searching Elements --ContainValue() method
        if(Map.containsValue(200)){
            System.out.println("200 is present in the Map");
        }
        else {
            System.out.println("200 is not present in the Map");
        }

        //Searching Elements --Get() method --> Get the value of the key
        System.out.println("Population of India : "+Map.get("India"));

        System.out.println("Population of Indonesia : "+Map.get("Indonesia"));// Indonesia is not present in the Map

        //Iterating Elements --Iterator() method

        int []arr= {1,2,3,4,5};
        //Normal for loop for iterating the array
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Enhanced for loop for iterating the array
        //for each loop
        for(int val : arr) { // **********for( data type variable(name) : collection/array)
        	System.out.print(val + " ");
        }
        System.out.println();



        //Iterating the Map
        //Entry is a inner interface of Map interface
        for(Map.Entry<String, Integer> e : Map.entrySet()) {//Map.entrySet() method returns a collection-view(Set<Map.Entry<K,V>>) of the mappings contained in this map
        	System.out.println(e.getKey() + " : " + e.getValue());//here 'e' is a object of Entry interface
        }

        //Iterating the Map using Iterator
        Iterator<Map.Entry<String, Integer>> itr = Map.entrySet().iterator();
        while(itr.hasNext()) {
        	Map.Entry<String, Integer> e = itr.next();
        	System.out.println(e.getKey() + " : " + e.getValue());
        }

        //keySet() method returns a set view of the keys contained in this map
        Set<String> keys = Map.keySet();
        for(String key : keys) {
        	System.out.println(key + " : " + Map.get(key));//Map.get(key) method returns the value of the key
        }

        //Removing Elements --Remove() method
        Map.remove("China");
        System.out.println("Elements of the Map : "+Map);

    }
}
