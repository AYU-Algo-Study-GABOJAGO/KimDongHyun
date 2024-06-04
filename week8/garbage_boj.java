package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class garbage_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] T = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            T[i] = Integer.parseInt(st.nextToken());
        }

        int[] max = new int[M];
        int result = 0;

        for(int i = 0; i < M; i++){
            int j = 0;
            max[i] = T[j] + T[j+1] + T[j+2];
            j++;
        }

        for(int k = 0; k < M; k++){
            result = Math.max(max[k],max[k+1]);
        }
        System.out.println(result);
    }
}