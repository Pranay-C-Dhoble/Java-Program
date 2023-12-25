package collection_in_java.List.vector;
import java.util.Vector;
//What is Vector?
//Vector is a linear data structure which follows FIFO (First In First Out) order.
//Vector is a collection of elements.
//Vector is a class which is part of java.util package.
//Vector class is implemented by Array.
//Vector class is a part of Java Collection Framework.
//Vector class is used to create a collection of vector.
//Vector class is same as ArrayList class except that it is synchronized.
//Vector class is synchronized.

//what do you mean by synchronized?
//Synchronized means only one thread can access the code at a time.

//what is thread?
//Thread is a lightweight process.

//Vector class is slower than ArrayList class.
//Vector class is the best choice if our frequent operation is retrieval operation.
public class MainVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(1); //add() method is used to add element in vector.
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println(vector); //Output: [1, 2, 3, 4]
        //Vector maintains insertion order.
        //Vector allows null values.
        //Vector allows duplicate values.
        //Vector is synchronized.
        //Vector is the best choice if our frequent operation is retrieval operation.
        //Vector is slower than ArrayList.
        //Vector Methods
        System.out.println(vector.get(0)); //Output: 1 //get() method is used to get element from vector.
        System.out.println(vector.firstElement()); //Output: 1 //firstElement() method is used to get first element from vector.
        System.out.println(vector.lastElement()); //Output: 4 //lastElement() method is used to get last element from vector.
        System.out.println(vector.contains(1)); //Output: true //contains() method is used to check whether the specified element is present in vector or not.
        System.out.println(vector.isEmpty()); //Output: false //isEmpty() method is used to check whether the vector is empty or not.
        System.out.println(vector.size()); //Output: 4 //size() method is used to get the size of vector.
        System.out.println(vector.remove(0)); //Output: 1 //remove() method is used to
    }
}
