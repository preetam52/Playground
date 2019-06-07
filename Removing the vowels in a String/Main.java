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
    String vowel = new String("aeiouAEIOU");
    for(int i = 0 ; i < str_length ; i++)
    {
      int temp = 0 ;
      for(int j = 0 ; j < 10 ; j++)
      {
        if(str.charAt(i) == vowel.charAt(j))
        {
          temp++;
        }
      }
      if(temp == 0)
      sb.append(str.charAt(i));
    }
    System.out.print(sb);
  }
}