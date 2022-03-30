package products;

public class MotorBike extends Vehicle implements IRideable{


    public MotorBike(String name, int qty, double price) {
        super(name, qty, price);
    }

    @Override
    public void calcTotal(){
        System.out.println(this.getPrice() * this.getQty());
    }

    @Override
    public void printExperience() {
        System.out.println("Rides Smoothly");
    }
}
