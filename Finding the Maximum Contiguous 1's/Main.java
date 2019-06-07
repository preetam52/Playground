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
        int temp[] = new int[n];
        int sum = arr[0];
        int j = 0;
        int max = 0 ;
        for(int i = 0 ; i < n-1 ; i++)
        {
            if(arr[i] == arr[i+1])
            {
                sum = sum +arr[i+1];
                if(i == n-2)
                {
                    temp[j] = sum;
                }
            }
            else
            {
                temp[j] = sum;
                j++;
                sum = arr[i+1];
            }
        }
        for(int i = 0 ; i <= j ; i++)
        {
            if(max < temp[i])
            {
                max = temp[i] ;
            }
        }
         System.out.print(max);
    }
}