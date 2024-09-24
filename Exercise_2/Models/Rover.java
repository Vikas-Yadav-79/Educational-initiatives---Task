package Models;

import Landscape.Terrain;

public class Rover {
    private int x, y;
    private Direction direction;
    private Terrain terrain;

    public Rover(int x, int y, Direction direction, Terrain terrain) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.terrain = terrain;
    }

    // Move the rover forward based on the current direction
    public void moveForward() {
        int newX = x, newY = y;
        switch (direction) {
            case N: newY++; break;
            case E: newX++; break;
            case S: newY--; break;
            case W: newX--; break;
        }
        if (terrain.isWithinBounds(newX, newY) && !terrain.isObstacle(newX, newY)) {
            x = newX;
            y = newY;
            System.out.println("Moved to (" + x + ", " + y + ")");
        } else {
            System.out.println("Cannot move: Obstacle or out of bounds");
        }
    }

    // Turn left
    public void turnLeft() {
        direction = direction.turnLeft();
        System.out.println("Turned left, now facing " + direction);
    }

    // Turn right
    public void turnRight() {
        direction = direction.turnRight();
        System.out.println("Turned right, now facing " + direction);
    }

    // Accessor methods to get the current x and y coordinates
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Method to get the current rover status
    public String getStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction;
    }
}
