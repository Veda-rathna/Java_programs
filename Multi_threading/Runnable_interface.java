package Multi_threading;

class Runnable_interface implements Runnable {
    public void run() {
        System.out.println("The thread is running");
    }

    public static void main(String args[]) {
        Runnable_interface m = new Runnable_interface();
        Thread t1 = new Thread(m);
        t1.run();
    }
}

