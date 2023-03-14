import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // stack의 길이
        int[] arrA = new int[N];  // 길이가 N인 순열 A

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt(); // N만큼 순열 A에 정수 배치
        }

        Stack<Integer>[] stackA = new Stack[4]; // error prevent
        for(int i = 0; i < 4; i++){
            stackA[i] = new Stack<>();
            stackA[i].push(0);
        }

        boolean can = true;
        for (int num : arrA){ // 4 3 6 7 8 9 10 2 1 5
            boolean cant = false;
            for (int i = 0; i < 4; i++) {
                if(num > stackA[i].peek()){ // 현재 넣으려는 값이 A 가장 윗 값 보다 크다면 배치, 작다면 다음 stack으로
                    stackA[i].push(num); // 배치
                    cant = true; // 성공
                    break;
                }
            }
            if(!cant){
                can = false;
                break;
            }
        }
        if(can == true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
