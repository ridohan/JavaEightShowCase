import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Altima Agency
 * Created by rkhiter on 26/02/16.
 */
public final class LambdaShowcase {

    public static void oldWayShocase() {

        List<String> heroes = Arrays.asList("Link", "Mario", "Zeratul");

        Collections.sort(heroes, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
    }

    public static void newWayLongShowcase() {

        List<String> heroes = Arrays.asList("Artanis", "Raynor", "Zeratul");

        Collections.sort(heroes, (String a, String b) -> {
            return b.compareTo(a);
        });
    }

    public static void newWayShortShowcase() {

        List<String> heroes = Arrays.asList("Link", "Mario", "Zeratul");

        Collections.sort(heroes, (String a, String b) -> b.compareTo(a));
    }

    public static void newWayShortestShowcase() {

        List<String> heroes = Arrays.asList("Link", "Mario", "Zeratul");

        Collections.sort(heroes, (a, b) -> b.compareTo(a));
    }

}
