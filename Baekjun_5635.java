import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjun_5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Birthday> list = new ArrayList<Birthday>();
        for(int i=0; i<n; i++){
            Birthday birthday = new Birthday();
            StringTokenizer st = new StringTokenizer(br.readLine());
            birthday.name = st.nextToken();
            birthday.day = Integer.parseInt(st.nextToken());
            birthday.month = Integer.parseInt(st.nextToken());
            birthday.year = Integer.parseInt(st.nextToken());
            list.add(birthday);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        br.close();
    }
}
class Birthday implements Comparable<Birthday>{
    String name;
    int day;
    int month;
    int year;
    public Birthday(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Birthday() { }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public int compareTo(Birthday o) {
        if(o.year > this.year) return 1;
        else if(o.year < this.year) return -1;
        else if(o.month > this.month) return 1;
        else if(o.month < this.month) return -1;
        else if(o.day > this.day) return 1;
        return -1;
    }
}
