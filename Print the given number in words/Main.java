import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    Scanner kb=new Scanner(System.in);
     int n=kb.nextInt();
      if(n==1)
        System.out.println("One");
      else if(n==2)
        System.out.println("Two");
        else if(n==3)
        System.out.println("Three");
        else if(n==4)
        System.out.println("Four");
        else if(n==5)
        System.out.println("Five");
      else
         System.out.println("Invalid");
	}
}