import java.time.LocalDate;

public class Periodical extends Publication{
    private LocalDate period;
    private String publisher;

    public Periodical(String title, Double price, LocalDate period, String publisher) {
        super(title, price);
        this.period = period;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return  super.toString()+" " +
                "period=" + period +
                ", publisher='" + publisher + '\'' ;
    }
}
