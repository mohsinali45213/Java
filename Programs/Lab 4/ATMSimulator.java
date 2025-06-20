import java.util.Scanner;

class BankAccount {
  String accNum;
  double balance;

  BankAccount(String accNum, double balance) {
    this.accNum = accNum;
    this.balance = balance;
  }

  void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
      System.out.println(amount + "$ deposit");
    }
  }

  void withdraw(double amount) {
    if (amount > 0 && amount <= this.balance) {
      this.balance -= amount;
      System.out.println(amount + "$ withdraw");
    } else {
      System.out.println("Insufficient balance or invalid amount");
    }
  }

  void displayBalance() {
    System.out.println("Account Number: " + this.accNum);
    System.out.println("Current Balance: " + this.balance + "$");
  }
}

class ATM {
  Scanner scanner = new Scanner(System.in);
  double cashAvailable = 10000.0; // Initial cash in ATM
  BankAccount account;

  void startSession(BankAccount account) {
    System.out.println("Enter your pin:");
    String pin = scanner.nextLine();
    if (account == null || pin.isEmpty()) {
      System.out.println("Invalid account or pin.");
      return;
    }
    while (true) {
      System.out.println("Select an option:");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          account.displayBalance();
          break;
        case 2:
          System.out.println("Enter deposit amount:");
          double depositAmount = scanner.nextDouble();
          account.deposit(depositAmount);
          break;
        case 3:
          System.out.println("Enter withdrawal amount:");
          double withdrawAmount = scanner.nextDouble();
          account.withdraw(withdrawAmount);
          break;
        case 4:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}

public class ATMSimulator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter account number:");
    String accNum = scanner.nextLine();
    System.out.println("Enter initial balance:");
    double initialBalance = scanner.nextDouble();

    BankAccount account = new BankAccount(accNum, initialBalance);
    ATM atm = new ATM();
    atm.startSession(account);
    
    scanner.close();
  }
}
