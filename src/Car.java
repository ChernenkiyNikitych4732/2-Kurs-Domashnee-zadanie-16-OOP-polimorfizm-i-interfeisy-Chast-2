public class Car extends TransportWithEngine {
    public Car (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
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