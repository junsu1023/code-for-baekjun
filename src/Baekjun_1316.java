import java.util.Scanner;

public class Baekjun_1316 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int count = 0;
        for(int i=0; i<size; i++){
            String word = input.next();
            int[] arr = new int[26];
            count++;
            for(int j=1; j<word.length(); j++){
                if(word.charAt(j) != word.charAt(j-1)) {
                    arr[word.charAt(j - 1) - 97]--;
                    if(arr[word.charAt(j)-97]==-1) {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
