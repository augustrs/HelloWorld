import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HelloWorld {
    public static  void main(String[] args) {
        System.out.println("Hello World\nHello dat23D");
        System.out.println("Hello World" + " Hello dat23D");
        System.out.println("Dette er årstal: "+ 23+1);
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());

        LocalDateTime TodayTime = LocalDateTime.now();
        System.out.println(TodayTime);
        System.out.println(TodayTime);
    }
}
