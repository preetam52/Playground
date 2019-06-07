import java.util.Scanner;
class Main
{
  public static int power_of_a_number(int a, int b)
  {
    int num = 1;
    for(int i=1;i<=b;i++)
    {
       num = num*a;
    }
    return num;
  }
	public static void main (String[] args)
    {
      Scanner kb = new Scanner(System.in);
      int n1 = kb.nextInt();
      int n2 = kb.nextInt();
      int result = power_of_a_number(n1,n2);
        System.out.print(result);
	}
}