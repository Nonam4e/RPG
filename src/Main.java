public class Main  {

    public static void main(String[] args) {
        Gen player = new Gen(new Assault());
        Assault assault = new Assault();
        assault.printMyName();
        Game game = new Game();
        game.fight(player, player);
    }
}
