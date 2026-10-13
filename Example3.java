class Phone{

  void makeCall() {
    System.out.println("Hello , Call is coming");

  }
}
  class smartPhone extends Phone { 

    void camera() {
      System.out.println("Camera is Capturing images ");
    }

  }

  public class Example3 {
    public static void main(String[] args) {
      smartPhone myPhone = new smartPhone();

      myPhone.makeCall();
      myPhone.camera();
    }
  }

