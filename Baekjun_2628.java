import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjun_2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> rowCutPoint = new ArrayList<>();
        List<Integer> colCutPoint = new ArrayList<>();
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int kind = Integer.parseInt(st.nextToken());
            int pos = Integer.parseInt(st.nextToken());
            if(kind == 0) rowCutPoint.add(pos);
            else colCutPoint.add(pos);
        }
        rowCutPoint.add(0);
        rowCutPoint.add(col);
        colCutPoint.add(0);
        colCutPoint.add(row);
        Collections.sort(rowCutPoint);
        Collections.sort(colCutPoint);
        int[] rowCutLength = new int[rowCutPoint.size()-1];
        int[] colCutLength = new int[colCutPoint.size()-1];
        for(int i=1;  i<rowCutPoint.size(); i++){
            rowCutLength[i-1] = rowCutPoint.get(i) - rowCutPoint.get(i-1);
        }
        for(int i=1; i<colCutPoint.size(); i++){
            colCutLength[i-1] = colCutPoint.get(i) - colCutPoint.get(i-1);
         }
        int max = 0;
        for(int i=0; i<rowCutLength.length; i++){
            for(int j=0; j<colCutLength.length; j++){
                int area = rowCutLength[i] * colCutLength[j];
                if(area > max) max = area;
            }
        }
        System.out.println(max);
        br.close();
    }
}