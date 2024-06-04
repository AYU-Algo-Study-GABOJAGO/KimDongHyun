package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Q1654_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long min = 1; // LAN 케이블의 최소 길이
        long max = arr[K - 1]; // 가장 긴 케이블의 길이

        long mid = 0;

        while (min <= max) {
            mid = (min + max) / 2;

            long count = 0;
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if (count < N) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(max);
    }
}
