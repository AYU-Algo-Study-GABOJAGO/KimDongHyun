package week2;

import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Q10866_boj {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++){
            String[] enter = br.readLine().split(" ");
            switch(enter[0]){
                case "push_front":
                    deque.addFirst(Integer.valueOf(enter[1]));
                    break;
                case "push_back" :
                    deque.addLast(Integer.valueOf(enter[1]));
                    break;
                case "pop_front" :
                    sb.append(!deque.isEmpty() ? deque.removeFirst() : -1).append("\n");
                    break;
                case "pop_back" :
                    sb.append(!deque.isEmpty() ? deque.removeLast() : -1).append("\n");
                    break;
                case "size" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(!deque.isEmpty() ? 0 : 1).append("\n");
                    break;
                case "front" :
                    sb.append(!deque.isEmpty() ? deque.getFirst() : -1).append("\n");
                    break;
                case "back" :
                    sb.append(!deque.isEmpty() ? deque.getLast() : -1).append("\n");
                    break;

            }
        }
        System.out.println(sb);

    }
}
