
import java.util.Scanner;
class TwinPrime{
  static boolean isPrime(int n){
    if (n < 2)
      return false;

    for(int i = 2; i <= n/2 ; i++){
      if(n % i == 0){
        return false;
      
      }
    }
    
    return true;
  }
}

  public class Exp4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the last number: ");
      int n = sc.nextInt();

      for(int i = 2; i < n - 2; i++){
        if(TwinPrime.isPrime(i) && TwinPrime.isPrime(i + 2)){
          System.out.println("(" + i + ", " + (i + 2) + ")");
        }
      }
      
    }
  }











