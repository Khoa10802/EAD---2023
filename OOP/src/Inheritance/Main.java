package Inheritance;

public class Main {
    public static void main(String[] args) {

        FBProduct product1 = new FBProduct();
        ElectronicProduct product2 = new ElectronicProduct();

        product1.setId(1);
        product1.setName("Dr Thanh tea");

        product1.productInfo();
        product2.productInfo();
    }
}
