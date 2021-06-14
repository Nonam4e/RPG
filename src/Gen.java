public class Gen<T> {
    T object;

    Gen(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }

    void showType() {
        System.out.println("Тип Т: " + object.getClass().getName());
    }
}
