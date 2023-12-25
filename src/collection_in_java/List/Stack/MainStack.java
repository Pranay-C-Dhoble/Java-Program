package collection_in_java.List.Stack;
import java.util.Stack;
//What is Stack?
//Stack is a linear data structure which follows LIFO (Last In First Out) order.
//Stack is a collection of elements.
//Stack is a class which is part of java.util package.
//Stack class is implemented by Vector class.
//Stack class is a part of Java Collection Framework.
//Stack class is used to create a collection of stack.
//Stack class is same as Vector class except that it is specifically designed to work with LIFO (Last In First Out) operations.
//Stack class is synchronized.
//Stack class is slower than Vector class.
//Stack class is the best choice if our frequent operation is insertion and deletion operation.
//Stack class is faster than ArrayList class.

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1); //push() method is used to add element in stack.
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack); //Output: [1, 2, 3, 4]
        System.out.println(stack.search(1)); //Output: 4 //search() method is used to search element in stack.
        //Stack maintains LIFO (Last In First Out) order.
        //Stack allows null values.
        //Stack allows duplicate values.
        //Stack is synchronized.
        //Stack is the best choice if our frequent operation is insertion and deletion operation.
        //Stack is faster than ArrayList.
        //Stack Methods
        System.out.println(stack.peek()); //Output: 4 //peek() method is used to get element from stack.
        System.out.println(stack.lastElement());//Output: 4 //lastElement() method is used to get last element from stack.
        System.out.println(stack.contains(1)); //Output: true //contains() method is used to check whether the specified element is present in stack or not.
        System.out.println(stack.isEmpty()); //Output: false //isEmpty() method is used to check whether the stack is empty or not.
        System.out.println(stack.size()); //Output: 4 //size() method is used to get the size of stack.
        System.out.println(stack.pop()); //Output: 4 //pop() method is used to remove element from stack.
        System.out.println(stack); //Output: [1, 2, 3]
        stack.clear(); //clear() method is used to remove all elements from stack.
        System.out.println(stack); //Output: []
        System.out.println(stack.isEmpty()); //Output: true
    }
}
