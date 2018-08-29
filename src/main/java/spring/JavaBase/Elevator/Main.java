package spring.JavaBase.Elevator;

import static spring.JavaBase.Elevator.Elevator.moving;

public class Main {

    public static void main(String[] args) {
        Elevator elevator = new Elevator(2);
        moving(elevator, 8);
    }
}
