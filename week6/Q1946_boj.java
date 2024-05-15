package week6;
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1946_boj {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            for(int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a-1] = b;
            }
            int cnt =1;
            int rating = arr[0];

            for(int i=1; i<N; i++) {
                if(rating>arr[i]) {
                    cnt++;
                    rating = arr[i];
                }
            }
            sb.append(cnt+"\n");
        }
        System.out.println(sb.toString());
    }
}