import java.time.*;
import java.time.format.*;

interface DateUtil {
    static String fmt(LocalDate d) {
        return d.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
