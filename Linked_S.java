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
        LinkedList <String> new_fruit= new LinkedList<String>();
        new_fruit.add("Watermelon");
        new_fruit.add("Guava");
        new_fruit.add("Cherry");
        fruit_List.addAll(4,new_fruit);
        System.out.println("fruit list " + fruit_List);
    }
}
