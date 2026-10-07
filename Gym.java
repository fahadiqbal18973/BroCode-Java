class GymMember {
  //Instance variables
  String memberName;
  String membershipPlan;
  int memberId;


  //Static variable
  static String gymName;
  static int idCounter;


  //Static block
  static {
    gymName = "Knight's Club";
    idCounter = 1000;
    System.out.println("Gym management system is initialized");
  }  
  //Instance initialization block
  {
    memberId = idCounter++;
    this.memberId = idCounter;
    System.out.println("Member ID is generated");
  }
    //Main constructor
    GymMember(String name, String membershipPlan) {
      this.memberName = name;
      this.membershipPlan = membershipPlan;
      System.out.println("main constructor is invoked");
    }
    // Overloaded  and chained constructor
    GymMember(String name) {
      this(name, "Basic");
      System.out.println("Overloaded constructor is invoked");
    }
    void display() {
      System.out.println("Member ID: " + memberId + " | Member Name: " + memberName + " | Membership Plan: " + membershipPlan + " | Gym Name: " + gymName);
    }
  }   
  



public class Gym {
  public static void main(String[] args) {
    System.out.println("Registering first member");
    GymMember m1 = new GymMember("John Doe", "Premium");
    m1.display();
    System.out.println("Registering second member");
    GymMember m2 = new GymMember("Jane Smith");
    m2.display();
  }
  
}
