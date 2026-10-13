class Person {
  String name;
  int age;

  void introduce() {
    System.out.println("My name is " + name + " and I am " + age + " years old.");
  }
}

class Student extends Person {
  String school;

  void study() {
    System.out.println("My name is " + name + ", I am " + age + " years old, and I study at " + school + ".");
  }
}









public class inheritance {
  public static void main(String[] args) {
    Student s = new Student();
    s.name = "Fahad";
    s.age = 19;
    s.school = "Integral University";
    s.study();
    s.introduce();
  
}
}