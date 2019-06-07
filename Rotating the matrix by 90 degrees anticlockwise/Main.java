import java.util.Scanner ; 
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int col_size = sc.nextInt();
    int arr[][] = new int[row_size][col_size] ;
    for(int i = 0 ; i < row_size ; i++)
    {
      for(int j = 0 ; j < col_size ; j ++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    for(int i = row_size - 1 ; i >= 0 ; i--)
    {
      for(int j = 0 ; j < col_size ; j ++)
      {
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
  }
}