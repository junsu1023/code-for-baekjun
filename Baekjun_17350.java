import java.io.*;

public class Baekjun_17350 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean check = false;
        for(int i=0; i<n; i++){
            String name = br.readLine();
            if(name.equals("anj")){
                check = true;
                break;
            }
        }
        if(check) bw.write("뭐야;\n");
        else bw.write("뭐야?\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
