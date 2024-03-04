package Abstract;

abstract class Abstract {
    abstract void hello();
}

class B extends Abstract {
    void hello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        B b = new B();
        b.hello();
    }
}