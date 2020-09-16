import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjun_17269 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap();
        map.put('A', 3); map.put('B', 2); map.put('C', 1); map.put('D', 2);
        map.put('E', 4); map.put('F', 3); map.put('G', 1); map.put('H', 3);
        map.put('I', 1); map.put('J', 1); map.put('K', 3); map.put('L', 1);
        map.put('M', 3); map.put('N', 2); map.put('O', 1); map.put('P', 2);
        map.put('Q', 2); map.put('R', 2); map.put('S', 1); map.put('T', 2);
        map.put('U', 1); map.put('V', 1); map.put('W', 1); map.put('X', 2);
        map.put('Y', 2); map.put('Z', 1);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = Math.max(n, m);
        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String s = "";
        for(int i=0; i<max; i++){
            if(n>i) s = s + map.get(a.charAt(i));
            if(m>i) s = s + map.get(b.charAt(i));
        }
        String temp = "";
        while(s.length()!=2){
            for(int i=0; i<s.length()-1; i++){
                temp = temp + Integer.toString(((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10);
            }
            s = temp;
            temp = "";
        }
        if(Integer.parseInt(s)/10==0) s = s.substring(1, 2);
        System.out.println(s + "%");
    }
}
