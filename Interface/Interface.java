package Interface;

    interface Walk{
        void walk();
    }
    interface Run{
        void run();
    }

    class A implements Walk, Run{
        public void walk(){
            System.out.println("I am walking");
        }
        public void  run(){
            System.out.println("I can run because I have two legs.");
        }
    }

    class Test{
        public static void main(String[] args) {
            A  a = new A();
            a.walk();
            a.run();
        }
    }