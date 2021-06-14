public class CharacterAttributes {
    private Integer strength; // how strong is attack
    private Integer dexterity; // how fast is attack
    private Integer intelligence; //how strong is magic
    private Integer defence; // armour
    private Integer vitality; //health point reg.
    private Integer wisdom; // mana point reg.

    public CharacterAttributes(Integer strength, Integer dexterity, Integer intelligence, Integer defence,
                               Integer vitality, Integer wisdom) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.defence = defence;
        this.vitality = vitality;
        this.wisdom = wisdom;
    }

    @Override
    public String toString() {
        return "CharacterAttributes{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                ", defence=" + defence +
                ", vitality=" + vitality +
                ", wisdom=" + wisdom +
                '}';

    }

    public Integer getStrength() {
        return strength;
    }
    public Integer getDexterity() {
        return dexterity;
    }
    public Integer getIntelligence() {
        return intelligence;
    }
    public Integer getDefence() {
        return defence;
    }
    public Integer getVitality() {
        return vitality;
    }
    public Integer getWisdom(){
        return wisdom;
    }
}
