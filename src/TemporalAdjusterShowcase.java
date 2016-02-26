import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class TemporalAdjusterShowcase {

    public static void showcase() {
        LocalDate now = LocalDate.now();
        LocalDate firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate firstDayOfNextMonth = now.with(TemporalAdjusters.firstDayOfNextMonth());
        LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(firstDayOfMonth);
        System.out.println(firstDayOfNextMonth);
        System.out.println(lastDayOfMonth);
    }
}
