import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_11800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        String[] str1 = {"Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
        String[] str2 = {"Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};
        for(int tc=0; tc<test_case; tc++){
            String[] in = br.readLine().split(" ");
            int sang = Integer.parseInt(in[0]);
            int chang = Integer.parseInt(in[1]);
            int max = Math.max(sang, chang);
            int min = Math.min(sang, chang);
            if(max == min) System.out.println("Case " + (tc+1) + ": " + str2[max-1]);
            else{
                if(max == 6 && min == 5) System.out.println("Case " + (tc+1) + ": " + "Sheesh Beesh");
                else {
                    String s1 = str1[max - 1];
                    String s2 = str1[min - 1];
                    System.out.println("Case " + (tc + 1) + ": " + s1 + " " + s2);
                }
            }
        }
        br.close();
    }
}
