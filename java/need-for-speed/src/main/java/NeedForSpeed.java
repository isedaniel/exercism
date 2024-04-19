class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()){
            this.distanceDriven += this.speed;
            this.battery -= batteryDrain;
        } 
    }

    public int possibleDistance() {
        return this.speed * (this.battery / this.batteryDrain);
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        return car.possibleDistance() >= this.distance;
    }
}
