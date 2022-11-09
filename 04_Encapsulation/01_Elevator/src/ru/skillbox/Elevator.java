package ru.skillbox;

public class Elevator {

    private  int currentFloor = 1;
    private  int  minFloor;
    private  int maxFloor;


    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return  currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor <= minFloor || floor >= maxFloor)
            System.out.println("Ошибка: такой этаж не сущетсвует.");
          if (floor > currentFloor) {
              while (currentFloor < floor) {
                  moveUp();
                  System.out.println(currentFloor);


              }
          }
                 if (floor < currentFloor) {
                     while (floor < currentFloor) {
                         moveDown();
                         System.out.println(currentFloor);

                     }
              }
    }
}