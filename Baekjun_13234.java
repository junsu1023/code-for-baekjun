import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_13234 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] c = br.readLine().split(" ");
        String check = "";
        if(c[1].equals("AND")){
            if(c[0].equals("true")){
                if(c[2].equals("true")) check = "true";
                else if(c[2].equals("false")) check = "false";
            }
            else{
                if(c[2].equals("true")) check = "false";
                else if(c[2].equals("false")) check = "false";
            }
        }
        else{
            if(c[0].equals("true")){
                if(c[2].equals("true")) check = "true";
                else if(c[2].equals("false")) check = "true";
            }
            else{
                if(c[2].equals("true")) check = "true";
                else if(c[2].equals("false")) check = "false";
            }
        }
        bw.write(check);
        bw.flush();
        br.close();
        bw.close();
    }
}
