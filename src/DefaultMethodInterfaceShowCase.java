/**
 * Altima Agency
 * Created by rkhiter on 26/02/16.
 */
public final class DefaultMethodInterfaceShowCase {

    public static void showcase() {

        Formula formula = new Formula() {
            @Override
            public double sum(int a, int b) {
                return a + b;
            }
        };

        formula.sum(10, 5);
        formula.divide(10, 2);
    }


    public static void formulaShowcase() {
        Formula formula = (a,b) -> {return (a+b);};
        formula.sum(5,10);
    }

}
