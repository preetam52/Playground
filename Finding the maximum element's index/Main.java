import java.util.Scanner;
class Main
{
  public static void max_element(int list[], int n)
  {
    int max = 0;
    int max_index = 0;
    for(int i=0;i<n;i++)
    {
      if(list[i] > max)
      {
        max = list[i];
       max_index = i;
      }
    }
    System.out.println(max_index);
  }
  public static void main(String args[])
  {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int list[] = new int[n];
    for(int i=0;i<n;i++)
    {
      list[i] = kb.nextInt();
    }
    max_element(list, n);
  }
}