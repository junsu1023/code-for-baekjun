import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_15734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        if (L > R) {
            if (L - R > A) {
                R += A;
                System.out.println(2*R);
            }
            else if (L - R < A) {
                A -= L - R;
                R += L - R;
                int temp = A / 2;
                A -= temp;
                L += temp;
                R += A;
                if (L == R) System.out.println(2 * L);
                else if (L != R) System.out.println((L + R) - (Math.abs(L - R)));
            }
            else if (L - R == A)  System.out.println(2 * L);
        }
        else if (L < R) {
            if (R - L > A) {
                L += A;
                System.out.println(2*L);
            } else if (R - L < A) { //균등히 나누어 준 후 계산
                A -= R - L;
                L += R - L;
                int temp = A / 2;
                A -= temp;
                L += temp;
                R += A;
                if (L == R) System.out.println(2*L);
                else if (L != R) System.out.println((L + R) - (Math.abs(L - R)));
            }
            else if (R - L == A)  System.out.println(2*R);
        }
        else if (L == R) {
            int temp = A / 2;
            A -= temp;
            L += temp;
            R += A;
            if (L == R) System.out.println(2*L);
            else if (L != R) System.out.println((L + R) - (Math.abs(L - R)));
        }
    }
}
