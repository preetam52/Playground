import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str1 = new String();
    str1 = sc.nextLine();
    int str1_length = str1.length();
    String str2 = new String();
    str2 = sc.nextLine();
    int str2_length = str2.length();
    StringBuilder sb1 = new StringBuilder(str1);
    StringBuilder sb2 = new StringBuilder();
    for(int i = 0 ; i < str2_length ; i++)
    {
      for(int j = 0 ; j < str1_length ; j++)
      {
        if(str2.charAt(i) == str1.charAt(j))
        {
          sb1.setCharAt(j,'$');
        }
      }
    }
    for(int i = 0 ; i < str1_length ; i++)
    {
      if(sb1.charAt(i) != '$')
      {
        sb2.append(sb1.charAt(i));
      }
    }
    System.out.print(sb2);
  }
}