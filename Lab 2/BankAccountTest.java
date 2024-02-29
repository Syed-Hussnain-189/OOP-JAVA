import java.util.Scanner;

public class BankAccountTest{

    public static void main(String[] args) {
        // To test BankAccount Class
        Scanner sc = new Scanner(System.in);

        BankAccount account1 = new BankAccount();

        do{
            System.out.print("Enter Account Number: ");
            long acctNo = sc.nextLong();
            account1.setAccountNumber(acctNo);
            sc.nextLine();

            System.out.print("Enter Account Title: ");
            String acctTitle = sc.nextLine();
            account1.setAccountTitle(acctTitle);

            System.out.print("Enter Balance: ");
            double acctBalance = sc.nextDouble();
            account1.setBalance(acctBalance);

            System.out.println();
            System.out.println("Account Number: " + account1.getAccountNumber());
            System.out.println("Account Title:  " + account1.getAccountTitle());
            System.out.println("Account Title:  " + account1.getBalance());

            System.out.println("Want to quit? (Y/N) ");
            String choice = sc.next();

            if(choice.equals("y") || choice.equals("Y")){
                continue;
            }
            else {
                break;
            }
        }while(true);
    }
}