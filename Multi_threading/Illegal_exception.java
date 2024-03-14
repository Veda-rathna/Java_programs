package Multi_threading;

class Illegal_exception extends Thread {

    public void run(){
        System.out.println("The thread is runnung....");
    }
    public static void main(String[] args) {
        Illegal_exception e1 = new Illegal_exception();
        Illegal_exception e2 = new Illegal_exception();
        e1.start();
        e2.start();
    }
}

//Don't start a thread twice while running, It causes it to throw the error  of "IllegalThreadStateException"