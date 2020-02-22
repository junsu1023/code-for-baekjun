import java.util.Scanner;

public class Baekjun_2798 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int total = input.nextInt();
        int result = 0;
        int[] card = new int[num];
        for(int i=0; i<num; i++) {
            card[i] = input.nextInt();
        }
        for(int i=0; i<num-2; i++){
            for(int j=i+1; j<num-1; j++){
                for(int k=j+1; k<num; k++){
                    if(card[i] + card[j] + card[k] <= total && total-(card[i] + card[j] + card[k]) < total-result){
                        result = card[i] + card[j] + card[k];
                    }
                }
            }
        }
        System.out.println(result);
    }
}
