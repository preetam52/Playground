import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    for(int i=1;i<=n;i++)
    {
      System.out.print(i);
      if(i%3==0)
        System.out.print(",");
    }
  }
}