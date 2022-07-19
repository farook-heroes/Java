import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileTest {
    public static void main (String args[]) throws Exception
    {
        File f=new File("Sample.txt");
       File fs=new File("next.txt");
        
        
       
        FileReader rd=new FileReader(f);
        FileWriter rw=new FileWriter(fs);
        BufferedReader br=new BufferedReader(rd);
        String k;
        while((k=br.readLine())!=null)
        {
           rw.write(k);
           rw.write("\n");
        }
        rw.close();
        rd.close();
       
       
    }
}
