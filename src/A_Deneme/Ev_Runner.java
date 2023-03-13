package A_Deneme;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ev_Runner {

    public static void main(String[] args) {

        LocalDateTime simdi = LocalDateTime.now();


String a="";

        System.out.println("date = " + simdi);
        for (int i = 0; i < 1000000; i++) {
        a+="2";
        }

        LocalDateTime sonra = LocalDateTime.now();
        System.out.println("sonra = " + sonra);
    }

}
