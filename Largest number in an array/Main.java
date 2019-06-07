import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      int temp = 0;
      Scanner kb = new Scanner(System.in);
      int arr_size = kb.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i] = kb.nextInt();
      }
      int max = arr[0];
      for(int i=1;i<arr_size;i++)
      {
        if(max<arr[i])
        {
          temp = arr[i];
          arr[i] = max;
          max = temp;
        }
      }
      System.out.println(max);
    }
}