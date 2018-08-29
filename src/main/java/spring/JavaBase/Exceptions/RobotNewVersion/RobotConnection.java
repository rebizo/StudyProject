package spring.JavaBase.Exceptions.RobotNewVersion;

public interface RobotConnection extends AutoCloseable {

    void moveRobotTo(int x, int y); // команда на перемещение в заданную точку
    @Override
    void close();
}
