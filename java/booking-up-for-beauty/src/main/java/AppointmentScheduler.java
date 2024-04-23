import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (12 <= appointmentDate.getHour()) && (appointmentDate.getHour() < 18);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // Friday, March 29, 2019
        DateTimeFormatter datePrinter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy,");
        // 3:00 PM.
        DateTimeFormatter hourPrinter = DateTimeFormatter.ofPattern("h:mm a.");
        return "You have an appointment on " +
            appointmentDate.format(datePrinter) +
            " at " +
            appointmentDate.format(hourPrinter);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
