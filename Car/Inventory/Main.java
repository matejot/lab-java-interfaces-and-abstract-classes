package Car.Inventory;

public class Main {
    public static void main(String[] args) {

        Sedan ceed = new Sedan("1236", "2022", "Kia Ceed", 1000);
        ceed.getInfo();
        System.out.println("===========");

        UtilityVechicle sportage = new UtilityVechicle("34756", "2020", "Kia Sportage", 10000);
        sportage.setFourWheelDrive(false);
        sportage.getInfo();
        System.out.println("===========");

        Truck scania = new Truck("384657", "2016", "Scania 766", 150000);
        scania.setTowingCapacity(45);
        scania.getInfo();
        System.out.println(scania.getTowingCapacity());
    }
}
