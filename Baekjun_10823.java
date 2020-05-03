import java.util.Scanner;

public class Baekjun_10823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){
            String arr = sc.nextLine();
            s += arr;
        }
        String[] arr = s.split(",");
        int sum = 0;
        for(int i=0; i<arr.length; i++) sum += Integer.parseInt(arr[i]);
        System.out.println(sum);
    }
}
