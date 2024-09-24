package Models;

import Landscape.Terrain;

public class RoverManager {
    private static RoverManager instance;
    private Rover rover;

    private RoverManager() {}

    public static RoverManager getInstance() {
        if (instance == null) {
            instance = new RoverManager();
        }
        return instance;
    }

    public void initializeRover(int x, int y, Direction direction, Terrain terrain) {
        rover = new Rover(x, y, direction, terrain);
    }

    public Rover getRover() {
        return rover;
    }
}
