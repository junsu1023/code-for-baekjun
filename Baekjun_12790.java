import java.util.Scanner;

public class Baekjun_12790 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int hp = sc.nextInt();
            int mp = sc.nextInt();
            int attack = sc.nextInt();
            int defense = sc.nextInt();
            int hp_in = sc.nextInt();
            int mp_in = sc.nextInt();
            int at_in = sc.nextInt();
            int de_in = sc.nextInt();
            hp = hp+hp_in<1 ? 1 : hp+hp_in;
            mp = mp+mp_in<1 ? 5 : (mp+mp_in)*5;
            attack = attack+at_in<0 ? 0 : (attack+at_in)*2;
            defense = (defense+de_in)*2;
            int result = hp+mp+attack+defense;
            System.out.println(result);
        }
    }
}
