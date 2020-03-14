import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Baekjun_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<>();
        for(int tc=0; tc<test_case; tc++){
            int n = Integer.parseInt(br.readLine());
            while(n != 0){
                list.add(n%2);
                n/=2;
            }
            for(int i=0; i<list.size(); i++){
                if(list.get(i) == 1) System.out.print(i + " ");
            }
            System.out.println();
            list.clear();
        }
    }
}
