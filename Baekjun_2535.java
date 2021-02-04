import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjun_2535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nationCnt = new int[n];
        StringBuilder sb = new StringBuilder();
        List<Inform> list = new ArrayList<Inform>();
        int grade = 0;
        for(int i=0; i<n; i++){
            Inform inform = new Inform();
            StringTokenizer st = new StringTokenizer(br.readLine());
            inform.nation = Integer.parseInt(st.nextToken());
            inform.studentNumber = Integer.parseInt(st.nextToken());
            inform.score = Integer.parseInt(st.nextToken());
            list.add(inform);
        }
        list.sort(Comparator.naturalOrder());
        for(int i=0; i<n; i++){
            if(nationCnt[list.get(i).nation] != 2){
                nationCnt[list.get(i).nation]++;
                sb.append(list.get(i)).append("\n");
                grade++;
            }
            if(grade == 3) break;
        }
        System.out.println(sb.toString());
        br.close();
    }
}
class Inform implements Comparable<Inform>{
    int nation;
    int studentNumber;
    int score;
    public Inform() { }
    public Inform(int nation, int studentNumber, int score){
        this.nation = nation;
        this.studentNumber = studentNumber;
        this.score = score;
    }
    public String toString(){
        return nation + " " + studentNumber;
    }
    @Override
    public int compareTo(Inform o) {
        if(o.score > this.score) return 1;
        else return -1;
    }
}
