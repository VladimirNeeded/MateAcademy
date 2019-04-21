package Homework10;
import Homework10.RobotConnection;

public class TestRobot {
    public static void main(String[] args) {

        RobotConnectionManager robotConnectionManager = new Robot(true);
        moveRobot(robotConnectionManager, 5, 5);
    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean isMove = false;
        for (int i = 0; i < 3 && !isMove; i++){
            try(RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                isMove = true;
            }catch (RobotConnectionException e){
                if (i == 2) {
                    throw new RobotConnectionException("Подключение не удалось");
                }
            }
        }
    }
}