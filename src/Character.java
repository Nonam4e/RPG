abstract class Character implements CharacterActions {
    protected CharacterAttributes characterAttributes;
    protected CharacterParameters characterParameters;

    public Character(CharacterAttributes characterAttributes, CharacterParameters characterParameters) {
//        this.characterAttributes = new CharacterAttributes(1, 1, 1, 1, 1, 1);
//        this.characterParam = new CharacterParam(10,5)
            this.characterAttributes = characterAttributes;
            this.characterParameters = characterParameters;
    }
    public void printMyName() {
        System.out.println(characterName);
    }

    @Override
    public Integer makeAttack() {
        return this.characterAttributes.getStrength();
    }

    @Override
    public Integer makeDefence() {
        return this.characterAttributes.getDefence();
    }

    @Override
    public void levelUp() {
        if (this.characterParameters.getExperiencePoints() == 100) {
            this.characterParameters.incCharacterLevel(this.characterAttributes);
        }
    }
}