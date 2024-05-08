import java.util.HashMap;

class SpaceAge {
    private final double earthYears;
    private final double seconds;
    private final int earthYearInSeconds = 31557600;
    private static HashMap<String, Double> periods = new HashMap<>();
    static {
        periods.put("Mercury",  0.2408467);
        periods.put("Venus",    0.61519726);
        periods.put("Mars",     1.8808158);
        periods.put("Jupiter",  11.862615);
        periods.put("Saturn",   29.447498);
        periods.put("Uranus",   84.016846);
        periods.put("Neptune",  164.79132);
    }

    SpaceAge(double seconds) {
        this.seconds = seconds;
        this.earthYears = seconds / this.earthYearInSeconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return earthYears;
    }

    double onMercury() {
        return earthYears / periods.get("Mercury");
    }

    double onVenus() {
        return earthYears / periods.get("Venus");
    }

    double onMars() {
        return earthYears / periods.get("Mars");
    }

    double onJupiter() {
        return earthYears / periods.get("Jupiter");
    }

    double onSaturn() {
        return earthYears / periods.get("Saturn");
    }

    double onUranus() {
        return earthYears / periods.get("Uranus");
    }

    double onNeptune() {
        return earthYears / periods.get("Neptune");
    }

}
