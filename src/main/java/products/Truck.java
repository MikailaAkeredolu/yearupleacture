package products;

public class Truck extends Vehicle{


    public Truck(String name, int qty, double price) {
        super(name, qty, price);
    }

    @Override
    public void calcTotal(){
        System.out.println(this.getPrice() * this.getQty());
    }
}
