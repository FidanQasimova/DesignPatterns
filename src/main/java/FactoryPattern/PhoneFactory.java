package FactoryPattern;

public class PhoneFactory {
    public Phone getPhone(String phoneType) {
        if (phoneType == null) {
            return null;
        }

        if (phoneType.equalsIgnoreCase("iPhone")) {
            return new Apple();
        } else if (phoneType.equalsIgnoreCase("Samsung")) {
            return new Android();
        }

        return null;
    }
}
