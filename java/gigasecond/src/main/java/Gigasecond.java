import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
    private LocalDateTime time;

    public Gigasecond(LocalDate moment) {
        this.time = LocalDateTime.of(moment, LocalTime.of(0, 0)).plusSeconds(1_000_000_000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.time = moment.plusSeconds(1_000_000_000);
    }

    public LocalDateTime getDateTime() {
        return time;
    }
}
