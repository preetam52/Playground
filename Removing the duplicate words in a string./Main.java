 import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = new String();
    str = sc.nextLine();
    int str_length = str.length();
    int space_count = 0 ;
    int new_count = 0 ;
    for(int i = 0 ; i < str_length ; i++)
    {
        if(str.charAt(i) == ' ')
        space_count++;
    }
    String arr[] = str.split(" ",space_count+1);
    String res[] = new String[space_count+1];
    int idx = 0 ;
    for(int i = 0 ; i < space_count+1 ; i++)
    {
        for(int j = i+1 ; j < space_count+1 ; j++)
        {
            if(arr[i].equals(arr[j]))
            {
               arr[j] = "$$$$" ;
               
            }
        } 
    }
    
    for(int i = 0 ; i < space_count+1 ; i++)
        {
            if(arr[i].equals("$$$$"))
            {
                new_count++;
            }
            else
            {
                res[idx] = arr[i];
                idx++;
             }
        }
    for(int i = 0 ; i < space_count+1-new_count ; i++)
    System.out.print(res[i]+" ");
  }
}