import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int arr_num[] = new int[n];
      for(int i = 0 ; i < n ; i++)
      {
        arr[i] = sc.nextInt();
      }
      int num_i = 0;
      for(int i = 0 ; i < n ; i++)
      {
        if(arr[i] != 0)
        {
          arr_num[num_i] = arr[i];
          num_i++;
        }
      }
        for(int i = 0 ; i < num_i ; i++)
        {
          arr[i] = arr_num[i];
        }
        for(int i = num_i ; i < n ; i++)
        {
          arr[i] = 0;
        }
      for(int i = 0 ; i < n ; i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
}