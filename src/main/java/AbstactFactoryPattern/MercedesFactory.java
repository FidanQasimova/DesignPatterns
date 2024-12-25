package AbstactFactoryPattern;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mercedes();
    }

    @Override
    public Engine createEngine() {
        return new V8Engine();
    }
}
