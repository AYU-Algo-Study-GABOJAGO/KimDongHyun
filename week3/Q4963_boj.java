/*
package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4963_boj {
    static int[][] arr;
    static boolean[][] visitied;

    static int[] dx = {-1, -1, 0, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 0, -1, -1, -1};

    static int w;
    static int h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        while(true){

            w = Integer.parseInt(stringTokenizer.nextToken());
            h = Integer.parseInt(stringTokenizer.nextToken());
            int count = 0;

            arr = new int[w][h]; // 0
            visitied = new boolean[w][h]; //모두 false

            for(int i=0; i<w; i++){
                stringTokenizer = new StringTokenizer(br.readLine());
                for(int j=0; j<h; j++){
                    arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }

            for(int i=0; i<w; i++){
                for(int j=0; j<h; j++){
                    if(arr[i][j] == 1 && !visitied[i][j]){
                        DFS(i,j);
                        count++;
                    }
                }
            }



        }
    }

    private static void DFS(int x, int y){
        visitied[x][y] = true;

        for(int i=0; i<8; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(newX >= 0 && newY >= 0 && visitied[newX][newY] = false && newX = 1 && newY =1) //새로운 좌표값이 배열 안에 있거나, 방문하지 않았고, 1일때){
                DFS(newX, newY);
            }


        }
    }
}


 */