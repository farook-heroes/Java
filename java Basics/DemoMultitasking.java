import java.lang.*;

 class Threaddemo extends Thread
{

    public void run() 
    {
        try {
            for(int i=0;i<=4;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print("Error");
        }
      
    }
}
class Threaddemo1 extends Thread
{
    Threaddemo t;
    Threaddemo1(Threaddemo t)
    {
        this.t=t;
    }
    public void run()
    {
        t.run();
    }
}

class Threaddemo2 extends Thread
{

    Threaddemo t;
    Threaddemo2(Threaddemo t)
    {
        this.t=t;
    }
    public void run()
    {
        t.run();
    }
}


public class DemoMultitasking {
    public static void main(String args[])
    {
        Threaddemo s=new Threaddemo();
       Threaddemo1 t1=new Threaddemo1(s);
       Threaddemo2 t2=new Threaddemo2(s);
       t2.setPriority(10);
       t1.setPriority(5);
       t2.start();
       t1.start();
      
       
    }
}
