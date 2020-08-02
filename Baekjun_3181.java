import java.io.*;

public class Baekjun_3181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        if(input[0].charAt(0) >= 'a' && input[0].charAt(0) <= 'z') sb.append((char)(input[0].charAt(0) - 32));
        else if(input[0].charAt(0) >= 'A' && input[0].charAt(0) <= 'Z') sb.append(input[0].charAt(0));
        for(int i=1; i<input.length; i++){
            boolean check = true;
            if(input[i].equals("i") || input[i].equals("pa") || input[i].equals("te") || input[i].equals("ni")
            || input[i].equals("niti") || input[i].equals("a") || input[i].equals("ali") || input[i].equals("nego")
            || input[i].equals("no") || input[i].equals("ili")) check = false;
            if(check){
                if(input[i].charAt(0) >= 'a' && input[i].charAt(0) <= 'z') sb.append((char)(input[i].charAt(0) - 32));
                else if(input[i].charAt(0) >= 'A' && input[i].charAt(0) <= 'Z') sb.append(input[i].charAt(0));
            }
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
