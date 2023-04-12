package Interface;

public class Main {
    public static void main(String[] args) {
        AccountManagerImpl ami1 = AccountManagerImpl.getInstance();
        AccountManagerImpl ami2 = AccountManagerImpl.getInstance();
        System.out.println(ami1);
        System.out.println(ami2);
    }
}
