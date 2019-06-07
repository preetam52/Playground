import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    boolean temp = false ;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int matrix1[][] = new int[n][m];
    for(int i = 0 ; i < n ; i++)
    {
      for(int j = 0 ; j < m ; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
    int matrix2[][] = new int[n][m];
    for(int i = 0 ; i < n ; i++)
    {
      for(int j = 0 ; j < m ; j++)
      {
        matrix2[i][j] = sc.nextInt();
      }
    }
    for(int i = 0 ; i < n ; i++)
    {
      
      for(int j = 0 ; j < m ; j++)
      {
        temp = false ;
        if(matrix1[i][j] == matrix2[i][j])
          temp = true ;
        else
          break;
      }
      if(temp == false)
        break;
    }
    if(temp == true)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}