package Exercise_1.Behavioural.observer;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer mobileDisplay = new MobileDisplay();
        Observer desktopDisplay = new DesktopDisplay();

        weatherStation.addObserver(mobileDisplay);
        weatherStation.addObserver(desktopDisplay);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new temperature: ");
        float temperature = scanner.nextFloat();
        weatherStation.setTemperature(temperature);
    }
}