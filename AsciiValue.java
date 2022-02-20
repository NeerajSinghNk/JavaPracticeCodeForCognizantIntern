import java.util.*;
class AsciiValue{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits:");

        for(int i=0;i<4;i++){
            int val = sc.nextInt();
            System.out.println(val + "-" + (char)val);
        }
        sc.close();
    }
}