import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class LocalDateShowcase {

    public static void showcase() {

        LocalDate now = LocalDate.now();
        LocalDate nationalDay = LocalDate.of(1789, Month.JULY, 14);

        Period p = nationalDay.until(now);

        System.out.println("# years = " + p.getYears());
        System.out.println("# months = " + p.getMonths());
    }

    public static void showcaseTwo() {
        LocalDate now = LocalDate.now();
        LocalDate nationalDay = LocalDate.of(1789, Month.JULY, 14);

        // Ou récupère directement une unité
        long years = nationalDay.until(now, ChronoUnit.YEARS);
        long months = nationalDay.until(now, ChronoUnit.MONTHS);
        System.out.println("# years = " + years);
        System.out.println("# months = " + months);

        // Trouver dans le futur ou le passé une date
        LocalDate nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextMonday.toString());
    }
}
