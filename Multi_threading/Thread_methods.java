package Multi_threading;

class Thread_methods extends Thread {
    public void run() {
        System.out.println("I just started running LMAO!!!");
    }

    public static void main(String[] args) {
        Thread_methods t1 = new Thread_methods();
        t1.start();
        System.out.println("The name of the thread is " + t1.getName());
        System.out.println("The id of the thread is " + t1.getId());
        System.out.println("The priority of the thread is " + t1.getPriority());
    }
}
