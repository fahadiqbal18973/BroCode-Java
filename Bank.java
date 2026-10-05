class Account {
    String holderName;
    int balance;

    // 1. Pehla Constructor: Jo sirf NAAM leta hai (Zero-Balance Account)
    Account(String name) {
        this.holderName = name;
        this.balance = 0; // Default zero balance set kar diya
        System.out.println("Zero-Balance Account Khul Gaya!");
    }

    // 2. Dusra Constructor: Jo NAAM aur PAISA dono leta hai (Overloaded Constructor)
    Account(String name, int openingBalance) {
        this.holderName = name;
        this.balance = openingBalance;
        System.out.println("Savings Account Khul Gaya jisme Rs." + openingBalance + " hain!");
    }

    void showDetails() {
        System.out.println("Account Holder: " + this.holderName + " | Balance: Rs." + this.balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        
        // Java automatic pehchanega ki kaun sa constructor call karna hai!
        
        // 1. Isme sirf ek String bheji -> Toh pehla constructor chalega
        Account acc1 = new Account("Rahul"); 
        acc1.showDetails();

        System.out.println("----------------------------------------");

        // 2. Isme String aur Int dono bheje -> Toh dusra constructor chalega
        Account acc2 = new Account("Amit", 5000); 
        acc2.showDetails();
    }
}