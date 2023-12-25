package collection_in_java.List.LinkList;

import java.util.LinkedList;

//list is an interface which extends Collection interface.
//List interface is implemented by ArrayList, LinkedList, Vector, Stack classes.
//List interface is used to store elements in the ordered format.
//List interface can contain duplicate elements.
//List interface is a child interface of Collection interface.
//List interface is present in java.util package.
//List interface maintains the insertion order.
//List interface is not synchronized.
//List interface is used to create a collection of elements.
//List interface is used to store elements in the ordered format.
//List interface is used to access elements on the basis of index.
//List interface is used to manipulate elements.
public class MainLinkList {
    public static void main(String[] args) {
        //All Methods of LinkList
        //1. add()
        //2. addAll()
        //3. addFirst()
        //4. addLast()
        //5. remove()
        //6. removeFirst()
        //7. removeLast()
        //8. removeFirstOccurrence()
        //9. removeLastOccurrence()
        //10. clear()
        //11. get()
        //12. getFirst()
        //13. getLast()
        //14. set()
        //15. size()
        //16. contains()
        //17. containsAll()
        //18. isEmpty()
        //19. indexOf()
        //20. lastIndexOf()
        //21. toArray()
        //22. iterator()
        //23. listIterator()
        //24. subList()
        //25. clone()
        //26. equals()
        //27. hashCode()
        //28. toString()
        //Implementing LinkList
        //LinkList is a class which implements List interface.
        //LinkList is a doubly linked list implementation of the List and Deque interfaces.
        //LinkList can contain duplicate elements.
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(10); //add() method is used to add element in LinkList.
        llist.add(20);
        llist.add(30);
        llist.add(40);
        llist.add(50);
        System.out.println(llist); //Output: [10, 20, 30, 40, 50]
    }
}
