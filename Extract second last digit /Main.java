import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner kb=new Scanner(System.in);
      int n=kb.nextInt();
      int n1=(n/10)%10;
      System.out.println(n1);
	}
}