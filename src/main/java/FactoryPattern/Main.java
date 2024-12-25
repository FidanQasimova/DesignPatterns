package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();

        Phone phone1 = phoneFactory.getPhone("iPhone");
        phone1.PhoneInformation();

        Phone phone2 = phoneFactory.getPhone("Samsung");
        phone2.PhoneInformation();
    }
}
