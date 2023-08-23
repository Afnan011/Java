package Assignment2;

import java.util.Scanner;

public class Assn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CurrentAccount currentAccount = new CurrentAccount(1000);       //checking account
        SavingsAccount savingsAccount = new SavingsAccount(5000);

        int ch = 0;
        while (ch != 3) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Manage Current Account");
            System.out.println("2. Manage Savings Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    manageAccount(currentAccount, "Current Account", scanner);
                    break;

                case 2:
                    manageAccount(savingsAccount, "Savings Account", scanner);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        System.out.println("Current Account balance: ₹" + currentAccount.getBalance());
        System.out.println("Savings Account balance: ₹" + savingsAccount.getBalance());

        scanner.close();
    }

    private static void manageAccount(Account account, String accountType, Scanner scanner) {

        int ch = 0;
        while(ch != 4)
        {
            System.out.println("\nManaging " + accountType);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Back to main menu");
            System.out.print("Enter your choice: ");

            ch = scanner.nextInt();

            try {
                switch (ch) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.bankDeposit(depositAmount);
                        System.out.println("₹" + depositAmount + " successfully credited to your account.");
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                        System.out.println("₹" + withdrawalAmount + " successfully debited from your account.");
                        System.out.println("Balance: ₹" + account.getBalance());
                        break;

                    case 3:
                        System.out.println(accountType + " balance: ₹" + account.getBalance());
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Something Went Wrong! : " + e.getMessage());
            }
        }

    }
}


interface Account {
    void bankDeposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void bankDeposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void bankDeposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}