<<<<<<< HEAD
package Basic_Class;

import java.util.*;

public class Customer {
    private int id;
    private String name;
    private final List<Account> accounts;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        this.accounts.add(acc);
    }
    public void removeAccount(Account acc) {
        this.accounts.remove(acc);
    }

    // Getters
    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public List<Account> getAccounts() { return this.accounts; }
    // Setters
    public void setId(int newId) { this.id = newId; }
    public void setName(String newName) { this.name = newName; }

}
=======
package Basic_Class;

import java.util.*;

public class Customer {
    private int id;
    private String name;
    private final List<Account> accounts;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        this.accounts.add(acc);
    }
    public void removeAccount(Account acc) {
        this.accounts.remove(acc);
    }

    // Getters
    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public List<Account> getAccounts() { return this.accounts; }
    // Setters
    public void setId(int newId) { this.id = newId; }
    public void setName(String newName) { this.name = newName; }

}
>>>>>>> 796bcbf0dcd84ce9670811981ffbd3f6d4a458d4
