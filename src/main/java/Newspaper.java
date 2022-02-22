import java.time.LocalDate;

public class Newspaper extends Periodical {


   public Newspaper(String title, Double price, LocalDate period, String publisher) {
      super(title, price, period, publisher);
   }


   @Override
   public String toString() {
      return "Newspaper{" + super.toString()+
              '}';
   }
}
