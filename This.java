class Laptop{
  String brand;
  int price;

  Laptop(String brand , int price){
    this.brand = brand;
    this.price = price;
  }
  void display(){
    System.out.println("Brand: " + brand + " | Price: " + price);
  }
}


public class This {
  public static void main(String[] args) {
    Laptop L1 = new Laptop("Dell", 1000);
    L1.display();
  }
}
