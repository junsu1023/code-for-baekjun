import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_2309 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] dwarf = new int[9];
        boolean check = false;
        for(int i=0; i<9; i++){
            dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }
        int ndwarf = -1;
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                if(sum - dwarf[i] - dwarf[j] == 100){
                    dwarf[i] = ndwarf;
                    dwarf[j] = ndwarf;
                    check = true;
                    break;
                }
            }
            if(check) break;
        }
        Arrays.sort(dwarf);
        for(int i=0; i<9; i++){
            if(dwarf[i] != ndwarf) System.out.println(dwarf[i]);
        }
    }
}
