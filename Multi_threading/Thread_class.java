package Multi_threading;

class Thread_class extends Thread {
    public void run() {
        int i = 1;
        while (i > 0) {
            System.out.print("Naan dhan da\t");
        }
    }

    public static void main(String[] args) {
        Thread_class m = new Thread_class();
        m.start();
    }
}