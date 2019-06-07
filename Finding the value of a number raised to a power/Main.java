import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exponent = sc.nextInt();
      int i = 1 , result = 1 ;
      while(i <= exponent)
      {
        result = result * base ;
        i++ ;
      }
      System.out.print(result);
    }
}