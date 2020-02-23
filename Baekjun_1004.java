import java.util.Scanner;

public class Baekjun_1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int x1, y1, x2, y2, num = 0;
        Planet planet;
        for(int tc=0; tc<test_case; tc++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            num = sc.nextInt();
            int count = 0;
            for(int i=0; i<num; i++){
                planet = new Planet(sc.nextInt(), sc.nextInt(), sc.nextInt());
                count += distance(x1, y1, x2, y2, planet);
            }
            System.out.println(count);
        }
    }

    public static int distance(int x1, int y1, int x2, int y2, Planet planet){
        int d1 = (planet.px-x1) * (planet.px-x1) + (planet.py-y1) * (planet.py-y1);
        int d2 = (planet.px-x2) * (planet.px-x2) + (planet.py-y2) * (planet.py-y2);
        int r = planet.r * planet.r;
        if((d1>r && d2<r) || (d1<r && d2>r)) return 1;
        else return 0;
    }
}
class Planet{
    int px, py, r;
    public Planet(int px, int py, int r){
        this.px = px;
        this.py = py;
        this.r = r;
    }
}
