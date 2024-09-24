package Exercise_1.Structural.decorator;

public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double cost() {
        return 50.0; // Base cost for basic coffee
    }
}
