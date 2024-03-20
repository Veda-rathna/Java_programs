package IO_operation;

public class Gen<T, V> {
    T obj1;
    V obj2;

    Gen(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void printTypes() {
        System.out.println("Type of T is: " + obj1.getClass().getName());
        System.out.println("Type of V is: " + obj2.getClass().getName());
    }

    public static void main(String[] args) {
        Integer i = 15;
        String s = "Hello";
        Gen<Integer, String> g1 = new Gen<>(i, s);
        g1.printTypes();
    }
}