
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds: birdsPerDay) {
            if (birds == 0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int n = (numberOfDays > birdsPerDay.length)? birdsPerDay.length : numberOfDays;
        int sum = 0;
        for (int i=0; i < n; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birds: birdsPerDay){
            if (birds >= 5)
                busyDays++;
        }
        return busyDays;
    }
}
