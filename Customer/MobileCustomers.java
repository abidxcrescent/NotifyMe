package Customer;

import Product.Products;

public class MobileCustomers implements Customers {

    String email;
    Products products;

    public MobileCustomers(String email, Products products) {
        this.email = email;
        this.products = products;
    }

    @Override
    public void update() {
        //Business logic which sends an email.
        System.out.println("Email sent to " + email);
        System.out.println("Product is now available and remaining quantity is " + products.get());
    }
}
