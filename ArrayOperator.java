import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayOperator {
    /**
     * @param arg
     */
    public static void main(String arg []){
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> Shyam=new ArrayList<Integer>();
        // add operator
        Shyam.add(89);
        Shyam.add(849);
        Shyam.add(85);
        System.out.println("Create the list"+ Shyam);
        // short operatior
        Collections.sort(Shyam);
        System.out.println("Short the element"+ Shyam);
        // Frequency of a value/element:
        Collections.frequency(Shyam, 5);
        System.out.println("Frequeny of element" + Shyam);
        // swap operator
        Collections.swap(Shyam, 4,8);
        System.out.println("Swap the element" + Shyam);



    }
}
