package Homework10;
import Homework10.RobotConnection;

public class TestRobot {
    public static void main(String[] args) {

        RobotConnectionManager robotConnectionManager = new Robot(true);
        moveRobot(robotConnectionManager, 5, 5);
    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {
        RobotConnection robotConnection = new Robot(true);
        try {
            robotConnectionManager.getConnection();
            robotConnection.moveRobotTo(toX, toY);
        } catch (RobotConnectionException e){
            System.out.println("Подключение не удалось");
            try {
                robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
            } catch (RobotConnectionException e2) {
                System.out.println("Подключение не удалось");
                try {
                    robotConnectionManager.getConnection();
                    robotConnection.moveRobotTo(toX, toY);
                }catch (RobotConnectionException e3){
                    System.out.println("Подключение не удалось");
                }
            }
        }

    }
}