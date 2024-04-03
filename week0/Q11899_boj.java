package week0;

import java.util.Stack;
import java.util.Scanner;
public class Q11899_boj {
    static Stack<String> stackStr = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '(') {
                stackStr.push("(");
            }
            else if (str.charAt(i) == ')') {
                if (stackStr.isEmpty())
                    count++;
                else
                    stackStr.pop();
            }
        }
        System.out.println(count+stackStr.size());
    }
}



