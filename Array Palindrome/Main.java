import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n] ;
        for(int i = 0 ; i < n ; i++)
        {
          arr[i] = sc.nextInt();
        }
      int pal[] = new int[n] ;
      int j = 0;
      for(int i = n-1 ; i >= 0 ; i--)
      {
         pal[j] = arr[i] ; 
        j++;
      }
      if(Arrays.equals(arr,pal))
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}