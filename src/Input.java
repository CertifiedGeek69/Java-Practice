import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Input {
    public static void main(String[] args) {
        
        LocalDateTime datetime=LocalDateTime.now();
        
        System.out.println("Before formatting:"+datetime);

        DateTimeFormatter formater=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDate=datetime.format(formater);
        System.out.println("After formatting:"+formattedDate);
    }
}
