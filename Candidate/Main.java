package Candidate;
import java.util.*;
public class Main {

    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate details");
        System.out.println("Name");
        String name = sc.next();

        System.out.println("Gender");
        String gender = sc.next();

        System.out.println("Expected Salary");
        double expectedSalary = sc.nextDouble();

        if(expectedSalary < 10000){
            throw new InvalidSalaryException("Registration Failed. Salarycannot be less than 10000.");
        }
        else{
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setExpectedSalary(expectedSalary);
            return candidate;
        }
    }

    public static void main(String[] args) {
        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
