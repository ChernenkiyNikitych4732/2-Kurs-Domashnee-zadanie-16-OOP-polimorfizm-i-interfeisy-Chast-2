public interface Serviceable {
    void service();

    void check(Car car);

    void check(Truck truck);

    void check(Bicycle bicycle);
}