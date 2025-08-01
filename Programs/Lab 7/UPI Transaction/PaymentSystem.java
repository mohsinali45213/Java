interface Transaction {
  boolean validate(double amount);
}

interface OnlinePayment extends Transaction {
  void pay(double amount);
}

class UPI implements OnlinePayment {
  private String UPIId;

  public UPI(String UPIId) {
    this.UPIId = UPIId;
  }

  public boolean validate(double amount) {
    if (amount > 0) {
      System.out.println("Validation successfully : " + amount + " is valid");
      return true;
    } else {
      System.out.println("Validation Fail : " + amount + " is invalid");
      return false;
    }
  }

  public void pay(double amount){
    if(validate(amount)){
      System.out.println("Payment of : " + amount + " made using upi id "+ UPIId);
      receipt(amount);
    }else{
      System.out.println("Payment failed due to invalid amount");
    }
  }

  public void receipt(double amount){
    System.out.println("Receipt generated $"+amount+" paid to "+UPIId);
  }
}

public class PaymentSystem {
  public static void main(String[] args) {
    UPI payment = new UPI("user@upi");
    payment.pay(15000);
    System.out.println("--------------------");
    payment.pay(-500);
  }
}
