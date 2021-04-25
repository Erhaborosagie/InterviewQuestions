/**
 * Created by OSAGIE on 4/25/2021
 */
public class ArrMerge {
    public static void main(String[] args) {

    }

    void encodeArray(int[] A, int[] B, int n) {
        for(int i=0;i<n;i++) {
            A[i] = encodeInteger(A[i], B[i]);
        }
    }

    int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));
        x = x | n;
        return x;
    }
}
