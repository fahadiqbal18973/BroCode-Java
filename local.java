class Demo{
  int x;

  void show() {
    int y;
    System.out.println(x);
  }
}
public class local {
  public static void main(String[] args) {
    Demo d = new Demo();
    d.show();
  }
  
}
