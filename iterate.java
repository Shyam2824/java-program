import java.util.LinkedList;

public class iterate {
    public static void main(String[] args) {
    
		LinkedList <String> fru_list = new LinkedList <String> ();
		fru_list.add("Guava");
		fru_list.add("Papaya");
		fru_list.add("Mulberry");
		fru_list.add("Apple");
		fru_list.add("Banana");
		fru_list.add("Cherry");
		fru_list.add("Watermelon");
		fru_list.add("Pineapple");
		System.out.println("Given Linked List : " + fru_list);
		String x = fru_list.peekLast();
		System.out.println("Last Element in the List : " + x);
		System.out.println("Original Linked List : " + fru_list);
        if(fru_list.contains("Papaya")){
            System.out.println("Present in the list ....");
        }
        else{
            System.out.println("Not present in list....");
        }
        if(fru_list.contains("Carrot")){
            System.out.println("Present in the list ....");
        }
        else{
            System.out.println("Not present in list....");
        }
    }
}
