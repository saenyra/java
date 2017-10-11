import java.util.Scanner;

public class BankMenu {
    public static float balance;
    public static int option;

    public static void menu(){
    	Scanner enter = new Scanner(System.in);
        System.out.println("Choose one of the options below: ");
        System.out.println("0. End");
        System.out.println("1. Deposit");
        System.out.println("2. Cash withdrawal");
        System.out.println("3. Balance consulte");
        System.out.println("Option:");
    }

    public static void deposit(){
        System.out.println("You entered the deposit method");
        float depositValue;
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        depositValue = enter.nextFloat();
        System.out.println("The deposit value was: " + depositValue);
        balance = balance + depositValue;
    }

    public static void cashWithdrawal(){
        System.out.println("You entered the serve method");
        float cashWithdrawalValue;
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the value to cash withdrawal: ");
        cashWithdrawalValue = enter.nextFloat();
        System.out.println("The value of the cash withdrawal was: " + cashWithdrawalValue);
        balance = balance - cashWithdrawalValue;
    }

    public static void consultation(){
        System.out.println("You entered the consultation method");
        System.out.println(balance);
    }

    public static void main(String[] args) {
      Scanner enter = new Scanner(System.in);

      do{
        menu();
        option = enter.nextInt();

        switch(option){
            case 1:
            deposit();
            break;

            case 2:
            cashWithdrawal();
            break;

            case 3:
            consultation();
            break;

            default:
            System.out.println("Invalid option!");
        }
    } while(option != 0);
}
}
