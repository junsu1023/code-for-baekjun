import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjun_5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            List<Integer> mathScore = new ArrayList<>();
            List<Integer> scoreDifference = new ArrayList<>();
            for(int j=0; j<student; j++) mathScore.add(Integer.parseInt(st.nextToken()));
            mathScore.sort(Collections.reverseOrder());
            int gap = 0;
            for(int j=0; j<student-1; j++){
                int temp = mathScore.get(j) - mathScore.get(j+1);
                if(temp < 1) temp *= -1;
                if(gap < temp) gap = temp;
            }
            System.out.println("Class " + (i+1));
            System.out.println("Max " + mathScore.get(0) + ", Min " + mathScore.get(mathScore.size()-1) + ", Largest gap " + gap);
        }
        br.close();
    }
}
