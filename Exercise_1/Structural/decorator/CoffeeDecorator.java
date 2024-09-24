package Exercise_1.Structural.decorator;

// The Decorator class implements the Coffee interface and wraps around another Coffee object
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract String getDescription();
}
