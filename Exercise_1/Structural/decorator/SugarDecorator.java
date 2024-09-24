package Exercise_1.Structural.decorator;

// Another Concrete Decorator (adds sugar to coffee)
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 5.0; // Adding cost for sugar
    }
}
