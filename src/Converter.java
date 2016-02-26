/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
@FunctionalInterface
public interface Converter<S,T> {

    T convert(S source);
}
