import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("EEE,MMM dd,yyyy");

        LocalDate date=LocalDate.now();
        
        System.out.println("Date : "+date.format(format1));
        System.out.println("Date : "+date.format(format2));
        System.out.println("Date : "+date.format(format3));        
    }
}
