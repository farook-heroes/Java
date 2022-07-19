 class Sports
{
    String getname()
    {
        return "Generic Sports";
    }
    void getTeamMembers()
    {
        System.out.println("Each team has n players in "+getname());
    }
}
class Soccer extends Sports
{
    String getname()
    {
        return "Soccer Class";
    }
    void getTeamMembers()
    {
    
        System.out.println("Each team has 11 players in "+getname() );
    }
    public static void main(String args[])
    {
        Soccer s=new Soccer();
        Sports a=new Sports();
        System.out.println(a.getname());
        a.getTeamMembers();
        System.out.println(s.getname());
        s.getTeamMembers();
    }
}