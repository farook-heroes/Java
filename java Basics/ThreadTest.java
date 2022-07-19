public class ThreadTest extends Thread {
    static int N=10;
    static int counter=1;
    public static void main(String args[]) throws Exception
    {
        ThreadTest s=new ThreadTest();
        Thread t1=new Thread(new Runnable() {
           public void  run() {
                s.printodd();
           }
        });
        Thread t2=new Thread(new Runnable() {
            public void  run() {
                 s.printeven();
            }
         });
         t1.start();
         t2.start();
    }
    public void printodd()
    {
        synchronized(this){
            while(counter<N )
            {
                while(counter%2==0)
                {
                    try {
                        wait();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
        System.out.println(counter);
        counter++;
        notify();
        }
    }
    }
    public void printeven()
    {
        synchronized(this)
        {
            while(counter<N )
        {
            while(counter%2==1)
            {
                try {
                    wait();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        System.out.println(counter);
        counter++;
        notify();
        }
    }
    }
}
