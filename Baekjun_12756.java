import java.util.Scanner;

public class Baekjun_12756 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] attack = new int[2];
        int[] life = new int[2];
        for(int i=0; i<2; i++){
            attack[i] = sc.nextInt();
            life[i] = sc.nextInt();
        }
        while(true){
            life[0] -= attack[1];
            life[1] -= attack[0];
            if(life[0]<=0 || life[1]<=0) {
                break;
            }
        }
        if(life[0]<=0 && life[1]<=0) System.out.println("DRAW");
        else if(life[1]<=0) System.out.println("PLAYER A");
        else if(life[0]<=0) System.out.println("PLAYER B");
    }
}
