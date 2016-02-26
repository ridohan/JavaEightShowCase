import java.util.StringJoiner;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class StringShowcase {

    public static void showcaseJDKSeven() {
        String test = "Hello";
        String test2 = "World";
        String test3 = test + " " + test2;
        System.out.println(test3);

        // OU

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println(stringBuilder.toString());
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
