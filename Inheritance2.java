class Animal {
  String name = "dog";

  void eat() {
    System.out.println("Animal is Eating Food");

  }
}

class Dog extends Animal {
  void bark(){
    System.out.println("Dog Barks");
  }

}

public class Inheritance2 {
  public static void main(String[] args) {
    Dog d = new Dog();
    System.out.println(d.name);

    d.eat();
    d.bark();
    
  }
  

  

}

