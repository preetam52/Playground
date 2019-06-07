import java.util.Scanner;
class Main
{
    public static int sum_of_the_numbers(int n)
    {
      int sum = 0;
      for(int i=1;i<=n;i++)
      {
        sum = sum+i;
      }
      return sum;
    }
	public static void main (String[] args)
    {
	   Scanner kb = new Scanner(System.in);
       int n = kb.nextInt();
      int result = sum_of_the_numbers(n);
      System.out.println(result);
	}
}