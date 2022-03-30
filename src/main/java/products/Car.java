package products;

import products.Vehicle;

public class Car extends Vehicle {

    public Car(String name, int qty, double price) {
        super(name, qty, price);
    }

    @Override
    public void calcTotal(){
        System.out.println(this.getPrice() * this.getQty());
    }
}
