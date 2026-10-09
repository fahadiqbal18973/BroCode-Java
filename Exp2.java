class Student{
  String name;
  int rollNo;
}

public class Exp2 {
  public static void main(String[] args) {
    Student s = new Student();
      s.name = "John";
      s.rollNo = 50;

      System.out.println("Name : " + s.name);
      System.out.println("Roll No: " + s.rollNo);
  }
  
}
