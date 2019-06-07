import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    Scanner kb = new Scanner(System.in);
      int n = kb.nextInt();
      int fd,ld;
      ld = n%10;
      while(n>=10)
      {
        n = n/10;
      }
      fd=n;
      int sum = fd+ld;
      System.out.println(sum);
	}
}