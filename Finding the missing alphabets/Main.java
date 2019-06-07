import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_length = str.length();
        int arr[] = new int[26];
        for(int i = 0 ; i< 26 ; i++)
        {
            arr[i] = 0;
        }
        for(int i = 0 ; i< str_length ; i++)
        {
            if('a' <= sb.charAt(i) && sb.charAt(i) <= 'z')
          {
            int offset = sb.charAt(i) - 'a';
            arr[offset]++;
          }
           else if('A' <= sb.charAt(i) && sb.charAt(i) <= 'Z')
          {
            int offset = sb.charAt(i) - 'A';
            arr[offset]++;
          }
        }
        for(int i = 0 ; i< 26 ; i++)
        {
           if( arr[i] == 0 )
           {
           char ch = (char) (i + 'a');
           System.out.print(ch+" ");
        }
        }
    }
}
