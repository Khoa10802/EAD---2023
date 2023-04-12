<<<<<<< HEAD
package Interface;

import Singleton.DbConnection;

public class AccountManagerImpl implements AccountManager{
    public static AccountManagerImpl instance = new AccountManagerImpl();
    private AccountManagerImpl() {}
    public static AccountManagerImpl getInstance(){
        return instance;
    }
    @Override
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
    @Override
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
}
=======
package Interface;

import Singleton.DbConnection;

public class AccountManagerImpl implements AccountManager{
    public static AccountManagerImpl instance = new AccountManagerImpl();
    private AccountManagerImpl() {}
    public static AccountManagerImpl getInstance(){
        return instance;
    }
    @Override
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
    @Override
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
}
>>>>>>> 796bcbf0dcd84ce9670811981ffbd3f6d4a458d4
