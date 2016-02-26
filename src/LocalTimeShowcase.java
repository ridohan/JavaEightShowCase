import java.time.LocalTime;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class LocalTimeShowcase {

    public static void showcase() {
        LocalTime now = LocalTime.now();
        System.out.println(now.toString());

        LocalTime lunchTime = LocalTime.of(12, 00);

        System.out.println(lunchTime);
    }
}
