package Car.Inventory;

public class Truck extends Car {
    public Truck(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    private double towingCapacity;

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public void getInfo() {
        System.out.printf("""
                        This truck has the following properties:
                        %s the Vin number of the car
                        %s the year it has been created
                        %s as the model of this vehicle
                        %d current total mileage.
                        %f is the towing capacity \s\n""",
                getVinNumber(),
                getMake(),
                getModel(),
                getMileage(),
                getTowingCapacity());
    }
}
