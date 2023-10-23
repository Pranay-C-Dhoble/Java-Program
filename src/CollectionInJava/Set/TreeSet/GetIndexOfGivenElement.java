package CollectionInJava.Set.TreeSet;
import java.util.TreeSet;
public class GetIndexOfGivenElement {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(40);

        // Element to find
        int elementToFind = 30;

        int index = 0;
        for (int element : treeSet) {
            if (element == elementToFind) {
                break;
            }
            index++;
        }

        // Check if the element was found and print its index
        if (index < treeSet.size()) {
            System.out.println("Index of " + elementToFind + " is: " + index);
        } else {
            System.out.println(elementToFind + " not found in the TreeSet.");
        }
    }
}
