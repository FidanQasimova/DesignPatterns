package AbstactFactoryPattern;

public class BMWfactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }

    @Override
    public Engine createEngine() {
        return new V6Engine();
    }
}
