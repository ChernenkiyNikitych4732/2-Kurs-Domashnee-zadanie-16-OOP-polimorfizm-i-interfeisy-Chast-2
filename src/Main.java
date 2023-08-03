public class Main {
    public static void main (String[] args) {
        Car car = new Car("BMW 5-Series", 4);
        Car car2 = new Car("MERCEDES-BENZ AMG GT 4-door coupe", 4);
        Truck truck = new Truck("МАЗ", 6);
        Truck truck2 = new Truck("MAN", 8);
        Bicycle bicycle = new Bicycle("Cкорость", 2);
        Bicycle bicycle2 = new Bicycle("Вихрь", 2);

        Serviceable car1 = new Car("Mercedes-Benz AMG GT 4-door coupe", 4);

        Serviceable truck1 = new Truck("MAN", 6);

        Serviceable station = new Serviceable() {
            @Override
            public void service() {

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
        };
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);
    }
}