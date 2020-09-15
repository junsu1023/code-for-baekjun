import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_17293 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=n; i>=0; i--){
            if(i==1) sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n").append("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
            else if(i==0){
                if(n==1) sb.append("No more bottles of beer on the wall, no more bottles of beer.\n").append("Go to the store and buy some more, ").append(n).append(" bottle of beer on the wall.");
                else sb.append("No more bottles of beer on the wall, no more bottles of beer.\n").append("Go to the store and buy some more, ").append(n).append(" bottles of beer on the wall.");
            }
            else if(i==2) sb.append("2 bottles of beer on the wall, ").append("2 bottles of beer.\n").append("Take one down and pass it around, 1 bottle of beer on the wall.\n\n");
            else {
                sb.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n").append("Take one down and pass it around, ").append(i-1).append(" bottles of beer on the wall.\n\n");
            }
        }
        System.out.println(sb.toString());
    }
}
