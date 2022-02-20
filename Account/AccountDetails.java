package Account;
import java.util.*;
public class AccountDetails {

    Scanner scanner = new Scanner(System.in);

    public Account getAccountDetails() {
        Account a = new Account();
        System.out.println("Enter account id:");
        int id = scanner.nextInt();

        System.out.println("Enter account type:");
        String type = scanner.next();
        while(true){
            System.out.println("Enter balance:");
            int balance = scanner.nextInt();
            if(balance <= 0){
                System.out.println("Balance should be positive");
            }
            else{
                a.setBalance(balance);
                break;
            }

        }
        a.setAccountId(id);
        a.setAccountType(type);

        return a;
    }

    public int getWithdrawAmount(){
        int amt;
        while(true){
            System.out.println("Enter amount to be withdrawn:");
            amt = scanner.nextInt();
            if(amt <= 0){
                System.out.println("Amount should be positive");
                continue;
            }
            else break;

        }
        return amt;
    }

    public static void main(String[] args) {
        AccountDetails ad = new AccountDetails();
        Account ac = ad.getAccountDetails();
        boolean success = ac.withdraw(ad.getWithdrawAmount());

    }    
}
