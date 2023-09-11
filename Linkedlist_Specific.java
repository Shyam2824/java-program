import java.util.LinkedList;

public class Linkedlist_Specific {
    public static void main(String[] args) {
        LinkedList <String> book_List= new LinkedList <String>();
        book_List.add("Science");
        book_List.add("Math");
        book_List.add("Java");
        book_List.add("PHP");
        book_List.add("Software");
        book_List.add("Data Science");
        book_List.add("python");
        book_List.add("Cloud");
        System.out.println("LinkedList book :" + book_List);
        book_List.add(4, "bootstrap");
        System.out.println("Add in the specific Location :" + book_List );
    }
}
