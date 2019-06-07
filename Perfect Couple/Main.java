import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i < n ; i++)
      {
        arr[i] = sc.nextInt();
      }
      int value = sc.nextInt(); 
      int sum = 0;
      for(int i = 0 ; i < n ; i++)
      {
         int temp = arr[i];
        for(int j = i+1 ; j < n ; j++)
        {
           sum = temp + arr[j];
          if(value == sum)
          {
            System.out.print(temp+", "+arr[j]);
            System.out.print("\n");
          }
         
        }
         
      }
    }
}