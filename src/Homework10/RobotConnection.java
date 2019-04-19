package Homework10;

public interface RobotConnection extends AutoCloseable {
    public void moveRobotTo(int x, int y);

    @Override
    public void close();
}
