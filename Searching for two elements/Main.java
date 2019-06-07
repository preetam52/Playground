import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      
       Scanner kb = new Scanner(System.in);
      int arr_size = kb.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
          arr[i] = kb.nextInt();
      }
       int search_elem_1 = kb.nextInt();
       int search_elem_2 = kb.nextInt();
      int elem_idx_1 = -1;
       int elem_idx_2 = -1;
      for(int i=0;i<arr_size;i++)
      {
        if(search_elem_1 == arr[i])
          elem_idx_1 = i;
      
      if(search_elem_2 == arr[i])
        elem_idx_2 = i;
      }
        System.out.println(elem_idx_1);
      System.out.println(elem_idx_2);
    }
  
}