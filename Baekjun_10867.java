import java.util.*;

public class Baekjun_10867 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        list.add(sc.nextInt());
        for(int i=0; i<n-1; i++){
            int num = sc.nextInt();
            for(int j=0; j<list.size(); j++){
                if(num == list.get(j)) break;
                if(j == list.size()-1){
                    list.add(num);
                    break;
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        for(int i : list) sb.append(i + " ");
        System.out.println(sb.toString());
    }
}
