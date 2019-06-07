import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    String str = new String();
    str = sc.nextLine();
    int key = sc.nextInt();
    key = 26 - key ;
    int str_length = str.length();
    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i < str_length ; i++)
    {
      if(str.charAt(i) == ' ')
        {
          sb.append(str.charAt(i));
        }
      else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
      {
        int offset = str.charAt(i) - 'a' ; 
        offset = (offset + key) % 26 ; 
        char ch = (char)('a' + offset);
        
        sb.append(ch);
      }
      
      else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
      {
        int offset = str.charAt(i) - 'A' ; 
        offset = (offset + key) % 26 ; 
        char ch = (char)('A' + offset);
         sb.append(ch);
      }
    }
    System.out.print(sb);
  }
}