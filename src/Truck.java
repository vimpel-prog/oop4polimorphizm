public class Truck extends Car implements Competing {
    public enum TypeOfLoadCapacity {
        N1, N2, N3;

        public float getGrossWeight() {
            return grossWeight;
        }

        public void setGrossWeight(float grossWeight) {
            this.grossWeight = Math.max(grossWeight,1);
        }

        public float grossWeight;
        public TypeOfLoadCapacity getType(TypeOfLoadCapacity TC) {
            if(grossWeight==0) System.out.println("Данных по авто не достаточно");
            if (TC.grossWeight <= 3.5) return N1;
            else if (TC.grossWeight > 3.5 && TC.grossWeight <= 12) return N2;
            else return N3;
        }
    }

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
