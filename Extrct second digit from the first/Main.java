import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner kb = new Scanner(System.in);
       int n = kb.nextInt();
       int a;
       while(n>=100)
       {
          n = n/10;
       }
       a=n%10;
       System.out.println(a);
    }
}