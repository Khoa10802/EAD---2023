<<<<<<< HEAD
package Basic_Class;

public class Account {
    private int id;
    private double balance;
    public Account(int id, double bal) {
        this.id = id;
        this.balance = bal;
    }
    public boolean withdraw(double amount) {
        if (this.balance>=amount){
            this.balance -=amount;
            return true;
        }
        return false;
    }
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
    // Getters
    public int getId() { return this.id; }
    public double getBalance() { return this.balance; }
    // Setters
    public void setId(int newId) { this.id = newId; }
    public void setBalance(double newBalance) { this.balance = newBalance; }
}
=======
package Basic_Class;

public class Account {
    private int id;
    private double balance;
    public Account(int id, double bal) {
        this.id = id;
        this.balance = bal;
    }
    public boolean withdraw(double amount) {
        if (this.balance>=amount){
            this.balance -=amount;
            return true;
        }
        return false;
    }
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
    // Getters
    public int getId() { return this.id; }
    public double getBalance() { return this.balance; }
    // Setters
    public void setId(int newId) { this.id = newId; }
    public void setBalance(double newBalance) { this.balance = newBalance; }
}
>>>>>>> 796bcbf0dcd84ce9670811981ffbd3f6d4a458d4
