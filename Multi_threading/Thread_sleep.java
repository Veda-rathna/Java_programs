package Multi_threading;

class Thread_sleep extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Thread_sleep t1 = new Thread_sleep();
        Thread_sleep t2 = new Thread_sleep();
        t1.start();
        t2.start();
    }
}