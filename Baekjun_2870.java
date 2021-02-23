import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Baekjun_2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<BigInteger> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] word = br.readLine().split("\\D");
            for(int j=0; j<word.length; j++){
                if(!word[j].equals("")) list.add(new BigInteger(word[j]));
            }
        }
        list.sort(null);
        for(BigInteger i:list) System.out.println(i);
    }
}
