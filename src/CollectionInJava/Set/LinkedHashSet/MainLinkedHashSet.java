package CollectionInJava.Set.LinkedHashSet;

import java.util.LinkedHashSet;

//what is LinkedHashSet?
//LinkedHashSet is a Hash table and Linked list implementation of the Set interface.
//LinkedHashSet class extends HashSet class.
//LinkedHashSet class implements Set interface.
//LinkedHashSet class contains unique elements only like HashSet.
//LinkedHashSet class provides all optional set operation and permits null elements.
//LinkedHashSet class is non synchronized.
//LinkedHashSet class maintains insertion order.
//LinkedHashSet class is the best approach for search operation.
//LinkedHashSet class is faster than TreeSet class.
//LinkedHashSet class is slower than HashSet class.
//LinkedHashSet class is faster than TreeSet class because it uses Hash table for storage.
//LinkedHashSet class is slower than HashSet class because it maintains insertion order.
//LinkedHashSet class declaration:
//public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable
public class MainLinkedHashSet {
    public static void main(String[] args) {
        //method in LinkedHashSet:
        //.add();
        //.contains();
        //.isEmpty();
        //.size();
        //.remove();
        //.clear();
        //.toArray();
        //.iterator();
        //.spliterator();
        //.stream();
        //.parallelStream();
        //.forEach();
        //.removeIf();
        //.equals();
        //.hashCode();
        //.stream();
        //.parallelStream();
        //.forEachOrdered();
        //.removeIf();
        //.equals();
        //.hashCode();
        //.spliterator();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        System.out.println(linkedHashSet +" "+" ---->  Maintains insertion order");
        System.out.println(linkedHashSet.contains("Java")+ " "+" ---->  Contains");
        System.out.println(linkedHashSet.isEmpty()+ " "+" ---->  Is Empty");
        System.out.println(linkedHashSet.size()+ " "+" ---->  Size");
        linkedHashSet.remove("C++");
        System.out.println(linkedHashSet +" "+" ---->  Remove");
        linkedHashSet.clear();
        System.out.println(linkedHashSet +" "+" ---->  Clear");
        //how to get 2rd index element from LinkedHashSet?
        //LinkedHashSet does not provide any method to get element by index.
        //LinkedHashSet maintains insertion order.
        //LinkedHashSet does not allow duplicate element.
        //LinkedHashSet allows null element.
        //LinkedHashSet is not synchronized.
        //LinkedHashSet is the best approach for search operation.
        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add(10);
        linkedHashSet1.add(20);
        linkedHashSet1.add(30);
        linkedHashSet1.add(40);
        linkedHashSet1.add(50);
        System.out.println(linkedHashSet1);
        Object[] arr = linkedHashSet1.toArray();
        System.out.println(arr[2]+" "+" ----> To Array");

        System.out.println(linkedHashSet1.stream().count()+" "+" ---->  Stream Count");
    }
}
