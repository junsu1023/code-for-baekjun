import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Baekjun_11005 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character> list = new LinkedList();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        while(n>0){
            if(n%b < 10) list.add((char)(n%b + '0'));
            else list.add((char)(n%b-10 + 'A'));
            n/=b;
        }
        for(int i=list.size()-1; i>=0; i--) bw.write(list.get(i));
        bw.flush();
        br.close();
        bw.close();
    }
}
