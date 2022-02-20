package Student;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's Id:");
        int id = scanner.nextInt();

        System.out.println("Enter Student's Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Student's Address:");
        String address = scanner.nextLine();

        boolean isFromNIT = false;
        String collageName = "";

        while(true){
            System.out.println("Whether the student is form NIT(Yes/No):");
            String input = scanner.nextLine();

            if(input.equals("Yes") || input.equals("yes")){
                isFromNIT = true;
                break;
            }
            else if(input.equals("No") || input.equals("no")){
                System.out.println("Enter the collage name:");
                collageName = scanner.nextLine();
                break;
            }
        }

        Student student;
        if(isFromNIT){
            student = new Student(id, name, address);
        }
        else{
            student = new Student(id, name, address, collageName);
        }

        System.out.println("Student id:" + student.getStudentId());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("Collage name:" + student.getCollegeName());
    }
}
