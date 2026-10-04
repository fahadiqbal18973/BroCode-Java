class Mobile {
    String modelName;
    int storage;

    Mobile(String name, int gb) {
        modelName = name;
        storage = gb;
    }

    void showDetails() {
        System.out.println("Model: " + modelName + " | Storage: " + storage + "GB");
    }
}

public class MobileTest {
    public static void main(String[] args) {
        Mobile phone1 = new Mobile("iPhone16", 128);
        Mobile phone2 = new Mobile("Samsung S26", 256);

        phone1.showDetails();
        phone2.showDetails();
    }
}