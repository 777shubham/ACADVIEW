public class ifelse 
{
    public static void main(String args[])
    {
        int s1=50;
        
        if(s1>90)
        {
            System.out.println("OUTSTANDING");
        }
        else if(s1>71&&1<80)
        {
            System.out.println("VERY GOOD");
        }
       else if(s1>51&&s1<60)
        {
            System.out.println("FAIR");
        }
       else if(s1>61&&s1<70)
        {
            System.out.println("GOOD");
        }
       else if(s1>81&&s1<90)
        {
            System.out.println("EXCELLENT");
        }
       else
       {
           System.out.println("NEED TO WORK HARD");
       }
        
    }
}