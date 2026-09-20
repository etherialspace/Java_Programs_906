class Vehicle {
    void run() {
        System.out.println("Vehicle is running");

    }
}

// overriding an function within a class
class Bike2 extends Vehicle {
    void run() {
        System.out.println("Bike is running Safely");
    }

    public static void main(String args[]) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}