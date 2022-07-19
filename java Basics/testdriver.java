import java.util.Scanner;
import java.lang.Math;

class Polynomial
{
    int n;
    double[] arr = new double[n+3];
    void getvalues(int n,double ... numbers)
    {
        this.n=n;
        arr=numbers;
    }
    void evaluate(double x)
    {
        double sum=0.0;
        double rem;
        for(int i=0;i<=n;i++)
        {
            rem=Math.pow(x,i);
            sum+=arr[i]*rem;
        }
        System.out.println(sum);
    }
    Polynomial add(Polynomial p)
    {
        Polynomial s=new Polynomial();
        s.n=n;
        if(p.n>n)
        {
            s.n=p.n;
            for(int i=0;i<=n;i++)
            {
                s.arr[i]=arr[i]+p.arr[i];
            }
            for(int i=n+1;i<=p.n;i++)
            {
                s.arr[i]=p.arr[i];
            }
        }
        else
        {
            for(int i=0;i<=p.n;i++)
            {
                s.arr[i]=arr[i]+p.arr[i];
            }
            for(int i=p.n+1;i<=n;i++)
            {
                s.arr[i]=arr[i];
            }
            
        }
        return s;
    }
    void multiply(Polynomial p)
    {
        double [] res=new double[n+p.n+3];
       
        if(n<p.n)
        {
            for(int i=0;i<=p.n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                res[i+j]=res[i+j]+arr[i]*p.arr[j];
            }
        }
        }
        else
        {
            for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=p.n;j++)
            {
                res[i+j]=res[i+j]+arr[i]*p.arr[j];
            }
        }
        }
        for(int i=0;i<=n+p.n;i++)
        {
            System.out.println(res[i]);
        }
       
    }
}
class testdriver
{
    public static void main(String args[])
    {
        Polynomial s =new Polynomial();
        Polynomial a =new Polynomial();
        a.getvalues(0,2.0);
        
        s.getvalues(1, 2.0,3.0);
        s.evaluate(3.0);
     
        Polynomial res=new Polynomial();
        res=s.add(a);
        for(int i=0;i<=res.n;i++)
        {
            System.out.println(res.arr[i]);
        }
        s.multiply(a);
    }
}