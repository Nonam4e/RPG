public class CharacterParameters {
    private Integer healthPoints;
    private Integer manaPoints;
    private Integer experiencePoints;
    private Integer characterLevel;
    // TODO 08/06/2021 characterName

    public CharacterParameters(Integer healthPoints, Integer manaPoints) {
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.experiencePoints = 0;
        this.characterLevel = 0;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(Integer manaPoints) {
        this.manaPoints = manaPoints;
    }

    public Integer getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(Integer experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    @Override
    public String toString() {
        return "CharacterParameters{" +
                "healthPoints=" + healthPoints +
                ", manaPoints=" + manaPoints +
                ", experiencePoints=" + experiencePoints +
                ", characterLevel=" + characterLevel +
                '}';
    }

    public void incCharacterLevel(CharacterAttributes characterAttributes) {
        characterAttributes.setDefence(characterAttributes.getDefence() + 1 + this.characterLevel / 3);
        characterAttributes.setDexterity(characterAttributes.getDexterity() + 1 + this.characterLevel / 3);
        characterAttributes.setIntelligence(characterAttributes.getIntelligence() + 1 + this.characterLevel / 3);
        characterAttributes.setStrength(characterAttributes.getStrength() + 1 + this.characterLevel / 3);
        characterAttributes.setVitality(characterAttributes.getVitality() + 1 + this.characterLevel / 3);
        this.characterLevel += 1;
    }
}
