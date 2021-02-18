import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_14405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        boolean check = true;
        int index = 0;
        while(index < word.length()){
            if (word.charAt(index) == 'p') {
                if(index + 2 <= word.length()) {
                    if (word.charAt(index + 1) == 'i') {
                        index += 2;
                    }
                    else {
                        check = false;
                        break;
                    }
                }
                else{
                    check = false;
                    break;
                }
            }
            else if(word.charAt(index) == 'k'){
                if(index + 2 <= word.length()) {
                    if (word.charAt(index + 1) == 'a') {
                        index += 2;
                    }
                    else{
                        check = false;
                        break;
                    }
                }
                else{
                    check = false;
                    break;
                }
            }
            else if(word.charAt(index) == 'c'){
                if(index + 3 <= word.length()) {
                    if (word.charAt(index + 1) == 'h' && word.charAt(index + 2) == 'u') {
                        index += 3;
                    }
                    else {
                        check = false;
                        break;
                    }
                }
                else{
                    check = false;
                    break;
                }
            }
            else{
                check = false;
                break;
            }
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
        br.close();
    }
}
