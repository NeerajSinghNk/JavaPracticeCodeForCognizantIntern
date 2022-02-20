import java.util.*;
class StringConcatetaion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name = sc.nextLine();
        System.out.println("Inmate's father's name:");
        String fname = sc.nextLine();

        name = name.concat(" ").concat(fname);
        char ch[] = name.toCharArray();

        for(char c: ch){
            if(Character.isDigit(c)||c=='+'||c=='!'||c=='@'||c=='#'||c=='%'||c=='$'||c=='^'||c=='&'||c=='*'||c=='('
            ||c==')'||c=='-'||c=='='||c=='/'||c=='<'||c=='>'||c=='?'||c=='{'||c=='}'||c=='['||c==']')
            {
                System.out.print("Invalid name");
                System.exit(0);
            }
        }
        System.out.println(name.toUpperCase());
    }
}