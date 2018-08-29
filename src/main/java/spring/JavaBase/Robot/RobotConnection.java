/*
package spring.JavaBase.Robot;

public class RobotConnection {
    //Exception exception = new Exception();

    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close();
}

interface RobotConnectionManager {
    RobotConnection getConnection();
}

class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);
    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for(int count = 0;  count < 3; count++) {
            if (count < 2) {
                try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                    robotConnection.moveRobotTo(toX, toY);
                    return;
                } catch (RobotConnectionException e) {
                    //ignore
                } catch (Exception error) {
                    throw error;
                }
            } else { // мы на третьей попытке
                RobotConnection robotConnection = robotConnectionManager.getConnection();
                try {
                    robotConnection.moveRobotTo(toX, toY);
                } catch (RobotConnectionException e) {

                    // обрабатываем исключение, которые выбрасывает close

                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException e2) {
                        // пропускаем исключение
                    }
                    throw e;
                } catch (Exception error) {
                    throw error;
                }

                // обрабатываем исключение, которые выбрасывает close

                try {
                    robotConnection.close();
                } catch (RobotConnectionException e3) {
                    // пропускаем исключение
                }

                return;
            }

        }
    }

*/
