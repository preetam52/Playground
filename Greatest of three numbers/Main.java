import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner kb=new Scanner(System.in);
      int a=kb.nextInt();
      int b=kb.nextInt();
      int c=kb.nextInt();
      if(a>b)
      {
        if(a>c)
          System.out.println(a);
        else
          System.out.println(c);
      }
      else
      {
        if(b>c)
          System.out.println(b);
        else
          System.out.println(c);
      }
    }
}