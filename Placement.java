import java.util.*;
import java.util.stream.*;
class Placement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cse,mech,ece;

        System.out.println("Enter the no of students placed in CSE:");
        cse = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        ece = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        mech = sc.nextInt();

           
        List<Integer> placement = new TreeSet<>(Arrays.asList(cse, ece, mech)).stream().collect(Collectors.toList());
        if(placement.get(0) < 0){
            System.out.println("Input is Invalid");
        }
        else if(placement.size() == 1){
            System.out.println("None of the department has got the highest placement");
        }
        else{
            System.out.println("Highest placement");
            int highest = placement.get(placement.size() - 1);
            
            if(placement.size() == 2){
                if(cse == highest && ece == highest){
                    System.out.println("CSE");
                    System.out.println("ECE");
                }
                else if(cse == highest && mech == highest){
                    System.out.println("CSE");
                    System.out.println("MECH");
                }
                else if(ece == highest && mech == highest){
                    System.out.println("ECE");
                    System.out.println("MECH");
                }
                else if(cse == highest){
                    System.out.println("CSE");
                }
                else if(ece == highest){
                    System.out.println("ECE");
                }
                else if(mech == highest){
                    System.out.println("MECH");
                }
            }
            else{
                if(cse == highest){
                    System.out.println("CSE");
                }
                else if(ece == highest){
                    System.out.println("ECE");
                }
                else if(mech == highest){
                    System.out.println("MECH");
                }
            }
        }
    }
}   