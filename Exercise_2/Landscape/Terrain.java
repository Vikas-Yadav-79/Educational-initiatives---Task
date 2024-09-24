package Landscape;

import java.util.*;

import Models.Rover;

public class Terrain {
    private int width, height;
    private Set<Obstacle> obstacles;

    public Terrain(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new HashSet<>();
    }

    public void addObstacle(int x, int y) {
        obstacles.add(new Obstacle(x, y));
    }

    public boolean isObstacle(int x, int y) {
        return obstacles.contains(new Obstacle(x, y));
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    // New method to visualize the grid with the rover and obstacles
    public void printGrid(Rover rover) {
        for (int y = height - 1; y >= 0; y--) {  // Print from top to bottom
            for (int x = 0; x < width; x++) {
                if (rover.getX() == x && rover.getY() == y) {
                    System.out.print(" R ");  // Rover position
                } else if (isObstacle(x, y)) {
                    System.out.print(" O ");  // Obstacle
                } else {
                    System.out.print(" . ");  // Empty space
                }
            }
            System.out.println();
        }
        System.out.println();  // Blank line after grid
    }
}
