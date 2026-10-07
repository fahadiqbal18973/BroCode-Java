// Static variable vs Instance variable


class Employee{
  String empName;
  int empId;

  static String companyName = "Google";

Employee (String name , int id){
  this.empName = name;
  this.empId = id;
}
void showDetails() {
  System.out.println("ID: " + empId + " | Name: " + empName + "| Company name: " + companyName);
    }
}

public class Day6 {
  public static void main(String[] args) {
    Employee emp1 = new Employee("Fahad" , 99);
    Employee emp2 = new Employee("Aman" , 100);

    System.out.println("Previous Details");
    emp1.showDetails();
    emp2.showDetails();

    Employee.companyName = "Facebook";
    System.out.println("New Details");
    emp1.showDetails();
    emp2.showDetails();

  }
  
}
