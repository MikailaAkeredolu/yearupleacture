package products;

public class PlayGround {
    public static void main(String[] args) {

        Vehicle car = new Car("Benz", 20, 1000.0);
        Vehicle horse = new Horse("Ryan", 10, 500.0);
        Vehicle motorBike = new MotorBike("Suzuki", 4, 10.0);
        Vehicle truck = new Truck("GM", 20, 30);

        Vehicle.printVehicleName(horse);

        Vehicle[] vehicles = {car, horse, motorBike, truck};

        for (Vehicle vehicle: vehicles) {
             vehicle.calcTotal();
        }


    }
}
