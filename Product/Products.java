package Product;

import Customer.Customers;

public interface Products {

    public void addition(Customers customer);
    public void remove(Customers customer);
    public void notification();
    public void set(int newStock);
    public int get();

}
