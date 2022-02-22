import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {

        Book book = new Book("EGO IS THE ENEMY", 79.99, "RYAN HOLIDAY");
        Magazine magazine =  new Magazine("The Magpi", 2.63, LocalDate.of(2022, 1, 1) , "Raspberry Pi Ltd");
        Newspaper newspaper = new Newspaper("Daily Graphic", 1.95, LocalDate.of(2022, 2, 22), "Daily Graphic Ltd");

        System.out.println(book);
        System.out.println(magazine);
        System.out.println(newspaper);
    }

}
