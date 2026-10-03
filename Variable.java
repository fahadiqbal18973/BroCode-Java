public class Variable {
  public static void main(String[] args) {
    int age = 19;
    String name = "Fahad";
    boolean isStudent = true;
    char grade = 'A';
    double gpa = 9.76;



    System.out.println("Your name is : " + name);
    System.out.println("Your age is: " + age);
    System.out.println("You are a student: " + isStudent);
    System.out.println("Your grade is: " + grade);
    System.out.println("Your GPA is: " + gpa);
    if(isStudent){
      System.out.println("You are a student");
    }
    else{
      System.out.print("You are not a student");
    }
  }
}
