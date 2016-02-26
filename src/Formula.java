/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public interface Formula {

    double sum(int a, int b);

    default double divide(int a, int b) {
        return Math.floorDiv(a, b);
    }

}
