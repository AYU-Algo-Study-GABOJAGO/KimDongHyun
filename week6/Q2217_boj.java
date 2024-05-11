package week6;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.math.BigInteger;


public class Q2217_boj {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        int result = 0;

        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            result = Math.max(result,arr[i] * (i+1));
        }
        System.out.print(result);
    }
}
