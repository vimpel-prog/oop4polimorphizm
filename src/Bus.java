public class Bus extends Car implements Competing {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Автобус начал движение");
    }

    @Override
    void finishMoving() {
        System.out.println("Атобус остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус приехал на ПитСтоп");
    }

    @Override
    public int bestLapTime() {
        return 30;
    }

    @Override
    public int maxSpeed() {
        return 120;
    }

}
