import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_16360 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int tc=0; tc<n; tc++){
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            char word = s.charAt(s.length()-1);
            switch (word){
                case 'a':
                case 'o':
                case 'u':
                    sb.append(s.substring(0, s.length())).append("s");
                    break;
                case 'i':
                    sb.append(s).append("os");
                    break;
                case 'y':
                    sb.append(s.substring(0, s.length()-1)).append("ios");
                    break;
                case 'l':
                case 'r':
                case 'v':
                    sb.append(s).append("es");
                    break;
                case 'n':
                    sb.append(s.substring(0, s.length()-1)).append("anes");
                    break;
                case 'e':
                    if(s.length()>1 && s.charAt(s.length()-2)=='n'){
                        sb.append(s.substring(0, s.length()-2)).append("anes");
                    }
                    else sb.append(s).append("us");
                    break;
                case 't':
                case 'w':
                    sb.append(s).append("as");
                    break;
                default:
                    sb.append(s).append("us");
            }
            System.out.println(sb.toString());
        }
    }
}
