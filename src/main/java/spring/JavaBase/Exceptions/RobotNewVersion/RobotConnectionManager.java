package spring.JavaBase.Exceptions.RobotNewVersion;

public interface RobotConnectionManager {

    // делает попытку соединиться с роботом и возвращает
    // установленное соединение, через которое можно отдавать роботу команды.
    RobotConnection getConnection();
}
