import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  StringBuilder reverse = new StringBuilder(str);
  int str_length = str.length();
  for(int i = str_length-1 ; i >= 0  ; i-- )
  {
    char ch = str.charAt(i);
    for(int j = str_length-1-i ; j < str_length ; j++ )
    {
       reverse.setCharAt(j , ch);
    }
  }
  String str1 = new String(reverse);
  if(str1.equals(str) == true)
  {
    System.out.print("Yes");
  }
  else
  {
    System.out.print("No");
  }
  
}
}