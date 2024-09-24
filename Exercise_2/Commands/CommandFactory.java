package Commands;

import Models.Rover;

public class CommandFactory {
    public static Command createCommand(char commandType, Rover rover) {
        switch (commandType) {
            case 'M':
                return new MoveForwardCommand(rover);
            case 'L':
                return new TurnLeftCommand(rover);
            case 'R':
                return new TurnRightCommand(rover);
            default:
                throw new IllegalArgumentException("Invalid command type: " + commandType);
        }
    }
}