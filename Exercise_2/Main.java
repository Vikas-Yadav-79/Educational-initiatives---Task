import Commands.Command;
import Commands.CommandFactory;
import Models.Direction;
import Models.RoverManager;
import Landscape.Terrain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Terrain setup
        System.out.print("Enter terrain width and height: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        Terrain terrain = new Terrain(width, height);

        System.out.print("Enter number of obstacles: ");
        int obstacleCount = scanner.nextInt();
        for (int i = 0; i < obstacleCount; i++) {
            System.out.print("Enter obstacle position (x, y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            terrain.addObstacle(x, y);
        }

        // Rover setup
        System.out.print("Enter rover starting position (x, y) and direction (N, E, S, W): ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        String directionStr = scanner.next().toUpperCase();
        Direction direction = Direction.valueOf(directionStr);

        RoverManager roverManager = RoverManager.getInstance();
        roverManager.initializeRover(startX, startY, direction, terrain);

        // Print the initial grid
        System.out.println("Initial grid:");
        terrain.printGrid(roverManager.getRover());

        // Command input loop
        while (true) {
            System.out.print("Enter command sequence (M, L, R): ");
            String commands = scanner.next().toUpperCase();

            for (char commandType : commands.toCharArray()) {
                try {
                    Command command = CommandFactory.createCommand(commandType, roverManager.getRover());
                    command.execute();

                    // Print the updated grid after each command execution
                    System.out.println("Updated grid:");
                    terrain.printGrid(roverManager.getRover());

                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid command: " + commandType);
                }
            }

            System.out.println(roverManager.getRover().getStatus());

            System.out.print("Continue (y/n)? ");
            if (scanner.next().equalsIgnoreCase("n")) {
                break;
            }
        }
        scanner.close();
    }
}
