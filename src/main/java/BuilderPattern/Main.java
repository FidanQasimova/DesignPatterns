package BuilderPattern;
public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setModel("Mercedes")
                .setColor("Black")
                .setYear(2024)
                .build();
        System.out.println(car);
    }
}
