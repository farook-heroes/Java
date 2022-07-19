
import java.util.*;
import java.util.stream.Collector.Characteristics;
import java.lang.*;

public class IdGen {
    void generator(String large,String small,String pin,int n)
    {
        StringBuffer pass=new StringBuffer();
        char c=small.charAt(small.length()-1);
        pass.append(c);
        pass.append(large);
        int i;
        i=pin.length()-n;
        pass.append(pin.charAt(n));
        pass.append(pin.charAt(i));
        for( i=0;i<pass.length()-1;i++)
        {
            if(Character.isUpperCase(pass.charAt(i)))
            {
                pass.setCharAt(i, Character.toLowerCase(pass.charAt(i)));
            }
            else if(Character.isLowerCase(pass.charAt(i)))
            {
                pass.setCharAt(i, Character.toUpperCase(pass.charAt(i)));
            }
        }
        System.out.println(pass);
    }
    public static void main(String args[])
    {
        IdGen s=new IdGen();
        String s1,s2,pin;
        int n;
        Scanner input=new Scanner(System.in);
        s1=input.next();
        s2=input.next();
        pin=input.next();
        n=input.nextInt();
        if(s1.length()==s2.length())
        {
            if(s1.compareTo(s2)>0)
            {
                s.generator(s1,s2,pin,n);
            }
            else
            {
                s.generator(s2,s1,pin,n);
            }
        }
        else
        {
            if(s1.length()>s2.length())
            {
                s.generator(s1, s2, pin, n);
            }
            else
            {
                s.generator(s2, s1, pin, n);
            }
        }
    }
    
}
