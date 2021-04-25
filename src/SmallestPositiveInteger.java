import java.util.Arrays;

/**
 * Created by OSAGIE on 4/25/2021
 */
public class SmallestPositiveInteger {
    public static void main(String[] args)
    {
        int[] arr = {-1, -3};

        Arrays.sort(arr);

        System.out.println(smallestPositiveInteger(arr));
    }

    private static int smallestPositiveInteger(int[] arr) {
        int i = 0;
        int lastItem = 0;
        for (int item:arr){
            if (item<1) continue;

            i++;
            if (i!=item) return i;

            lastItem = item;
        }

        //No positive integer
        return lastItem+1;
    }
}
