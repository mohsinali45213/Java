class BankSimulator {
  String accNum ;
  double balance;

  BankSimulator(String accNum,double balance){
    this.accNum = accNum;
    this.balance = balance;
  }

  void deposit(double amount){
    if(amount>0){
      this.balance += amount;
      System.out.println(amount +"$ deposit");
    }
  }

  void withdraw(double amount){
    if(amount>0 && amount<=this.balance){
      this.balance -= amount;
      System.out.println(amount +"$ withdraw");
    }else{
      System.out.println("Insufficient balance or invalid amount");
    }
  }
  void displayBalance(){
    System.out.println("Account Number: " + this.accNum);
    System.out.println("Current Balance: " + this.balance + "$");
  }
}

public class Bank {
  public static void main(String[] args) {
    BankSimulator account = new BankSimulator("123456789", 1000.0);
    account.displayBalance();
    
    account.deposit(500.0);
    account.displayBalance();
    
    account.withdraw(200.0);
    account.displayBalance();
    
    account.withdraw(1500.0); // Attempt to withdraw more than balance
    account.displayBalance();
  }
}
