package Exercise_1.Creational.factory;

public class CarFactory {
    public static Car getCar(String carType) {
        if (carType.equalsIgnoreCase("sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("suv")) {
            return new SUV();
        }
        return null;
    }
}
