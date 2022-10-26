public class Bus extends Car implements Competing {
    public enum TypeOfCapacity{
        ESPECIALLY_SMALl, SMALL, AVERAGE, LARGE, ESPECIALLY_LARGE;
        public int sits;

        public int getSits() {
            return sits;
        }

        public void setSits(int sits) {
            this.sits = Math.max(sits,1);
        }

        public TypeOfCapacity getType(TypeOfCapacity TC) {
            if (sits==0) System.out.println("Данных по авто не достаточно");
            if (TC.sits < 10) return ESPECIALLY_SMALl;
            else if (TC.sits > 10 && TC.sits <= 25) return SMALL;
            else if (TC.sits >= 40 && TC.sits <= 50) return AVERAGE;
            else if (TC.sits >=60 && TC.sits <= 80) return LARGE;
            else if (TC.sits >=100 && TC.sits <= 120) return ESPECIALLY_LARGE;
            else return null;
        }
    };
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
