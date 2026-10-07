class Demo{
  // Static initiializer block
  static {
    System.out.println("Static block is invoked");  
}
// Instance Initalizatiion block
{
  System.out.println("Instance block is invoked");
}
// Constructor
  Demo(){
    System.out.println("Constructor is invoked");
  }
}

public class Day7 {
  public static void main(String[] args) {
    System.out.println("Main method is invoked");
    System.out.println("Creating first object");
    Demo d1 = new Demo();

    System.out.println("Creating second object");
    Demo d2 = new Demo();
  }
  
}













