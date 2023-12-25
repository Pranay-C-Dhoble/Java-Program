package collection_in_java.Queue;
import java.util.Queue;
import java.util.PriorityQueue;
//What is Priority queue?
//Priority queue is a class which is part of java.util package.
//Priority queue is used to store data in queue format.
//Priority queue class is a part of Java Collection Framework.
//Priority queue class is implemented by PriorityQueue.
//Priority queue class is used to create a collection of queue.
//Priority queue class is same as Queue interface except that it sorts the elements in the queue in ascending order.
//Priority queue class is not synchronized.
//Priority queue class is slower than Queue interface.
//Priority queue class is the best choice if our frequent operation is sorting operation
public class Priorityqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(5);
        queue.add(1); //add() method is used to add element in queue.
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6); //Output: Exception in thread "main" java.lang.IllegalStateException: Queue full
        queue.add(7); //Output: Exception in thread "main" java.lang.IllegalStateException: Queue full
        queue.offer(9);
        System.out.println(queue.offer(10));
        System.out.println(queue.add(8)); //Output: Exception in thread "main" java.lang.IllegalStateException: Queue full
        System.out.println(queue); //Output: [1, 2, 3, 4]
        //Priority queue sorts the elements in the queue in ascending order.
        //Priority queue doesn't allow null values.
        //Priority queue allows duplicate values.
        //Priority queue is not synchronized.
        //Priority queue is the best choice if our frequent operation is sorting operation.
        //Priority queue is slower than Queue interface.
        //Priority queue Methods
        System.out.println(queue.peek()); //Output: 1 //peek() method is used to get element from queue.
        System.out.println(queue.contains(1)); //Output: true //contains() method is used to check whether the specified element is present in queue or not.
        System.out.println(queue.isEmpty()); //Output: false //isEmpty() method is used to check whether the queue is empty or not.
        System.out.println(queue.size()); //Output: 4 //size() method is used to get the size of queue.
        System.out.println(queue.remove()); //Output: 1 //remove() method is used to remove element from queue.
        System.out.println(queue); //Output: [2, 3, 4]
        queue.clear(); //clear() method is used to remove all elements from queue.
        System.out.println(queue); //Output: []
        System.out.println(queue.isEmpty()); //Output: true
    }
}
