package ru.skillbox;


public class Main {

    public static void main(String[] args) {
        Cpu cpu1 = new Cpu(3800, 2, CPUVendor.Intel, 120);
        Cpu cpu2 = new Cpu(3100, 4, CPUVendor.AMD, 123);
        Ram ram1 = new Ram(RAMType.DDR3, 8192, 90);
        Ram ram2 = new Ram(RAMType.DDR4, 4096, 80);
        HardDisk hard1 = new HardDisk(HardDiskType.SSD, 256, 320);
        HardDisk hard2 = new HardDisk(HardDiskType.HDD, 500, 730);
        Display display1 = new Display(15, DisplayType.IPS, 650);
        Display display2 = new Display(17, DisplayType.TN, 920);
        Keyboard keyboard1 = new Keyboard(KeybordType.MEMBRANE, KeyboardBacklight.YES, 340);
        Keyboard keyboard2 = new Keyboard(KeybordType.MECHANICAL, KeyboardBacklight.NO, 390);
        Computer computer1 = new Computer(cpu1, ram1, hard1, display1, keyboard1);
        System.out.println(computer1.toString());
        System.out.println();
        System.out.println("Общий вес равен: " + computer1.totalWeight());
        System.out.println();
        Computer computer2 = new Computer(cpu2, ram2, hard2, display2, keyboard2);
        System.out.println(computer2.toString());
        System.out.println();
        System.out.println("Общий вес равен: " + computer2.totalWeight());
        System.out.println();
        Computer computer3 = new Computer(cpu1, ram2, hard1, display1, keyboard2);
        System.out.println(computer2.toString());
        System.out.println();
        System.out.println("Общий вес равен: " + computer3.totalWeight());
        System.out.println();

    }
}
