import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baekjun_9506 {
    public static void main(String []args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringBuilder sb = new StringBuilder();
            List<Integer> list = new LinkedList();
            int n = Integer.parseInt(br.readLine());
            if(n==-1) break;
            int sum = 0;
            for(int i=1; i<=(int)Math.sqrt(n); i++){
                if(n%i==0){
                    if(n/i != i){
                        if(n/i != n){
                            sum += (i+n/i);
                            list.add(i);
                            list.add(n/i);
                        }
                        else{
                            sum += i;
                            list.add(i);
                        }
                    }
                    else{
                        sum += i;
                        list.add(i);
                    }
                }
            }
            Collections.sort(list);
            if(n == sum){
                sb.append(n).append(" = ");
                for(int i=0; i<list.size()-1; i++) sb.append(list.get(i) + " + ");
                sb.append(list.get(list.size()-1));

            }
            else sb.append(n + " is NOT perfect.");
            bw.write(sb.toString()+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
