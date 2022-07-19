import java.util.Scanner;
interface Advanced
{
    void divisorsum(int n);
}
class Mycalculator implements Advanced
{
    public void divisorsum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       Advanced a=new Mycalculator();
       int n;
       n=in.nextInt();
        a.divisorsum(n);
    }
}
    

