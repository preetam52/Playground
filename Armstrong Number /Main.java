import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner kb = new Scanner(System.in);
      int n = kb.nextInt();
      int temp=0,num=n,arm=0,rem,p=n;
      while(num!=0)
      {
        num=num/10;
        temp=temp+1;
        
      }
     while(p!=0)
     {
         rem=p%10;
         arm=arm+(int) Math.pow(rem,temp);
         p=p/10;
         
     }
     if(arm==n)
     System.out.println("Armstrong Number");
     else
     System.out.println("Not a Armstrong Number");
    }
}