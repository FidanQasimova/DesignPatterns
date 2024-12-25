package PrototypePattern;
public class Main {
    public static void main(String[] args) {
        try{
            Book originalBook = new Book();
            originalBook.setTitle("Original Book");
            Book clonedBook = (Book) originalBook.clone();
            clonedBook.setTitle("Klonlanmış Book");
            System.out.println("Original Book Title: " + originalBook.getTitle());
            System.out.println("Klonlanmış Book Title: " + clonedBook.getTitle());
        } catch (RuntimeException | CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }{
        }
    }
}