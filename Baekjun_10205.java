import java.io.*;

public class Baekjun_10205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int data_set = Integer.parseInt(br.readLine());
        for(int ds=1; ds<=data_set; ds++){
            StringBuilder sb = new StringBuilder();
            sb.append("Data Set ").append(ds).append(":\n");
            int head = Integer.parseInt(br.readLine());
            int total_head = head;
            String cut_kind = br.readLine();
            for(int i=0; i<cut_kind.length(); i++){
                if(total_head == 0) break;
                if(cut_kind.charAt(i) == 'b') total_head--;
                else if(cut_kind.charAt(i) == 'c') total_head++;
            }
            sb.append(total_head).append("\n");
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
