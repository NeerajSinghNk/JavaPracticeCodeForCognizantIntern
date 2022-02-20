package Employee;
// import java.util.*;
public class Main {

    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(101,"Neeraj",100000);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(102,"Kumar",14,100);

        Loan  loan = new Loan();
            double permanentEmployeeLoan = loan.calculateLoanAmount(permanentEmployee);
            double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryEmployee);
            System.out.println(permanentEmployeeLoan);
            System.out.println(temporaryEmployeeLoan);
    }    
}
