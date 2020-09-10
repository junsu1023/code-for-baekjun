import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjun_17294 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int r = 0;
        int a = Integer.parseInt(String.valueOf(line.charAt(0)));
        boolean chk = true;
        if (line.length() > 2) {
            for (int i = 1; i < line.length(); i++) {
                int b = Integer.parseInt(String.valueOf(line.charAt(i)));
                if (i == 1) r = b - a;
                else {
                    if (b - a != r) {
                        chk = false;
                    }
                }
                a = b;
            }
        }
        if(chk) System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        else System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
        br.close();
    }

}
