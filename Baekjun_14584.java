import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_14584 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String encryptedText = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] dictionary = new String[n];
        for(int i=0; i<n; i++) dictionary[i] = br.readLine();
        boolean check = false;
        String decryptedText = "";
        int change = 0;
        while(!check){
            for(int i=0; i<encryptedText.length(); i++){
                int t = encryptedText.charAt(i) + change;
                if(t>122) t -= 26;
                char temp = (char)t;
                decryptedText += temp;
            }
            change++;
            for(int i=0; i<n; i++){
                if(decryptedText.contains(dictionary[i])){
                    check = true;
                    break;
                }
            }
            if(!check) decryptedText = "";
        }

        System.out.println(decryptedText);
        br.close();
    }
}
