public class Devastator extends Character {
    public Devastator() {
        super(new CharacterAttributes(2, 1, 1, 5, 5, 1),
                new CharacterParameters(35, 0));
    }

    @Override
    public String toString() {
        return "Devastator{" +
                "Характеристики" + characterAttributes.toString() +
                ", Параметры=" + characterParameters.toString() +
                "Опустошитель - юнит ближней дистанции. Использует тяжёлое оружие или холодное оружие вместе со щитом. " +
                "Спец. приём - Блиц рывок. Персонаж делает быстрый выпад в строну противника нанося урон в ближнем бою " +
                "и накладывает эффект паники в радиусе выполнения." +
                '}';
    }

}
