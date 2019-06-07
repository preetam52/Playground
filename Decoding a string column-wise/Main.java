import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        int col_count = sc.nextInt();
        int str_length = str.length();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int sb1_len = 0 ;
        for(int i = 0 ; i < str_length ; i++)
        {
            if(str.charAt(i) != ' ')
           {
            sb1.append(str.charAt(i));
            sb1_len++;
           }
        }
        int row_count = (sb1_len / col_count) + 1 ;
        int sb1_length = row_count * col_count ;
        int new_ele_add = sb1_length - sb1_len;
        for(int i = 0 ; i < new_ele_add ; i++)
        {
            sb1.append('X');
        }
        
        int end = col_count, start = 0 ;
        for(int i = 1 ; i <= row_count ; i++)
        {
            if(i % 2 != 0)
            {
                for(int j = start ; j < end ; j++)
                {
                    sb2.append(sb1.charAt(j));
                }
            }
            else
            {
                int idx = end + col_count - 1 ;
                for(int k = end ; k < end + col_count ; k++)
                {
                    sb2.append(sb1.charAt(idx));
                    idx--;
                }
                start = end + col_count;
                end = start + col_count;
            }
        }
        for(int i = 0 ; i < col_count ; i++)
        {
            sb3.append(sb2.charAt(i));
            for(int j = i + col_count ; j < sb1_length ; j+= col_count)
            {
                
                sb3.append(sb2.charAt(j));
            }
        }
        System.out.print(sb3);
    }
}