import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class MapShowcase {

    public static void showcase() {
        Map<String, String> map = new HashMap<>();
        map.put("Spirit", "Breaker");
        map.put("Legion", "Commander");
        map.put("Riki", "Maru");

        // Récupère la valeur si existe sinon renvoie JDK8
        map.getOrDefault("Splatz", "JDK8");

        // Si la clé Splatz n'existe pas, alors seulement JDK8 sera mis sinon ne fait rien
        map.putIfAbsent("Splatz", "JDK8");
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
