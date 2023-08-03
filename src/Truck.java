public class Truck extends TransportWithEngine {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп, транспорт: " + getModelName());
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }

    @Override
    public void check(Car car) {

    }

    @Override
    public void check(Truck truck) {

    }

    @Override
    public void check(Bicycle bicycle) {

    }
}