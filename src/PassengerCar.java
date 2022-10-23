public class PassengerCar extends Car implements Competing {
    public PassengerCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Машина начала движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Машина остановилась");
    }

    @Override
    public void pitStop() {
        System.out.println("Машина приехала на ПитСтоп");
    }

    @Override
    public int bestLapTime() {
        return 20;
    }

    @Override
    public int maxSpeed() {
        return 190;
    }
}
