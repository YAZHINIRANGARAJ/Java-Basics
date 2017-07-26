
import java.util.*;
public class Reverse

{
    public static void main(String[] args)
    {
        int i;
        String str,rev="";
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        int len=str.length();
        for(i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    
}
