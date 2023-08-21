public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("             MULTIPLICATION TABLE  ");
        System.out.println("  ");
        for(int j=1; j<=5;j++)
        System.out.println("  " + j);
        System.out.println("\n--------------------------------------");
        for (int i=1;i<=5;i++){
            System.out.println(i + "|");
            for(int j=1; j<=5;j++){
                System.out.printf("%4d" , i*j);
            }
            System.out.println();
        }
    }
}
