package Homework10;

public class Robot implements RobotConnection, RobotConnectionManager{
    private boolean isConnect = false;
    private int coordinateX = 0;
    private int coordinateY = 0;
    private boolean canConnect;

    public Robot(boolean canConnect) {
        this.canConnect = canConnect;
    }

    public boolean isConnect() {
        return isConnect;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    @Override
    public void moveRobotTo(int x, int y) throws RobotConnectionException {
        if (this.isConnect == true){
            coordinateX += x;
            coordinateY +=y;
            return;
        }
        throw new RobotConnectionException("Робот не подключен");
    }

    @Override
    public void close() {
    }

    @Override
    public RobotConnection getConnection() throws RobotConnectionException {
        if (this.canConnect == true){
            this.isConnect = true;
            return this;
        }
        throw new RobotConnectionException("Подключение не удалось. Отказано в доступе");
    }
}