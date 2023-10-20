package CollectionInJava.List.ArrayList;

import java.util.ArrayList;

public class MainArrayList {
    //All method of ArrayList
    //add()
    //addAll()
    //remove()
    //removeAll()
    //clear()
    //get()
    //set()
    //size()
    //contains()
    //containsAll()
    //isEmpty()
    //indexOf()
    //lastIndexOf()
    //toArray()
    //iterator()
    //listIterator()
    //subList()
    //retainAll()
    //clone()
    //equals()
    //hashCode()
    //toString()
    //Implementing ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //add() method is used to add element in ArrayList.
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list); //Output: [10, 20, 30, 40, 50]
        list.add(2, 100); //add(index, element) method is used to add element in ArrayList at specific index.
        System.out.println(list); //Output: [10, 20, 100, 30, 40, 50]
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(60);
        list1.add(70);
        list1.add(80);
        list1.add(90);
        list1.add(100);
        list.addAll(list1); //addAll() method is used to add all element of one ArrayList to another ArrayList.
        System.out.println(list); //Output: [10, 20, 100, 30, 40, 50, 60, 70, 80, 90, 100]
        list.remove(2); //remove(index) method is used to remove element from ArrayList at specific index.
        System.out.println(list); //Output: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        list.remove(Integer.valueOf(100)); //remove(Object) method is used to remove element from ArrayList.
        System.out.println(list); //Output: [10, 20, 30, 40, 50, 60, 70, 80, 90]
        list.removeAll(list1); //removeAll() method is used to remove all element of one ArrayList from another ArrayList.
        System.out.println(list); //Output: [10, 20, 30, 40, 50]
        list.clear(); //clear() method is used to remove all element from ArrayList.
        System.out.println(list); //Output: []
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.get(2)); //get(index) method is used to get element from ArrayList at specific index.
        list.set(2, 100); //set(index, element) method is used to set element in ArrayList at specific index.
        System.out.println(list); //Output: [10, 20, 100, 40, 50]
        System.out.println(list.size()); //size() method is used to get size of ArrayList.
        System.out.println(list.contains(100)); //contains(Object) method is used to check element is present in ArrayList or not.
        System.out.println(list.containsAll(list1)); //containsAll(Collection) method is used to check all element of one ArrayList is present in another ArrayList or not.
        System.out.println(list.isEmpty()); //isEmpty() method is used to check ArrayList is empty or not.
        System.out.println(list.indexOf(100)); //indexOf(Object) method is used to get index of element in ArrayList.
        System.out.println(list.lastIndexOf(100)); //lastIndexOf(Object) method is used to get last index of element in ArrayList.
        Object[] arr = list.toArray(); //toArray() method is used to convert ArrayList to Array.
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println(list); //Output: [10, 20, 100, 40, 50]
        System.out.println(list1);
        System.out.println(list.iterator()); //iterator() method is used to iterate ArrayList.
        System.out.println(list.listIterator()); //listIterator() method is used to iterate ArrayList.
        System.out.println(list.subList(1, 3)); //subList(fromIndex, toIndex) method is used to get sublist from ArrayList.
        System.out.println(list.retainAll(list1)); //retainAll(Collection) method is used to retain all element of one ArrayList from another ArrayList.
        System.out.println(list); //Output: [100]
        ArrayList<Integer> list2 = new ArrayList<>();
        //clone() method is used to clone ArrayList.
        list2 = (ArrayList<Integer>) list.clone();
        System.out.println(list2); //Output: [100]
        System.out.println(list.equals(list2)); //equals(Object) method is used to check ArrayList is equal to another ArrayList or not.
        System.out.println(list.hashCode()); //hashCode() method is used to get hashcode of ArrayList.
        System.out.println(list.toString()); //toString() method is used to get string representation of ArrayList.
        System.out.println(list.getClass()); //getClass() method is used to get class of ArrayList.//Output: class java.util.ArrayList
        System.out.println(list.getClass().getName()); //Output: java.util.ArrayList
    }

}
