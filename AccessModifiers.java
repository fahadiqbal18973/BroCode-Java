
class SecuritySystem{
  private String secretPin = "1234";
  int balance = 500000;
  protected String bankName = "SBI";
  public String accountHolderName = "Fahad Iqbal";
  void showData() {
    System.out.println(secretPin);
  }
}

public class AccessModifiers {
  public static void main(String[] args) {
    SecuritySystem obj = new SecuritySystem();
    System.out.println("Account Balance: " + obj.balance);
    System.out.println("Bank Name: " + obj.bankName);
    System.out.println("Account Holder Name: " + obj.accountHolderName);
  } 

}

