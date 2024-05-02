import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        this.dateTime = moment.atTime(0, 0).plusSeconds(1_000_000_000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plusSeconds(1_000_000_000);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
