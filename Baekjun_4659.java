import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String password = br.readLine();
            if(password.equals("end")) break;
            int consonant = 0;
            int vowel = 0;
            boolean[] check = {false, true, true};
            for(int i=0; i<password.length(); i++){
                if(password.charAt(i) == 'a' || password.charAt(i) == 'e' || password.charAt(i) == 'i' || password.charAt(i) == 'o' || password.charAt(i) == 'u'){
                    check[0] = true;
                    vowel++;
                    consonant = 0;
                    if(vowel == 3){
                        check[1] = false;
                        break;
                    }
                }
                else{
                    consonant++;
                    vowel = 0;
                    if(consonant == 3){
                        check[1] = false;
                        break;
                    }
                }
                if(i > 0){
                    if(password.charAt(i) == password.charAt(i-1)){
                        if(password.charAt(i) != 'e' && password.charAt(i) !='o') check[2] = false;
                    }
                }
            }
            if(check[0] && check[1] && check[2]) System.out.println("<" + password + "> is acceptable.");
            else System.out.println("<" + password + "> is not acceptable.");
        }
        br.close();
    }
}
