import java.util.LinkedList;

public class Linked_S {
    public static void main(String[] args) {
        LinkedList <String> fruit_List= new LinkedList<String>();
        fruit_List.add("Mango");
        fruit_List.add("Orange");
        fruit_List.add("Pineapple");
        fruit_List.add("Apple");
        fruit_List.add("Papaya");
        System.out.println("Fruit list in linked list: " + fruit_List);
       
        fruit_List.addFirst("Watermelon");
        fruit_List.addLast("Guava");
        //fruit_List.add("Cherry");
      
        System.out.println("fruit list " + fruit_List);
    }
}
