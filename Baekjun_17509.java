import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjun_17509 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Problem> list = new ArrayList<>();
        for(int i=0; i<11; i++){
            Problem problem = new Problem();
            StringTokenizer st = new StringTokenizer(br.readLine());
            problem.minute = Integer.parseInt(st.nextToken());
            problem.incorrect = Integer.parseInt(st.nextToken());
            list.add(problem);
        }
        Collections.sort(list);
        int time = 0;
        int penalty = 0;
        for(int i=0; i<11; i++){
            time += list.get(i).minute;
            penalty += (time + 20 * list.get(i).incorrect);
        }
        System.out.println(penalty);
        br.close();
    }
}
class Problem implements Comparable<Problem>{
    int minute;
    int incorrect;

    public Problem(int minute, int incorrect) {
        this.minute = minute;
        this.incorrect = incorrect;
    }

    public Problem() {}

    @Override
    public int compareTo(Problem o) {
        if(this.minute > o.minute) return 1;
        else if(this.minute == o.minute){
            if(this.incorrect > o.incorrect) return 1;
            else return -1;
        }
        else return -1;
    }
}
