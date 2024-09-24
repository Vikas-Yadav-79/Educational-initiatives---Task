package Exercise_1.Structural.decorator;


// A Concrete Decorator (adds milk to coffee)
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 10.0; // Adding cost for milk
    }
}
