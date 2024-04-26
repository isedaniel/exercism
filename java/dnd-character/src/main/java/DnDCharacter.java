import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter() {
        this.strength = this.ability(rollDice());
        this.dexterity = this.ability(rollDice());
        this.constitution = this.ability(rollDice());
        this.intelligence = this.ability(rollDice());
        this.wisdom = this.ability(rollDice());
        this.charisma = this.ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        return sum - Collections.min(scores);
    }

    int getDice() {
        return (int) (Math.random() * 6 + 1);
    }

    List<Integer> rollDice() {
        List<Integer> dices = new ArrayList<>();
        for (int i=0; i<4; i++){
            dices.add(getDice());
        }
        return dices;
    }

    int modifier(int input) {
        // -11 if less than zero to round down correctly
        return (input - 10 < 0)? (input-11)/2 : (input-10)/2;
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
