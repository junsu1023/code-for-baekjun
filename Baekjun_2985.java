import java.io.*;

public class Baekjun_2985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cal = br.readLine().split(" ");
        int a = Integer.parseInt(cal[0]);
        int b = Integer.parseInt(cal[1]);
        int c = Integer.parseInt(cal[2]);
        if(b + c == a) System.out.println(a + "=" + b + "+" + c);
        else if(b - c == a) System.out.println(a + "=" + b + "-" + c);
        else if(b * c == a) System.out.println(a + "=" + b + "*" + c);
        else if(b / c == a) System.out.println(a + "=" + b + "/" + c);
        else if(a + b == c) System.out.println(a + "+" + b + "=" + c);
        else if(a - b == c) System.out.println(a + "-" + b + "=" + c);
        else if(a * b == c) System.out.println(a + "*" + b + "=" + c);
        else if(a / b == c) System.out.println(a + "/" + b + "=" + c);
        br.close();
    }
}
