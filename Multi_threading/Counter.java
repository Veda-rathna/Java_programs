package Multi_threading;

class Count {
    int count;
    protected Object increment;

    public void increment() {
        count++;
    }
}

class Counter {
    public static void main(String[] args) {
        Count c  = new Count();
        Thread t1 = new Thread(new Runnable() {
           public void run(){
            for(int i=0; i<=1000;i++){
                c.increment();;
            }
           } 
        });
        t1.start();
        System.out.println("Count "+c.count);
    }
}
