import java.util.Scanner;
public class MDLBS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("mad Libs game");
    String adj1;
    String adj2;
    String adj3;
    String n1;
    String v1;

    System.out.println("Enter an adjective: ");
    adj1 = sc.nextLine(); 
    System.out.println("Enter another adjective: ");
    adj2 = sc.nextLine();
    System.out.println("Enter a third adjective: ");
    adj3 = sc.nextLine();
    System.out.println("Enter a noun: ");
    n1 = sc.nextLine();
    System.out.println("Enter a verb: ");
    v1 = sc.nextLine();
System.out.println("Today i went to a " + adj1 + " zoo.");
System.out.println("In an exhibit  i saw a " + n1+ ".");
System.out.println("It was " + adj2 + " and " + adj3 + ".");
System.out.println("I was " + v1 + " and had a great time.");
sc.close();

  }
}