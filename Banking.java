import java.util.Scanner;

public class Banking {
    static double balance = 0;

    public static void Deposit() {
        System.out.println("Enter the amount to deposit --");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println(amount + " Rupee is successfully deposited to your account!");
        Balance();

    }

    public static void Withdraw() {
        System.out.println("Enter the amount to withdraw --");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " Rupee is withdrawn from your account!");
            System.out.println(balance + " Rupee is successfully withdrawn from your account!");

        } else {
            System.out.println("Invalid Amount!");
        }
        Balance();

    }

    public static void Balance() {

        System.out.println(balance + " Rupee is Your Balanced Amount!");
        System.out.println("       ---Thank You For Banking With Us.---");

    }

    public static void Transfer_Money() {

        System.out.println("Enter the Amount you want to transfer -");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextInt();
        System.out.println("Enter the Recipients Account number -- ");
        Long rec_acc = sc.nextLong();
        System.out.println(amount + " Rupee is deposited to '" + rec_acc + "'' Holder.");

    }

    public static void Exit() {

        System.out.println("Thank You For Banking With Us");

    }

    public static void main(String[] args) {
        System.out.println("       -- WELCOME TO THE SDI BANK -- ");
        int acc_pin = 1234;

        System.out.println("INSERT THE CARD - ");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE PIN:");
        int pin = sc.nextInt();

        if (acc_pin == pin) {
            System.out.println("VALID USER!");
            System.out.println(
                    "SELECT THE TRANSACTION --\r\n1.DEPOSIT\r\n2.WITHDRAW\r\n3.BALANCE\r\n4.TRANSFER MONEY\r\n5.Exit");
            int trans = sc.nextInt();
            switch (trans) {
                case 1:
                    Deposit();

                    break;
                case 2:
                    Withdraw();

                    break;
                case 3:
                    Balance();

                    break;
                case 4:
                    Transfer_Money();

                    break;
                case 5:
                    Exit();

                    break;

                default:
                    System.out.println("Invalid Option  \r\nThank You !!");
                    break;
            }

        } else {
            System.out.println("    --INCORRECT PIN!--\r\n     PLEASE TRY AGAIN!");
        }

    }

}


