import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

/**
 * Altima Agency
 * Created by rouz on 15/01/16.
 */
public final class InstantToDateShowcase {

    public static void showcase() {

        Instant instant = Instant.now();

        Date date = Date.from(instant); // API -> Legacy
        Instant instantFromDate = date.toInstant(); // Legacy -> API

        Timestamp timeStamp = Timestamp.from(instant); // API -> Legacy
        Instant instantFromTimeStamp = timeStamp.toInstant(); // Legacy -> API

    }

}
