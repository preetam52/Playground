import java.util.Scanner;
class Main
{
  public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int arr_odd[] = new int[n];
    int arr_even[] = new int[n];
    int odd_i = 0;
    int even_i = 0;
    for(int i = 0 ; i < n ; i++)
    {
      arr[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    for(int i = 0 ; i < n ; i++)
    {
      if(arr[i] % 2 != 0)
      {
        arr_odd[odd_i] = arr[i];
        odd_i++;
      }
      else
      {
        arr_even[even_i] = arr[i];
        even_i++;
      }
    }
    
    for(int j = 1 ; j <= m ; j++)
    {
        int temp_odd = arr_odd[odd_i-1];
       for(int i = odd_i-2 ; i >= 0 ; i--)
      {
        arr_odd[i+1] = arr_odd[i];
   	  }
      arr_odd[0] = temp_odd;
    }
    
    for(int j = 1 ; j <= m ; j++)
    {
        int temp_even = arr_even[0];
       for(int i = 1 ; i <= even_i-1 ; i++)
      {
         arr_even[i-1] = arr_even[i];
      }
      arr_even[even_i-1] = temp_even;
    }
    odd_i = 0;
    even_i = 0;
    for(int i = 0 ; i < n ; i++)
    {
      if( i % 2 == 0)
      {
        arr[i] = arr_odd[odd_i];
        odd_i++;
      }
      else
      {
        arr[i] = arr_even[even_i];
        even_i++;
      }
    }
    for(int i = 0 ; i < n ; i++)
      System.out.print(arr[i]+" ");
}
}