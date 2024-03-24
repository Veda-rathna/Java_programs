package Synchronization;

class Counter

{
    int count;

    synchronized void increment()

    {

    count++;
     System.out.print(count + "\t");
    }
}

class SynDemo

{

    public static void main(String args[])
            throws Exception {

        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable()

        {

            public void run()

            {
                for (int i = 1; i <= 10; i++)

                {

                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable()

        {

            public void run(){

            
                for (int i = 1; i <= 10; i++)

                {
                    
                    c.increment();

                }}
        });

        t1.start();    
        t2.start();
        
        
    }
}