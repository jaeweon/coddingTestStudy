import java.util.Scanner;
import java.util.Stack;

public class baekjoon_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> stack = new Stack();
        String s = "";

        for (int i = 0; i < n; i++) {
             s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if(stack.isEmpty()) stack.push(c);
                    else {
                        if(c == ')') {
                            if(stack.peek() == '(') {
                                stack.pop();
                            }
                            else {
                                stack.push(c);
                            }
                        }else {
                            stack.push(c);
                        }
                    }
            }
            if(stack.isEmpty()) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
