package Data_Structure;
import java.util.HashSet; //importing HashSet class
import java.util.Iterator; //importing Iterator class

//Hashset is a class which implements set interface|  //Array   |   Sorted Array
//Insert / Add ----- O(1)                          |  //O(1)    |   O(n)
//Delete / Remove ----- O(1)                       |  //O(n)    |   O(log n)
//Search / Contain ----- O(1)                      |  //O(n)    |   O(n)

// Hashing is a technique that is used to uniquely identify a specific object from a group of similar objects.
public class Hashset {
    public static void main(String[] args) {
        // HashSet Creating
        HashSet<Integer> hashSet = new HashSet<>(); //hashSet is a object of HashSet class

        //HasSet Doesn't allow duplicate elements
        //HashSet doesn't maintain insertion order
        //HashSet allows null values
        //Has

        //ArrayList<Integer> hashSet = new ArrayList<>();

        //Inserting Elements
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(10);
        hashSet.add(20);

        //Size of the HashSet
        System.out.println("Size of the hashSet : "+hashSet.size());

        //Printing Elements
        System.out.println("Elements of the hashSet : "+hashSet);

        //Iterating Elements --Iterator() method
        Iterator<Integer> iterator = hashSet.iterator(); //iterator --> Null ---> 10 ---> 20 ---> 30 ---> 40
        //iterator.hasNext() --> true
        //iterator.next() --> 10
        //iterator.hasNext() --> true
        //iterator.next() --> 20
        //iterator.hasNext() --> true
        //iterator.next() --> 30
        //iterator.hasNext() --> true
        //iterator.next() --> 40
        //iterator.hasNext() --> false

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



        //Searching Elements --Contain() method
        if(hashSet.contains(10)){
            System.out.println("10 is present in the hashSet");
        }
        if(!hashSet.contains(50)){
            System.out.println("50 is not present in the hashSet");
        }

        //Removing Elements --Remove() method
        hashSet.remove(10);
        if(!hashSet.contains(10)){
            System.out.println("10 is not present in the hashSet");
        }
    }
}
