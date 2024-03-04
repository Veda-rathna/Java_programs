package Abstract_without_abstract_method;

abstract class Abstract {
    void disp() {
        System.out.println("This is the method in abstract class");
    }
}

class B extends Abstract {

    public static void main(String[] args) {
        Abstract obj = new B();
        obj.disp();
    }
}
