import java.util.ArrayList;
import java.util.List;

/**
 * Created by OSAGIE on 4/25/2021
 */
public class FibonachiSeries {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(fibN(n));
    }

    private static List<Integer> fibN(int n) {
        List<Integer> fib = new ArrayList<>();

        fib.add(0);
        if (n==1){
            return fib;
        }

        fib.add(1);
        if (n==2){
            return fib;
        }

        int a = 0;
        int b = 1;
        int i = 2;
        while (i<n){
            int c = a+b;
            fib.add(c);
            a=b;
            b=c;
            i++;
        }

        return fib;
    }
}
