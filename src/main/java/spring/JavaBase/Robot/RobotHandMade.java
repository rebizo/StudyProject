package spring.JavaBase.Robot;

public class RobotHandMade {

    public static class Robot {
        int x;
        int y;
        Direction direction = Direction.UP;

        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            System.out.println("Поворот против часовой стрелки");
            if (direction == Direction.DOWN) {
                this.direction = Direction.RIGHT;
                return;
            }

            if (direction == Direction.UP) {
                this.direction = Direction.LEFT;
                return;
            }

            if (direction == Direction.LEFT) {
                this.direction = Direction.DOWN;
                return;
            }

            if (direction == Direction.RIGHT) {
                this.direction = Direction.UP;
                return;
            }
        }

        public void turnRight() {
            System.out.println("поворот по часовой стрелке");
            if (this.direction == Direction.DOWN) {
                System.out.println("Вниз -> влево");
                this.direction = Direction.LEFT;
                return;
            }

            if (this.direction == Direction.UP) {
                System.out.println("Вверх -> вправо");
                this.direction = Direction.RIGHT;
                return;
            }

            if (this.direction == Direction.LEFT) {
                System.out.println("Влево -> вверх");
                this.direction = Direction.UP;
                return;
            }

            if (this.direction == Direction.RIGHT) {
                System.out.println("Вправо -> вниз");
                this.direction = Direction.DOWN;
                return;
            }
        }

        public void stepForward() {
            System.out.println("движение");
            if (direction == Direction.DOWN) {
                System.out.println("вниз");
                this.y--;
            }

            if (direction == Direction.UP) {
                System.out.println("вверх");
                this.y++;
            }

            if (direction == Direction.LEFT) {
                System.out.println("налево");
                this.x--;
            }

            if (direction == Direction.RIGHT) {
                System.out.println("направо");
                this.x++;
            }
        }

        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }

        private static void moveRobot(Robot robot, int toX, int toY) {

            Direction curDir = robot.getDirection();
            int curX = robot.getX();
            int curY = robot.getY();

            if (curX - toX > 0) {
                if (curDir == Direction.DOWN) {
                    robot.turnRight();
                }

                if (curDir == Direction.UP) {
                    robot.turnLeft();
                }

                if (curDir == Direction.RIGHT) {
                    robot.turnLeft();
                    robot.turnLeft();
                }

                System.out.println("x>0 started");

                do {
                    robot.stepForward();
                }
                while (robot.getX() - toX != 0);

                System.out.println("x: " + robot.x);
            } else {

                if (curDir == Direction.LEFT) {
                    robot.turnRight();
                    robot.turnRight();
                }

                if (curDir == Direction.UP) {
                    robot.turnRight();
                }

                if (curDir == Direction.DOWN) {
                    robot.turnLeft();
                }

                System.out.println("x<0 started");

                do {
                    robot.stepForward();
                }
                while (robot.getX() - toX != 0);

                System.out.println("x: " + robot.x);
            }

/////////////////////

            if (curY - toY > 0) {

                if (curDir == Direction.UP) {
                    robot.turnLeft();
                    robot.turnLeft();
                }

                if (curDir == Direction.LEFT) {
                    robot.turnLeft();
                }

                if (curDir == Direction.RIGHT) {
                    robot.turnRight();
                }

                System.out.println("y>0 started");

                do {
                    robot.stepForward();
                }
                while (robot.getY() - toY != 0);

                System.out.println("y: " + robot.y);

            } else {

                if (curDir == Direction.LEFT) {
                    robot.turnRight();
                }

                if (curDir == Direction.DOWN) {
                    robot.turnLeft();
                    robot.turnLeft();
                }

                if (curDir == Direction.RIGHT) {
                    robot.turnLeft();
                }

                System.out.println("y<0 started");

                do {
                    robot.stepForward();
                }
                while (robot.getY() - toY != 0);

                System.out.println("y: " + robot.y);
            }
        }

        public static void main(String[] args) {
            Robot robot = new Robot(-1, 1, Direction.RIGHT);
            moveRobot(robot, 5, -6);
        }
    }
}