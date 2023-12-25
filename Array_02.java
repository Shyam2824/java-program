class LowArray{
    private long[] a;  // refer to array a

    public LowArray(int size){   // constructor 
        a= new long[size];      // create array
    }

    public void setElement(int index, long value){
        a[index] = value;  // set value
    }

    public long getElement(int index){
        return a[index];  // get value
    }
}

 class Array_02 {
    public static void main(String[] args) {
        LowArray [] arr;
        arr= new LowArray [100]; // create lowArray in object
        int nElems=0; // number of items in array
        int j; 

        // insert 10 element
        arr.setElement(0 ,58);
        arr.setElement(1 ,78);
        arr.setElement(2 ,53);
        arr.setElement(3 ,76);
        arr.setElement(4 ,99);
        arr.setElement(5 ,10);
        arr.setElement(6 ,588);
        arr.setElement(7 ,759);
        arr.setElement(8 ,584);
        arr.setElement(9 ,508);

        nElems=10;
        for(j=0;j<nElems;j++)
            System.out.println(arr.getElement(j) + " ");
            System.out.println(" ");

            int searchKey=26; // search for data element 
            for(j=0;j<nElems;j++)
            if (arr.getElement(j) == searchKey)
            break;
            if(j==nElems)
            System.out.println("Can't find " + searchKey);
            else
            System.out.println("found " + searchKey);

            // delete value
            for(j=0;j<nElems;j++)
            if(arr.getElement(j)==55)
            break;
            for(int k =j;k<nElems;k++)
            arr.setElement(k, arr.getElement(k+1));
            nElems--; // decrement size

            for(j=0;j<nElems;j++)  // display
            System.out.println(arr.getElement(j)+ " ");
            System.out.println(" ");
        
    }
}

