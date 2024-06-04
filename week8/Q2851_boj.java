package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2851_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[11];
        int sum = 0;
        int near = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];


            if (Math.abs(100 - sum) <= Math.abs(100 - near)) {
                near = sum;
            }
        }

        System.out.println(near);
    }
}