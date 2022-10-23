public class Truck extends Car implements Competing {
    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Грузовик закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик приехал на ПитСтоп");
    }

    @Override
    public int bestLapTime() {
        return 40;
    }

    @Override
    public int maxSpeed() {
        return 90;
    }
}
