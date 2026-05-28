// import java.util.*;

// class Collect
// {
//     public static void main(String[] args)
//     {
//         List<Integer> list = new ArrayList<>();//create an ArrayList of integers it allows duplicate elements and maintains insertion order

//         list.add(10);
//         list.add(20);
//         list.add(30);

//         list.remove(1);//remove the element at index 1
//         System.out.println("The collection after removal is: " + list);
//         list.add(40);//add 40 to the end of the list
//         System.out.println("The collection after adding is: " + list);
//         list.set(1, 50);//replace the element at index 1 with 50
//         System.out.println("The collection after setting is: " + list);
//         // list.clear();//remove all elements from the list
//         // System.out.println("The collection after clearing is: " + list);
//         list.size();//returns the number of elements in the list
//         System.out.println("The size of the collection is: " + list.size());
//         list.contains(20);//check if the list contains the element 30
//         System.out.println("Does the collection contain  " + list.contains(20));

//     }
// }

//==============================================
//Arranging the Chocolate Factory Problem
import java.util.*;
class Collect {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        // Traverse using for-each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}