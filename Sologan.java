import java.util.Scanner;

public class Sologan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String slogan = sc.nextLine();
        char[] ch = slogan.toCharArray();
        for(int i = 0;i<slogan.length();i++) {
            if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z'){

            }
            else if(slogan.charAt(i) == ' '){

            }
            else{
                System.out.println("Invalid slogan");
            }
        }
        int count[] = new int[256];
        String str = slogan.replaceAll("\\s","");
        int len = str.length();
        int sum = 0;
        int mult = 0;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            count[c]++;
        }
        
        for (int i = 0; i < len; i++) {
            char chh = str.charAt(i);
            if(count[chh] == 1) {
                sum++;
            }
            else{
                mult++;
            }
        }

        if(sum == mult) {
            System.out.println("All the guidelines are satisfied for " + slogan);
        }
        else{
            System.out.println(slogan + "does not satisfy the guidelines");
        }
    }
}
