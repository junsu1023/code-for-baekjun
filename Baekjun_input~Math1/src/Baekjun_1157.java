import java.util.Scanner;

public class Baekjun_1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr = input.next().toUpperCase();
        int[] count = new int[26];
        int max = 0;
        char result ='?';

        for(int i=0; i<arr.length(); i++){
            count[arr.charAt(i)-65]++;
            if(max<count[arr.charAt(i)-65]) {
                result = arr.charAt(i);
                max = count[arr.charAt(i)-65];
            }
            else if(max == count[arr.charAt(i)-65])
                result = '?';
        }
        System.out.println(result);
    }
}
