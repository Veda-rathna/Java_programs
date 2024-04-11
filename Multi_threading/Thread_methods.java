package Multi_threading;

class Th extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println(i);
        }
    }
}

class Multi {
    public static void main(String args[]) {
        Th t1 = new Th();
        Th t2 = new Th();
        
        System.out.println("ID=" + t1.getId());
        System.out.println("GetName=" + t1.getName());
        
        t1.setName("Hello");
        System.out.println("GetName=" + t1.getName());
        
        System.out.println("GetPriority=" + t1.getPriority());
        t1.setPriority(10);
        
        t1.start();
        
        System.out.println("The thread is "+t1);
        try {
            t1.join();
        } catch (Exception e) {}
        
        System.out.println("Thread Status=" + t1.isAlive());
        t2.start();
    }
}
