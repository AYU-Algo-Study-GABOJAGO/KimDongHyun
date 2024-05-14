package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931_boj {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int cnt = 0;
        int just_before_meet = 0;

        int[][] meet = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            meet[i][0] = Integer.parseInt(st.nextToken());
            meet[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meet, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }

        });

        for(int i = 0; i < N; i++) {
            if(just_before_meet <= meet[i][0]) {
                just_before_meet = meet[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}