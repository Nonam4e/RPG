public class Assault extends Character {
    public Assault() {
        super(new CharacterAttributes(3, 1, 1, 3, 2, 1),
                new CharacterParameters(20, 0));
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "characterAttributes" + characterAttributes.toString() +
                ", characterParameters=" + characterParameters.toString() +
                '}';
    }

}
