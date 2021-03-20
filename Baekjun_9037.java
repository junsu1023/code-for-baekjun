import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_9037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int student = Integer.parseInt(br.readLine());
            int[] candy = new int[student];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<student; j++){
                candy[j] = Integer.parseInt(st.nextToken());
                if(candy[j] % 2 == 1) candy[j] += 1;
            }
            if(student == 1){
                System.out.println(0);
                continue;
            }
            System.out.println(changeCandy(candy, student));
        }
        br.close();
    }
    public static int changeCandy(int[] candy, int student){
        boolean check = true;
        int[] saveCandy = new int[student];
        int[] save = new int[student];
        for(int i=0; i<student; i++) saveCandy[i] = candy[i];
        int first = saveCandy[0];
        for(int i=1; i<student; i++){
            if(first != saveCandy[i]){
                check = false;
                break;
            }
        }
        int cnt = 0;
        int idx = 0;
        while(!check){
            boolean temp = true;
            int minus = candy[idx % student] / 2;
            int plus = candy[(idx+student-1) % student] / 2;
            int total = plus - minus;
            saveCandy[idx % student] += total;
            if(saveCandy[idx % student] % 2 == 1) saveCandy[idx % student] += 1;
            save[idx % student] = saveCandy[idx % student];
            if(idx % student == (student-1)){
                for(int i=0; i<student; i++) candy[i] = save[i];
                int standard = saveCandy[0];
                for(int i=1; i<student; i++){
                    if(standard != saveCandy[i]){
                        temp = false;
                        break;
                    }
                }
                if(temp) check = true;
                cnt++;
            }
            idx++;
        }
        return cnt;
    }
}
