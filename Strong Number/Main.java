import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int fact=1,num=n,sum=0;
        while(num!=0)
        {
            fact=1;
        int rem=num%10;
        
        for(int i=1;i<=rem;i++)
        {
            fact=fact*i;
            
        }
         sum=sum+fact;
        num=num/10;
    }
      if(n==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}