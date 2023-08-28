import java.util.Arrays;
import java.util.Collections;


public class acc_array {
    public static void main(String[] args) {
        int a[]={25,95,45,75,35,5,10,3};
        int b[]={885,95,45,75,35,5,10,3};
        System.out.println("Original array : " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Ascending arrays :" + Arrays.toString(a));
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println("Descending arrays :" + Arrays.toString(b));
    }
}
