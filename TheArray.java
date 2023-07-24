public class TheArray {
    public static void main(String[] args) {
        long [] arr;  // reference to array
        arr= new long[100];  // make array
        int nElems= 0; // number of items
        int j; // loop counter
        long serchkey; // key of items to search
        //insert 10 items
        arr[0]=77;
        arr[1]=99;
        arr[2]=44;
        arr[3]=55;
        arr[4]=22;
        arr[5]=88;
        arr[6]=11;
        arr[7]=00;
        arr[8]=66;
        arr[9]=33;
        nElems=10;  // now 10 elements in array

        // display items
        for(j=0; j<nElems;j++)
        System.out.println(arr[j] + " ");
        System.out.println(" ");

        
    }
}
