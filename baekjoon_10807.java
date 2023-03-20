import java.util.Scanner;

public class baekjoon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] numbers = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if(sum == numbers[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
