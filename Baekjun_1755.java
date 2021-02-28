import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjun_1755 {
    public static String[] changeEnglish = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> list = new ArrayList<>();
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        for(int i=start; i<=end; i++){
            String combine = "";
            if(i >= 10) combine = changeEnglish[i/10] + " " + changeEnglish[i%10];
            else combine += changeEnglish[i%10];
            list.add(combine);
        }
        Collections.sort(list);
        int[] saveNum = new int[end-start+2];
        for(int i=0; i<list.size(); i++){
            String[] decomposition = list.get(i).split(" ");
            saveNum[i+1] = Integer.parseInt(cal(decomposition));
        }
        for(int i=1; i<saveNum.length; i++){
            System.out.print(saveNum[i] + " ");
            if(i%10==0) System.out.println();
        }
        br.close();
    }
    public static String cal(String[] num){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num.length; i++){
            switch (num[i]){
                case "zero":
                    sb.append(0);
                    break;
                case "one":
                    sb.append(1);
                    break;
                case "two":
                    sb.append(2);
                    break;
                case "three":
                    sb.append(3);
                    break;
                case "four":
                    sb.append(4);
                    break;
                case "five":
                    sb.append(5);
                    break;
                case "six":
                    sb.append(6);
                    break;
                case "seven":
                    sb.append(7);
                    break;
                case "eight":
                    sb.append(8);
                    break;
                case "nine":
                    sb.append(9);
                    break;
            }
        }
        return sb.toString();
    }
}
