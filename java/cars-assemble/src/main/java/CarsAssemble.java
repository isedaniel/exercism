public class CarsAssemble {
    static final int CARS_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        double rate;
        if (speed <= 4) {
            rate = 1;
        }
        else if (speed <= 8) {
            rate = .9;
        }
        else if (speed == 9) {
            rate = .8;
        }
        else {
            rate = .77;
        }
        return CARS_PER_HOUR * speed * rate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
