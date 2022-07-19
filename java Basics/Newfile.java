import java.io.File;
import java.io.FileWriter;

import java.io.*;
public class Newfile {
    public static void main(String args[]) throws Exception
    {
        File f=new File("sample.txt");
         f.createNewFile();
        FileWriter fout=new FileWriter(f);
       BufferedWriter b=new BufferedWriter(fout);
       b.write("farook");
       b.close();
        FileReader fin=new FileReader(f);
        BufferedReader in=new BufferedReader(fin);
        String k=in.readLine();
        System.out.print(k);
       

    }
}
