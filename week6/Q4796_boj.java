package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Q4796_boj {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;

        while(true){
            cnt++;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());


            if (L == 0 && P == 0 && V == 0){
                break;
            }

            int total = L * (V/P) + Math.min(L, (V % P));


            bw.write("Case " + cnt + ": " + total + "\n");


        }
        bw.flush();
        bw.close();

    }

}
