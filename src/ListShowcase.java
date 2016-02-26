import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class ListShowcase {

    public static void showcase() {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        strings.forEach(System.out::println);
    }

    public static void showcaseRemove() {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 4;
            }
        };

        boolean result = strings.removeIf(predicate);
        System.out.println(result);
    }

    public static void showcaseReplaceAll() {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");


        strings.replaceAll(String::toUpperCase);
        System.out.println(strings);
    }


    public static void showcaseSort() {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");


        strings.sort(Comparator.<String>naturalOrder());
        System.out.println(strings);
    }

}
