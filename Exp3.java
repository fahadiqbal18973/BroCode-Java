import java.util.Scanner;

class Average{
  void calculateAverage(int a, int b, int c){
    int sum = a + b + c;
    int avg = sum / 3;
    System.out.println("Average: " + avg);
  } 
}
  public class Exp3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the three numberrs: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      Average obj = new Average();
      obj.calculateAverage(a, b, c);
    }
  }

  