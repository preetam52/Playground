import java.util.Scanner;
class Main
{
   public static int square(int m)
   {
     int sqr = m*m;
     return sqr;
   }
	public static void main (String[] args)
    {
      Scanner kb = new Scanner(System.in);
      int n = kb.nextInt();
      int result = square(n);
      System.out.print(result);
	} 
}