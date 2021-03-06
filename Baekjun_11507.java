import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_11507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cards = br.readLine();
        String[] card = new String[cards.length()/3];
        int idx = 0;
        for(int i=0; i<card.length; i++){
            card[i] = cards.substring(idx, idx+3);
            idx += 3;
        }
        int[] cardCnt = {13, 13, 13, 13};
        boolean check = true;
        for(int i=0; i<card.length; i++){
            for(int j=i+1; j<card.length; j++){
                if(card[i].equals(card[j])){
                    check = false;
                    break;
                }
            }
            if(!check){
                System.out.println("GRESKA");
                break;
            }
            if(card[i].charAt(0) == 'P') cardCnt[0]--;
            else if(card[i].charAt(0) == 'K') cardCnt[1]--;
            else if(card[i].charAt(0) == 'H') cardCnt[2]--;
            else if(card[i].charAt(0) == 'T') cardCnt[3]--;
        }
        if(check) {
            for (int i = 0; i < 4; i++) System.out.print(cardCnt[i] + " ");
            br.close();
        }
    }
}
