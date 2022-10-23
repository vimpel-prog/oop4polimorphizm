public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Ikarus", "b-52", 2.4f);
        Bus bus2 = new Bus("Ikarus", "b-55", 2.6f);
        Bus bus3 = new Bus("Ikarus", "b-57", 2.1f);
        Bus bus4 = new Bus("Ikarus", "b-59", 2.8f);

        Truck truck1 = new Truck("Kamaz", "A3", 3.2f);
        Truck truck2 = new Truck("Kamaz", "A3", 3.1f);
        Truck truck3 = new Truck("Kamaz", "A3", 3.8f);
        Truck truck4 = new Truck("Kamaz", "A3", 3.6f);

        PassengerCar passengerCar1 = new PassengerCar("BMW", "X7", 3.2f);
        PassengerCar passengerCar2 = new PassengerCar("BMW", "X5", 3.0f);
        PassengerCar passengerCar3 = new PassengerCar("BMW", "X4", 3.6f);
        PassengerCar passengerCar4 = new PassengerCar("BMW", "X3", 3.3f);

        DriverB driver1 = new DriverB<>("Petrov Petr Petrovic", true, 20);
        DriverC driver2 = new DriverC<>("Ivanov Ivan Ivanovic", true, 25);
        DriverD driver3 = new DriverD<>("Sidorov Sidor Sidorovic", true, 15);

        driver3.infoDriverAndCar(bus1);
        driver2.infoDriverAndCar(truck2);
        driver1.infoDriverAndCar(passengerCar3);
    }
}