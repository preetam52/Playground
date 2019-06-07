import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = new String();
    str = sc.nextLine();
    int str_length = str.length();
    StringBuilder sb = new StringBuilder();
    int start = 0 , rev_start = 0;
    int rev_end = 0 ;
    for(int i = start ; i < str_length ; i++ )
    {
      rev_end = start ;
      if(str.charAt(i) == ' ' || i == str_length - 1)
      {
        if(str.charAt(i) != ' ')
        rev_start = i  ;
        else
        rev_start = i - 1 ;
        for(int j = rev_start ; j >= rev_end ; j--)
        {
          sb.append(str.charAt(j));
        }
        if(str.charAt(i) == ' ')
        sb.append(' ');
        start = i + 1 ;
      }
    }
    System.out.print(sb);
  }
}