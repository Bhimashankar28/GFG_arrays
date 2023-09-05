
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








/*
import java.util.*;

public class a_searching_elelment_in_an_array
{
    public static int search(int arr[], int N, int X)
    {
        for (int i = 0; i < N; i++)
        {
            if (arr[i] == X)
            {
                return i; // Return the index of X if found
            }
        }
        return -1; // Return -1 if X is not found in the array
    }
}
*/