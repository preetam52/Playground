import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner kb=new Scanner(System.in);
      int n=kb.nextInt();
     int a=n/100;
      int b=n%10;
      int sum=a+b;
       System.out.println(sum);
	}
}