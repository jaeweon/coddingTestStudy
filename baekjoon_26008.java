import java.util.Scanner;
public class baekjoon_26008 {
    public static void main(String[] args) {
        // 해시해킹

        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt(); // 3
        int M = sc.nextInt(); // 2
        int A = sc.nextInt(); // 1
        int H = sc.nextInt(); // 1

        long answer = 1;
        for (int i = 0; i < N - 1; i++) {
            answer = answer * M % 1000000007;
        }
        System.out.println(answer);
    }
}
