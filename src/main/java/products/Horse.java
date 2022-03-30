package products;

public class Horse extends Vehicle implements IRideable{


    public Horse(String name, int qty, double price) {
        super(name, qty, price);
    }

    @Override
    public void printExperience(){
        System.out.println("Rides Roughly");
    }

    @Override
    public void calcTotal(){
        System.out.println(this.getPrice() * this.getQty());
    }

}
