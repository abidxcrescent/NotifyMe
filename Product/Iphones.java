package Product;

import Customer.Customers;

import java.util.ArrayList;
import java.util.List;

public class Iphones implements Products {

    public int quantity = 0;

    List<Customers> customers = new ArrayList<>();

    @Override
    public void addition(Customers customer) {
        customers.add(customer);
    }

    @Override
    public void remove(Customers customer) {
        customers.remove(customer);
    }

    @Override
    public void notification() {
        for(Customers customer : customers) {
            customer.update();
        }
    }

    @Override
    public void set(int newStock) {

        if(newStock != quantity && quantity == 0) {
            quantity = newStock;
            notification();
        }

    }

    @Override
    public int get() {
        return quantity;
    }
}
