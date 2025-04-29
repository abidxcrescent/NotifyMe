package Test;

import Customer.MobileCustomers;
import Product.Iphones;

public class Main {

    public static void main(String[] args) {

        Iphones iphones = new Iphones();

        MobileCustomers m1 = new MobileCustomers("abid@yz.com",iphones);
        MobileCustomers m2 = new MobileCustomers("rafe@yz.com",iphones);
        MobileCustomers m3 = new MobileCustomers("sarfaraaz@yz.com",iphones);

        iphones.addition(m1);
        iphones.addition(m2);
        iphones.addition(m3);

        iphones.set(10);

        System.out.println("End");

    }
}
