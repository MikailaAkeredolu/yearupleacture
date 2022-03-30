package products;

public abstract class Vehicle extends Product{

    private int qty;
    private double price;

    public Vehicle(String name, int qty, double price ) {
        super(name);
        this.qty = qty;
        this.price = price;

    }

    abstract void calcTotal();

    public static void printVehicleName(Vehicle vehicle){
        System.out.println(vehicle.getName());
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
