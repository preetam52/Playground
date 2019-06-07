import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner kb = new Scanner(System.in);
      int n = kb.nextInt();
      for(int i=1;i<=2*n;i++)
      {
        if(i%2==1)
         System.out.println(i);
      }
	}
}