public abstract class Car {
    String brand;
    String model;
    float engineVolume;

    public Car(String brand, String model, float engineVolume) {
        this.brand = validValue(brand);
        this.model = validValue(model);
        this.engineVolume = Math.max(engineVolume, 1f);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    abstract void startMoving();

    abstract void finishMoving();

    private String validValue(String value) {
        return value != null && !value.isBlank() ? value : "default";
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
