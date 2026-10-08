class BankAccount {
  private double balance;

  public void setBalance(double amount){
    if(amount > 0) {
      this.balance = amount;
      System.out.println("Balance Successfully Updated");

    }
    else {
      System.out.println("Invalid amount! Balance cant be negative");
    }
  }
  public double getBalance(){
    return this.balance;
  }
}




public class Encapsulation {
  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();

    myAccount.setBalance(15000);
    System.out.println("Current Balance : Rs. " + myAccount.getBalance());
    myAccount.setBalance(-500);
  }
}
