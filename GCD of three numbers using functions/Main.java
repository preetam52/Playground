import java.util.Scanner;
public class Main
{
  public static int GCD(int n1, int n2, int n3)
  {
    int min, gcd1 = 0;
    if(n1>n2)
      min = n2;
    else
      min = n1;
    while(min>=1)
    {
      if(n1 % min == 0 && n2 % min ==0)
      {
        gcd1 = min;
      break;
      }
      min--;
    }
    return gcd1;
  }
	public static void main (String[] args)
	{
       Scanner kb = new Scanner(System.in);
      int n1 = kb.nextInt();
       int n2 = kb.nextInt();
       int n3 = kb.nextInt();
      int result = GCD(n1,n2,n3);
      System.out.print(result);
	}
}