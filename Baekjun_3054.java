import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_3054 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = new String[5];
        arr[0] = "..#..";
        arr[4] = "..#..";
        for(int i=1; i<s.length(); i++){
            if(i%3==2){
                arr[0] += ".*..";
                arr[4] += ".*..";
            }
            else{
                arr[0] += ".#..";
                arr[4] += ".#..";
            }
        }
        arr[1] = ".#.#.";
        arr[3] = ".#.#.";
        for(int i=1; i<s.length(); i++){
            if(i%3==2){
                arr[1] += "*.*.";
                arr[3] += "*.*.";
            }
            else{
                arr[1] += "#.#.";
                arr[3] += "#.#.";
            }
        }
        arr[2] = "#." + s.charAt(0) + ".#";
        for(int i=1; i<s.length(); i++){
            if(i%3==1){
                arr[2] += "." + s.charAt(i);
                if(i == s.length()-1) arr[2] += ".#";
                else arr[2] += ".*";
            }
            else if(i%3==2) arr[2] += "." + s.charAt(i) + ".*";
            else arr[2] += "." + s.charAt(i) + ".#";
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        br.close();
    }
}
