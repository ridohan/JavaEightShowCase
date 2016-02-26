import java.util.Comparator;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class ComparatorShowcase {

    public static void oldWayShowcase() {
        // Comparison using the last name then first Name
        Person debrah = new Person("Debrah", "Sunflower");
        Person debbie = new Person("Debbie", "Sunflower");

        Comparator<Person> compareLastNameThenFirstName = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int lastNameComparison = p1.getLastName().compareTo(p2.getLastName());
                return lastNameComparison == 0 ?
                        p2.getFirstName().compareTo(p1.getLastName()) : lastNameComparison;
            }
        };

        int result = compareLastNameThenFirstName.compare(debrah, debbie);
    }

    public static void newWayShowcase() {
        // Comparison using the last name then first Name
        Person debrah = new Person("Debrah", "Sunflower");
        Person debbie = new Person("Debbie", "Sunflower");

        Comparator<Person> compareLastNameThenFirstName = Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName);
        int result = compareLastNameThenFirstName.compare(debrah, debbie);
    }

    public static void newWayReverseShowcase() {
        // Comparison using the last name then first Name
        Person debrah = new Person("Debrah", "Sunflower");
        Person debbie = new Person("Debbie", "Sunflower");

        Comparator<Person> compareLastNameThenFirstName = Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName);
        Comparator<Person> reverseComparator = compareLastNameThenFirstName.reversed();
        int result = reverseComparator.compare(debrah, debbie);
    }

    public static void newWayNullHandlingShowcase() {
        // Comparison using the last name then first Name
        Person debrah = null;
        Person debbie = new Person("Debbie", "Sunflower");

        Comparator<Person> compareLastNameThenFirstName = Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName);
        Comparator.nullsFirst(compareLastNameThenFirstName);
        Comparator.nullsLast(compareLastNameThenFirstName);
    }

}
