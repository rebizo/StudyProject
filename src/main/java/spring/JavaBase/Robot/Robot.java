package spring.JavaBase.Robot;

import spring.Numbers.FindMax;
import static spring.JavaBase.Robot.Robot.Direction.*;

public class Robot extends FindMax{

    int x = 0;
    int y = 0;
    Direction direction = UP;

    public Robot(int i, int i1, Direction up) {
    }

    Direction getDirection() { // текущее направление взгляда
        return direction;
    }

    int getX() { // текущая координата X
        return x;
    }

    int getY() {// текущая координата Y
        return y;
    }

    public void turnLeft() { // повернуться на 90 градусов против часовой стрелки

        if (direction == UP) {
            this.direction = LEFT;
            return;
        }

        if (direction == LEFT) {
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == RIGHT) {
            this.direction = UP;
            return;
        }

        if (direction == Direction.DOWN) {
            this.direction = LEFT;
        }
    }

    void turnRight() {// повернуться на 90 градусов по часовой стрелке

        if (direction == Direction.DOWN) {
            this.direction = RIGHT;
            return;
        }

        if (direction == LEFT) {
            this.direction = UP;
            return;
        }

        if (direction == RIGHT) {
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == UP) {
            this.direction = RIGHT;
            return;
        }
    }

    void stepForward() {// шаг в направлении взгляда // за один шаг робот изменяет одну свою координату на единицу

        if (direction == UP) {
            y++;
        }

        if (direction == Direction.DOWN) {
            y--;
        }

        if (direction == LEFT) {
            x--;
        }

        if (direction == RIGHT) {
            x++;
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    private static void moveRobot(Robot robot, int toX, int toY) {

        int tX = robot.getX();
        int tY = robot.getY();

        if (tX>=toX) {
            while (robot.getDirection() != Direction.LEFT)
            {robot.turnRight();}
            while (tX != toX) {
                robot.stepForward();
                tX--;
            }
        }

        else {
            while (robot.getDirection() != Direction.RIGHT)
            {robot.turnRight();}
            while (tX != toX) {
                robot.stepForward();
                tX++;
            }
        }

        if (tY>=toY) {
            while (robot.getDirection() != Direction.DOWN)
            {robot.turnRight();}
            while (tY != toY) {
                robot.stepForward();
                tY--;
            }
        }

        else {
            while (robot.getDirection() != Direction.UP)
            {robot.turnRight();}
        while (tY != toY) {
            robot.stepForward();
            tY++;
        }
        }

/*              while (robot.getDirection() != Direction.RIGHT)
                robot.turnRight();
                while (robot.getX() < toX) robot.stepForward();
                robot.turnRight();
                while (robot.getY() > toY) robot.stepForward();
                robot.turnRight();
                while (robot.getX() > toX) robot.stepForward();
                robot.turnRight();
                while (robot.getY() < toY) robot.stepForward();*/

    }

    public static class Main {
        public static void main(String[] args) {
           Robot robot = new Robot(0, 0, Direction.DOWN);
           moveRobot(robot, 7, 22);
        }
    }
}