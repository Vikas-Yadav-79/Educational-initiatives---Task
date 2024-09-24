package Exercise_1.Behavioural.observer;

public class DesktopDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Desktop Display: Current Temperature = " + temperature + "°C");
    }
}