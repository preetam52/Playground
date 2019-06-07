import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_length = str.length();
        int mid = str_length / 2 ;
        for(int i = 1 ; i <= mid ; i++) //rotation
        {
            char temp = sb.charAt(0);
            for(int j = 1 ; j < str_length ; j++)
            {
                sb.setCharAt(j-1,sb.charAt(j));
            }
            sb.setCharAt(str_length-1,temp);
        }
        for(int i = 1 ; i <= str_length ; i++)
        {
            int k = 0;
            for(int j = 1 ; j <= str_length ; j++)
            {
                if(j >= (str_length + 1) - i)
               {
                System.out.print(sb.charAt(k));
                k++;
               }
                else
               {
                System.out.print(" ");
               }
            }
            System.out.print("\n");
        }
    }
}