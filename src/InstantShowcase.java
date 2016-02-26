import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class InstantShowcase {

    public static void showcase() {

        Instant start = Instant.now();
        Instant end = Instant.now();

        Duration elapsed = Duration.between(start, end);

        long millis = elapsed.toMillis();

        System.out.println(millis);

        elapsed = elapsed.plus(2L, ChronoUnit.SECONDS);
        long millisAfter = elapsed.toMillis();

        System.out.println(millisAfter);
    }

}
