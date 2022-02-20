import java.util.*;
public class PowerProgress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        if(base <= 0){
            System.out.println(base+ "is an invalid");
        }
        if(exponent <= 0){
            System.out.println(exponent+ " is an invalid");
            System.exit(0);
        }
        if(base > exponent){
            System.out.println(base+ " is not less than "+exponent);
            System.exit(0);
        }
        for(int i=1; i<=exponent; i++){
            System.out.print((int)Math.pow(base, i)+ " ");
        }


    }
}
