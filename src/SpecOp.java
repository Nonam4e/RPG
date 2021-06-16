public class SpecOp extends Character {
    public SpecOp() {
        super(new CharacterAttributes(3, 3, 2, 4, 3, 1),
                new CharacterParameters(20, 0));
    }

    @Override
    public String toString() {
        return "Special Operator{" +
                "Характеристики" + characterAttributes.toString() +
                ", Параметры=" + characterParameters.toString() +
                "Специальный Оператор - юнит коммандос. Использует холодное оружие и снайперские винтовки " +
                "Спец. приём - Рэмбо. Персонаж ускоряется и наносит больше в ближнем бою. Противники попадают меньше. " +
                '}';
    }

}
