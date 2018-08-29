package spring.JavaBase.Exceptions.RobotNewVersion;

class RobotMoving {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        for (int i = 0; i < 3; i++) {
            try {
                try (RobotConnection connection = robotConnectionManager.getConnection()) {
                    connection.moveRobotTo(toX, toY);
                    i = 3;
                } catch (RobotConnectionException e) {
                    if (i == 2) {
                        throw e;
                    } else {
                        continue;
                    }
                }
            }
            catch (RobotConnectionException e) {
                if (i != 3) {
                    throw e;
                }
            }
        }
    }
}