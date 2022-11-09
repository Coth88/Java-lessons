package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions box = new Dimensions(3, 4, 7);
        System.out.println(box);
        box = box.setLength(13);
        box = box.setWidth(8);
        CargoInfo cargo = new CargoInfo(box, 3, "Lenina 120", "Da",
            "12SD435HJ143", "Da");

        System.out.println(cargo);
        cargo = cargo.setWeight(15);
        System.out.println(cargo);


    }
}
