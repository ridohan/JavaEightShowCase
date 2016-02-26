/**
 * Altima Agency
 * Created by rkhiter on 26/02/16.
 */
public class FormulaImpl implements Formula {
    @Override
    public double sum(int a, int b) {
        return a + b;
    }

    @Override
    public double divide(int a, int b) {
        return a / b;
    }
}
