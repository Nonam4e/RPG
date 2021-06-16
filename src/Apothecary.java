public class Apothecary extends Character {
    public Apothecary() {
        super(new CharacterAttributes(2, 2, 3, 1, 1, 3),
                new CharacterParameters(30, 20));
    }

    @Override
    public String toString() {
        return "Apothecary{" +
                "Характеристики" + characterAttributes.toString() +
                ", Параметры=" + characterParameters.toString() +
                "Апотекарий - юнит медицинской поддержки. Лечит творащей благодаря огромной медицинской игле. " +
                "Использует пистолеты и холодное оружие." +
                "Спец. приём - ВСТАВАЙ БРАТ!. Воскрешает любого товарища вне зависимоти от тяжести убийства. (Не работает на лужах слизи) " +
                '}';
    }

}
