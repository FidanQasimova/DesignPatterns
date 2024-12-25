package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();

        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println("Sayğacın dəyəri: " + counter.getCount());
    }
}