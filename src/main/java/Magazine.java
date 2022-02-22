import java.time.LocalDate;

public class Magazine extends Periodical {


    public Magazine(String title, Double price, LocalDate period, String publisher) {
        super(title, price, period, publisher);
    }

    @Override
    public String toString() {
        return "Magazine{"+ super.toString()+
                '}';
    }



}
