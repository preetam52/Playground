import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int max = 0 , temp = 0;
    int max_ele = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n] ;
    for(int i = 0 ; i < n ; i++)
    {
      arr[i] = sc.nextInt();
    }
    for(int i = 0 ; i < n ; i++)
    {
      temp = 0 ;
      for(int j = 0 ; j < n ; j++)
      {
        if(i != j && arr[i] == arr[j])
        {
          temp++;
        }
      }
      if(temp > max)
          {
            max = temp ;
            max_ele = arr[i] ;
          }
    }
    if(temp == 0)
    max_ele = arr[0] ;
    System.out.print(max_ele);
  }
}