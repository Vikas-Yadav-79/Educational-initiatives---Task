package Exercise_1.Behavioural.observer;

public class MobileDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Mobile Display: Current Temperature = " + temperature + "°C");
    }
}