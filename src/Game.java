public class Game {
    private Integer turn;

    public < T > void fight(T source, T target) {
        if (source.getClass().equals(Assault.class)) {
            ((Assault) source).printMyName();
            System.out.println(source.toString());
        }
    }
    public void save(Character character){
    }
    public void nextTurn() {
    }
    public void printCharacter(){
    }
}