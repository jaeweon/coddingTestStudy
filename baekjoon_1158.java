import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_1158 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        String answer = "";
        for (int i = 1; i <= n; i++) {
            q.add(i);  // 1 2 3 4 5 6 7
        }
        System.out.print("<");
        while (!q.isEmpty()){
            for (int i = 0; i < k - 1; i++) { // 2 times
                int sum = q.poll();
                q.offer(sum);
            }
            answer += q.poll() + ", ";
        }
        System.out.print(answer.substring(0,19) + ">");
    }
}
