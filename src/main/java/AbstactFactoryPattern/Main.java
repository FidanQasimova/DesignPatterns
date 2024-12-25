package AbstactFactoryPattern;
public class Main {
    public static void main(String[] args) {
        CarFactory bmwFactory = new BMWfactory();
        Car bmwCar = bmwFactory.createCar();
        Engine bmwEngine = bmwFactory.createEngine();
        bmwCar.model();
        bmwEngine.engineType();

        CarFactory mercedesFactory = new MercedesFactory();
        Car mercedesCar = mercedesFactory.createCar();
        Engine mercedesEngine = mercedesFactory.createEngine();
        mercedesCar.model();
        mercedesEngine.engineType();
    }
}

