import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjun_2108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] n = new int[num];

        for(int i=0; i<num; i++){
            n[i] = input.nextInt();
        }
        Arrays.sort(n);

        System.out.println(avg(n));
        System.out.println(middle(n));
        System.out.println(many(n));
        System.out.println(range(n));
    }

    public static int avg(int[] n){
        double sum = 0;
        double average = 0;
        for(int i:n){
            sum += i;
        }
        average = Math.round(sum/n.length);
        return (int)Math.ceil(average);
    }

    public static int middle(int[] n){
        return n[(n.length)/2];
    }

    public static int many(int[] n) {
        int[] cnt = new int [8001];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;

        for(int x:n) {
            if(x<0) {
                cnt[Math.abs(x)+4000]++;
            }else cnt[x]++;
        }

        int idx =0;
        for(int i=0;i<cnt.length;i++) {
            if(cnt[i]!=0 && cnt[i]>max) {
                max = cnt[i];
                idx = i;
            }
        }

        for(int i=0;i<cnt.length;i++) {
            int x=i;
            if(cnt[i]==max) {
                if(i>4000) {
                    x-=4000;
                    x*=-1;
                    arrayList.add(x);
                }
                else
                    arrayList.add(i);
            }
        }
        Collections.sort(arrayList);

        if(arrayList.size()>1) return arrayList.get(1);
        else return arrayList.get(0);
    }

    public static int range(int[] n){
        return n[n.length-1] - n[0];
    }
}
