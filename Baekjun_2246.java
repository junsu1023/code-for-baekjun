import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjun_2246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<CheckCondo> list = new ArrayList<CheckCondo>();
        int cnt = 0;
        for(int i=0; i<n; i++){
            CheckCondo checkCondo = new CheckCondo();
            st = new StringTokenizer(br.readLine());
            checkCondo.distance = Integer.parseInt(st.nextToken());
            checkCondo.price = Integer.parseInt(st.nextToken());
            list.add(checkCondo);
        }
        for(int i=0; i<n; i++){
            boolean check = true;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(list.get(i).distance > list.get(j).distance){
                    if(list.get(i).price >= list.get(j).price){
                        check = false;
                        break;
                    }
                }
                else if(list.get(i).price > list.get(j).price){
                    if(list.get(i).distance >= list.get(j).distance){
                        check = false;
                        break;
                    }
                }
            }
            if(check) cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}
class CheckCondo implements Comparable<CheckCondo>{
    int distance;
    int price;
    public CheckCondo(int distance, int price) {
        this.distance = distance;
        this.price = price;
    }
    public CheckCondo() { }
    @Override
    public int compareTo(CheckCondo o) {
        if(this.distance > o.distance) return 1;
        else return -1;
    }
}
