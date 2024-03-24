package Multi_threading;

class Shared extends Thread {
    synchronized void waitFor() {
        try {
            wait(); // Wait until notified
        } catch (InterruptedException e) {
        }
        System.out.println("Notification received!");
    }

    synchronized void notifyThread() {
        notify(); // Notify waiting thread
    }

}

public class Inter_Thread_Comms {
    public static void main(String[] args) {
        Shared t1 = new Shared();
        t1.start();
        t1.waitFor();
        t1.notifyThread();
    }
}

