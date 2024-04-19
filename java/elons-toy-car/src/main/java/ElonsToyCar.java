public class ElonsToyCar {
    private int distance;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if (this.battery > 0)
            return "Battery at " + this.battery + "%";
        return "Battery empty";
    }

    public void drive() {
        if (this.battery > 0) {
            distance += 20;
            battery--;
        }
    }
}
