package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton.DbConnection con1 = Singleton.DbConnection.getInstance();
        Singleton.DbConnection con2 = Singleton.DbConnection.getInstance();
        System.out.println(con1);
        System.out.println(con2);
    }
}
