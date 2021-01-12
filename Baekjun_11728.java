import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a_size = Integer.parseInt(st.nextToken());
        int b_size = Integer.parseInt(st.nextToken());
        int[] arr_a = new int[a_size];
        int[] arr_b = new int[b_size];
        int[] result = new int[a_size+b_size];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a_size; i++) arr_a[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr_a);
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b_size; i++) arr_b[i] = Integer.parseInt(st.nextToken());
        int i=0;
        int j=0;
        int k=0;
        while(i<a_size && j<b_size){
            if(arr_a[i] > arr_b[j]) result[k++] = arr_b[j++];
            else result[k++] = arr_a[i++];
        }
        while(i < a_size) result[k++] = arr_a[i++];
        while(j < b_size) result[k++] = arr_b[j++];
        for(int a=0; a<result.length; a++) sb.append(result[a] + " ");
        System.out.println(sb.toString());
        br.close();
    }
}
