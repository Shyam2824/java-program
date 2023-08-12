import java.util.Scanner;

public class atozandZtoA {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char s;
        System.out.println("Small letter");
        for(s='a';s<='z';s++){
            System.out.println(s);
        }
        System.out.println("Capital letter");
        for(s='A';s<='Z';s++){
            System.out.println(s);
        }
        System.out.println("Small letter in Reverse order");
        for(s='z';s>='a';s--){
            System.out.println(s);
        }
        System.out.println("Capital letter in reverse order");
        for(s='Z';s>='A';s--){
            System.out.println(s);
        }
    }
}
