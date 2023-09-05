import java.util.*;
public class b_missing_element_in_ap
{
    int findMissing(int[] arr, int n)
    {
        int commonDifference=(arr[n-1]-arr[0])/n;
        int missing=-1;
        for(int i=0;i<n;++i)
        {
            int difference=arr[i+1]-arr[i];
            if(difference!=commonDifference)
            {
                missing=arr[i]+commonDifference;
                break;
            }
        }
        return missing;

    }
}
