class Vehicle {
  String brand = "Ford";

  void honk (){
    System.out.println("Tuut , Tuut!");
  }
}

class Car extends Vehicle {
  String modelName = "Mustang";

  void showDetails(){
    System.out.println("Brand Name: " + brand + "| Model: " + modelName);
  }
}


public class Example2 {
  public static void main(String[] args) {
    Car c = new Car();
    c.honk();
    c.showDetails();
  }
  
}
