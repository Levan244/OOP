package Skypro;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1");
        Car car1 = new Car("car2");

        Truck truck = new Truck("truck1");
        Truck truck1 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1");
        Bicycle bicycle1 = new Bicycle("bicycle2");

        Service[] transports = {
                car,
                car1,
                truck,
                truck1,
                bicycle,
                bicycle1

        };
        for (Service s : transports) {
            s.service();
            System.out.println("______________");

        }
    }
}