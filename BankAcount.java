import java.util.Scanner;

public class BankTransactions {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        double balance = 0;

        do {

            
            double amount;

            System.out.println("Type Number");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            num = scan.nextInt();

            if (num == 1) {
                System.out.println("Enter amount to deposit: ");
                amount = scan.nextDouble();

                // Add the amount to the balance
                balance += amount;
                System.out.println("Your balance is");
                System.out.println(balance);


            } else if (num == 2) {

                System.out.println("Enter amount to withdrawal: ");
                amount = scan.nextDouble();

                // Remove the amount from the balance
                balance -= amount;
                System.out.println("Your balance is");
                System.out.println(balance);

            } else if (num == 3) {


                System.out.println("Your Balance");
                System.out.println(balance);

            }



        } while (num != 4);

        System.out.println("Good Bye!");

    }
}
