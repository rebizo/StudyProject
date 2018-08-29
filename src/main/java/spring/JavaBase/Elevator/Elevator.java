package spring.JavaBase.Elevator;

public class Elevator extends Door{

    private int curFloor;

    private int getcurFloor() {
        return curFloor;
    }

    public void setcurFloor(int curFloor) {
        this.curFloor = curFloor;
    }

    Elevator(int curFloor) {
        this.curFloor = curFloor;
    }

    static void moving(Elevator elevator, int needFloor) {

        int curFloor = elevator.getcurFloor();

        if (needFloor < curFloor) {
            do {curFloor--;}
            while (curFloor>needFloor);
        }
        else {
            do {curFloor++;}
            while (curFloor<needFloor);
        }

       if (curFloor == needFloor) {
            openTheDoor ();
            closeTheDoor ();
            System.out.println("Этаж верный и равен  " + curFloor);
        }
    }
}