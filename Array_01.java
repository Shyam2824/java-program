public class Array_01 {
    public static void main(String[] args) {
        int arr[] = new int [10];
        int nElem=0;
        int j;
        int SearchKey;
        
        // insert the number of array
        arr[0]=59;
        arr[1]=89;
        arr[2]=56;
        arr[3]=45;
        arr[4]=24;
        arr[5]=514;
        arr[6]=54;
        arr[7]=200;
        arr[8]=95;
        arr[9]=599;
        nElem=10;    // now 10 element in the array

        for(j=0;j<nElem;j++) // display the Items
            System.out.println(arr[j] +" ");
            System.out.println("");
    // find search element 
    SearchKey=200;
    for(j=0;j<nElem;j++) // for each element
    if(arr[j]==SearchKey) // found items
    break;
    if(j==nElem)
    System.out.println("can't find" + SearchKey); // yes
    else
    System.out.println("found" + SearchKey); // no

    // Deletion of the element
    SearchKey=599;
    for(j=0;j<nElem;j++)
    if(arr[j]==SearchKey)
    break;
    for(int i=j;i<nElem -1;i++)
    arr[i]=arr[i+1];
    nElem--;

    // Display items
    for(j=0; j<nElem;j++)
    System.out.println(arr[j]+ " ");
    System.out.println("");
    }
}
