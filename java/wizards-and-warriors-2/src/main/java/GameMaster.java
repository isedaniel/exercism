public class GameMaster {

    public String describe(Character c) {
        return String.format("You're a level %d %s with %d hit points.",
                c.getLevel(),
                c.getCharacterClass(),
                c.getHitPoints());
    }

    public String describe(Destination d) {
        return String.format("You've arrived at %s, which has %d inhabitants.",
                d.getName(),
                d.getInhabitants());
    }

    public String describe(TravelMethod t) {
        String method = (t == TravelMethod.WALKING)? "by walking" : "on horseback";
        return String.format("You're traveling to your destination %s.",
                method);
    }


    public String describe(Character c, Destination d, TravelMethod t) {
        return String.format("%s %s %s",
                this.describe(c),
                this.describe(t),
                this.describe(d));
    }

    public String describe(Character c, Destination d) {
        return this.describe(c, d, TravelMethod.WALKING);
    }
}
