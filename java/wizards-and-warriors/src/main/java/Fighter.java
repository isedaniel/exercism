class Fighter {
    boolean isVulnerable() { return false; }

    int getDamagePoints(Fighter fighter) { return 1; }

}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() { return false; }

    @Override
    int getDamagePoints(Fighter fighter) {
        return (fighter.isVulnerable())? 10 : 6;
    }

    @Override 
    public String toString() { 
        return "Fighter is a " + getClass().getSimpleName();
    }
}

class Wizard extends Fighter {
    boolean spellPrepared = false;

    @Override
    public boolean isVulnerable() { return !spellPrepared; }

    @Override
    int getDamagePoints(Fighter fighter) {
        return (this.spellPrepared)? 12 : 3;
    }
    void prepareSpell() { spellPrepared = true; }

    @Override 
    public String toString() { 
        return "Fighter is a " + getClass().getSimpleName();
    }
}
