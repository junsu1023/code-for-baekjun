import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baekjun_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> list = new LinkedList<>();
        String n = br.readLine();
        int sum = 0;
        boolean zero = false;
        for(int i=0; i<n.length(); i++){
            list.add(n.charAt(i));
            sum += Integer.parseInt(Character.toString(n.charAt(i)));
            if(n.charAt(i) == '0') zero = true;
        }
        if(!zero) System.out.println(-1);
        else{
            if(sum % 3 == 0) {
                list.sort(Collections.reverseOrder());
                for (char i : list) System.out.print(i);
            }
            else{
                System.out.println(-1);
            }
        }
        br.close();
    }
}
