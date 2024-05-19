package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] num = new int[301];
        int[] result = new int[301];
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(num[1]);
            return;
        } else if (N == 2) {
            System.out.println(num[1] + num[2]);
            return;
        }

        result[1] = num[1];
        result[2] = num[1] + num[2];
        result[3] = Math.max(num[1] + num[3], num[2] + num[3]);

        for (int n = 4; n <= N; n++) {
            result[n] = Math.max(result[n - 3] + num[n - 1], result[n - 2]) + num[n];
        }

        System.out.println(result[N]);
    }
}
