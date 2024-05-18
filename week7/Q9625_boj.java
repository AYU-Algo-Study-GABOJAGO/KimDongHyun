package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9625_boj {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        // int[] arr = new int[K];
        int a = 0, b = 1;

        for (int i = 1; i < K; i++){
            int result = a+b;
            a = b;
            b = result;
        }

        System.out.println(a + " " + b);
    }
}
