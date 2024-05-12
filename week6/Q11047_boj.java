package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047_boj {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int cnt = 0;
            Integer[] arr = new Integer[N];

            for (int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }


            for (int i = N-1; i >= 0; i--){
                if(arr[i] <= K){
                    cnt += K / arr[i];
                    K %= arr[i];

                }

            }

            System.out.print(cnt);
        }
}


