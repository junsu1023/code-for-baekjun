import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjun_21866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int[] scoreArray = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int sum = 0;
        for(int i=0; i<9; i++) {
            list.add(Integer.parseInt(st.nextToken()));
            sum += list.get(i);
        }
        boolean draw = false;
        boolean hacker = false;
        if(sum >= 100) draw = true;
        for(int i=0; i<9; i++){
            if(list.get(i) > scoreArray[i]){
                hacker = true;
                break;
            }
        }
        if(hacker) System.out.println("hacker");
        else if(!hacker && draw) System.out.println("draw");
        else System.out.println("none");
        br.close();
    }
}
