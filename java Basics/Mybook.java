import java.util.Scanner;
abstract class Book
{
    String title;
    String getTitle()
    {
        return title;
    }
    abstract void setTitle(String title);
}
class Mybook extends Book
{
  

  void setTitle(String title)
    {
        this.title=title;
    }
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
     Book s=new Mybook();
     String k=in.nextLine();
     s.setTitle(k);
    
     System.out.println("Book "+s.getTitle());
    }

}
