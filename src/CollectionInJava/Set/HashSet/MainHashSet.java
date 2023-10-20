package CollectionInJava.Set.HashSet;

import java.util.HashSet;
//what is hashSet?
//HashSet is a class which implements Set interface.
//HashSet is a collection of unique elements.
//HashSet does not allow duplicate elements.
//HashSet is the best approach for search operation.
//HashSet is not synchronized.

//HashSet class declaration:
//public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
//HashSet class implements Serializable, Cloneable, Set, Collection, Iterable interfaces.
//HashSet class extends AbstractSet class.
public class MainHashSet {
    public static void main(String[] args) {
        //method in HashSet:
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java");
        hashSet.add("C");
        hashSet.add("C#");
        hashSet.add("PHP");
        hashSet.add("Ruby");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("Java"));
        System.out.println(hashSet.contains("JavaScript"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());

        hashSet.remove("C");
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
        //how to get 3rd index element from HashSet?
        //HashSet does not provide any method to get element by index.
        //HashSet does not maintain insertion order.
        //HashSet does not allow duplicate element.
        //HashSet allows null element.
        //HashSet is not synchronized.
        //HashSet is the best approach for search operation.

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(10);
        hashSet1.add(20);
        hashSet1.add(30);
        hashSet1.add(40);
        hashSet1.add(50);
        System.out.println(hashSet1);
        Object[] arr = hashSet1.toArray();
        System.out.println(arr[2]);
        //HashSet does not provide any method to get element by index.
        //HashSet does not maintain insertion order.
    }

}
