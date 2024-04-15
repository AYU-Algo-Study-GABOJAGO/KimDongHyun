package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Q15650_boj {
    public static int N;  // 1부터 N까지 자연수
    public static int M;  //수열의 길이가 M
    public static int[] num;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());    // 첫 번째 토큰을 정수형으로 변환하여 N에 저장
        M = Integer.parseInt(st.nextToken());
        num = new int[M]; // M개의 숫자를 저장할 배열을 생성

        dfs(1, 0);
        System.out.println("sb");
    }
    public static void dfs(int at, int depth) {

        if (depth == M) {
            for (int val : num) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i <= N; i++) {

            num[depth] = i;
            dfs(i + 1, depth + 1);

        }
    }
}
