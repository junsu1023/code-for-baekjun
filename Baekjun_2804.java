import java.util.Scanner;

public class Baekjun_2804 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();
        int pos1 = -1;
        int pos2 = -1;
        for(int i=0; i<w1.length(); i++){
            for(int j=0; j<w2.length(); j++){
                if(w1.charAt(i) == w2.charAt(j)){
                    pos1 = i;
                    pos2 = j;
                    break;
                }
            }
            if(pos1 != -1 && pos2 != -1) break;
        }
        for(int i=0; i<w2.length(); i++){
            if(i != pos2){
                for(int j=0; j<w1.length(); j++){
                    if(j != pos1) System.out.print(".");
                    else System.out.print(w2.charAt(i));
                }
                System.out.println();
            }
            else System.out.println(w1);
        }
    }
}
