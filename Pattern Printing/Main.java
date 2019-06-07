import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0 ; i < n ; i++)
      {
        int k = 0 , temp =0 ;
        for(int j = 0 ; j < m ; j++)
        {
          if(k <= i)
          {
            temp = n - k;
          	System.out.print(temp);
            k++;
          }
          else
            System.out.print(temp);
        }
        System.out.println();
      }
    }
}