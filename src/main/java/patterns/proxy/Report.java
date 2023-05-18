package patterns.proxy;

import java.time.LocalDate;

public interface Report {
    String prepareReport(LocalDate localDate);
}
