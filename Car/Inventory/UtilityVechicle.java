package Car.Inventory;

public class UtilityVechicle extends Car {
    public UtilityVechicle(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    private boolean fourWheelDrive;

    public void setFourWheelDrive(boolean fourWheelDrive){
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean getFourWheelDrive(){
        return true;
    }

    @Override
    public void getInfo() {
        System.out.printf("""
                        This UV has the following properties:
                        %s the Vin number of the car
                        %s the year it has been created
                        %s as the model of this vehicle
                        %d current total mileage.
                        This car has 4 wheel drive %B\s\n""",
                getVinNumber(),
                getMake(),
                getModel(),
                getMileage(),
                getFourWheelDrive());

    }
}
