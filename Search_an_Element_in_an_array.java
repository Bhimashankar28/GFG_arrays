
import java.util.*;
public class Search_an_Element_in_an_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        int b=sc.nextInt();
        int x=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==b)
            {
                x=i;
                break;
            }
        }
        System.out.println(x);
    }
}
