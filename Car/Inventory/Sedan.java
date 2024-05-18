package Car.Inventory;

public class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public void getInfo() {
        System.out.printf("""
                        This car has the following properties:
                        %s the Vin number of the car
                        %s the year it has been created
                        %s as the model of this vehicle
                        %d current total mileage.\s\n""",
                getVinNumber(),
                getMake(),
                getModel(),
                getMileage());
    }
}
