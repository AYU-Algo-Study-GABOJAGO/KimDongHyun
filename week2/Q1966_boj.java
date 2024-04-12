package week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1966_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine()); // 테스트케이스 개수

        for(int i = 0; i < cnt; i++){
            st = new StringTokenizer(br.readLine()); // n m 입력받기
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<int[]> que = new LinkedList<int[]>();

            st = new StringTokenizer(br.readLine()); //문서 중요도 입력

            for (int j = 0; j < n; j++){
                int num = Integer.parseInt(st.nextToken());
                que.add(new int[] {j, num});
            }

            int copy = 0; //인쇄된 프린트 수
            while (true) {
                int[] cur = que.poll();
                boolean chk = true; // 중요도가 높은 것이 있는지 여부

                for (int[] curQ : que) {
                    assert cur != null;
                    if (curQ[1] > cur[1]) {
                        chk = false;
                        break;
                    }
                }

                if (chk) {
                    copy++;

                    assert cur != null;
                    if (cur[0] == m) break;
                } else {
                    que.add(cur);
                }
            }

            System.out.println(copy);
        }

    }
}