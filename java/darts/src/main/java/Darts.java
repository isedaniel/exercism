class Darts {
    int score(double xOfDart, double yOfDart) {
        double landing = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
        if (landing > 10) return 0;
        else if (landing > 5) return 1;
        else if (landing > 1) return 5;
        else return 10;
    }
}
