abstract class Animal {
    Animal() {
        System.out.println("Animal obj is created\n--------------------");
    }
    abstract void run();
}
class horse extends Animal {
    horse() {
        System.out.println("Horse obj is created\n--------------------");
    }
    void run() {
        System.out.println("Horse is running");
    }
}
public class demo{
    public static void main(String[] args) {
        horse h = new horse();
        h.run();
    }
}