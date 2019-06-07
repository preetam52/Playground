import java.util.Scanner;
class Main
{
  public static int greatest_number(int n1, int n2, int n3)
  {
    int max;
    if(n1>n2)
    {
      if(n1>n3)
        max = n1;
      else
        max = n3;
    }
    else
    {
      if(n2>n3)
        max = n2;
      else
        max = n3;
    }
    return max;
  }
	public static void main (String[] args)
    {
      Scanner kb = new Scanner(System.in);
      int n1 = kb.nextInt();
      int n2 = kb.nextInt();
      int n3 = kb.nextInt();
      int result = greatest_number(n1,n2,n3);
      System.out.print(result);
	}
}