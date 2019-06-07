import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int n = num;
    StringBuilder sb = new  StringBuilder();
    StringBuilder sb1 = new  StringBuilder();
    char ch = ' ';
    int count = 0;
    if(num < 0)
      num = num - 2*num;
    while(num > 0)
    {
    int rem = num % 10;
    num = num / 10;
    count++; 
    ch = (char)(rem + '0') ;
    sb.append(ch);
    }
    if(n > 0)
    {
    for(int i = count - 1 ; i >= 0 ; i--)
    sb1.append(sb.charAt(i));
    }
    else
    {
      sb1.append('-');
      for(int i = count - 1 ; i >= 0 ; i--)
      {
      sb1.append(sb.charAt(i));
      }
    }
    System.out.println(sb1);
  }
}