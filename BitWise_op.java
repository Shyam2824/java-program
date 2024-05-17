public class BitWise_op {
    public static void main(String[] args) {
        int a= 300;
        int b= 400;

        int andResult= a & b;
        System.out.println("Bitwise operator" + a + "and" + b + "is" + andResult);

        int orResult= a | b;
        System.out.println("Bitwise operator" + a + "or" + b + "is" + orResult);

        int xorResult= a ^ b;
        System.out.println("Bitwise operator" + a + "xor" + b + "is" + xorResult);

        int notResult= ~a;
        System.out.println("Bitwise operator" + a + "not" + b + "is" + notResult);

    }
}
