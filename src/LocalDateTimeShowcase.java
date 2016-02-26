import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class LocalDateTimeShowcase {

    public static void showcase() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());

        ZonedDateTime zonedDateTimeLondon = ZonedDateTime.of(now, ZoneId.of("Europe/London"));
        ZonedDateTime zonedDateTimeUS = ZonedDateTime.of(now, ZoneId.of("US/Pacific"));


        System.out.println(zonedDateTimeLondon);
        System.out.println(zonedDateTimeUS);
    }

    public static void showcaseFactory() {
        LocalDateTime now = LocalDateTime.now();

        ZonedDateTime zonedDateTimeLondon = ZonedDateTime.of(now, ZoneId.of("Europe/London"));


        System.out.println(DateTimeFormatter.ISO_DATE.format(zonedDateTimeLondon));
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTimeLondon));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(zonedDateTimeLondon));
    }


}
