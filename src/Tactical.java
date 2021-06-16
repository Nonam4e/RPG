public class Tactical extends Character {
    public Tactical() {
        super(new CharacterAttributes(2, 2, 2, 1, 2, 2),
                new CharacterParameters(20, 0));
    }

    @Override
    public String toString() {
        return "Tactical{" +
                "Характеристики" + characterAttributes.toString() +
                ", Параметры=" + characterParameters.toString() +
                "Тактик - юнит дальней дистанции. Использует снайперские винтовки." +
                "Спец. приём - Наведение. Попадает в критические точки противника со 100% вероятностью." +
                '}';
    }

}
