import java.io.*;

public class Baekjun_9536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            String[] cry = br.readLine().split(" ");
            String[] crys = new String[101];
            int cnt = 0;
            while(true){
                String s = br.readLine();
                if(s.equals("what does the fox say?")) break;
                String[] animals_cry = s.split(" ");
                crys[cnt] = animals_cry[2];
                cnt++;
            }
            for(int i=0; i<cry.length; i++){
                boolean check = true;
                for(int j=0; j<cnt; j++){
                    if(cry[i].equals(crys[j])){
                        check = false;
                        break;
                    }
                }
                if(check) sb.append(cry[i]).append(" ");
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
