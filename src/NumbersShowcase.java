import java.util.StringJoiner;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class NumbersShowcase {

    public static void showcase() {
        long max = Long.max(1L, 2L);
        System.out.println(max);

        long min = Long.min(1L, 2L);
        System.out.println(max);

        long sum = Long.sum(1L, 2L);
        System.out.println(sum);
    }

    public static void showcaseJDKEight() {
        StringJoiner sj = new StringJoiner(", ");
        sj.add("Hello").add("World");

        System.out.println(sj.toString());

        StringJoiner sjWithSufandPrefixes = new StringJoiner(", ", "{", "}");
        sjWithSufandPrefixes.add("Hello").add("World");

        System.out.println(sjWithSufandPrefixes.toString());
    }

}
