import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjun_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] word = new String[num];
        int i;
        for(i=0; i<num; i++){
            word[i] = br.readLine();
        }
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        int len, len2, j;
        for(i=0; i<num; i++){
            len = word[i].length();
            for(j=i+1; j<num; j++){
                len2 = word[j].length();
                if(len != len2) break;
            }
            Arrays.sort(word, i, j);
            i = j-1;
        }

        System.out.println(word[0]);
        for(i=1; i<num; i++) {
            if (word[i - 1].equals(word[i])) continue;
            System.out.println(word[i]);
        }
    }
}
