import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();

        int queueBox = sc.nextInt(); // Q의 길이 10
        int pick = sc.nextInt(); // Q에서 뽑을 숫자 개수 3개

        int[] choose = new int[pick]; // 뽑을 숫자 2 9 5

        for (int i = 1; i <= queueBox; i++) {
            queue.add(i);  // Q 에 1 ~ 10 까지 담기
        }

        for (int i = 0; i < pick; i++) {
            choose[i] = sc.nextInt(); // 뽑아야 할 숫자 배열에 담아주기 2 9 5
        }

            int cnt = 0;
            int rd = 0;
        while (queue.size() >= queue.size() - pick){
            int test = queue.peek();
                if(test == choose[rd]){
                    queue.poll();
                    rd ++;
                } else{
                    queue.add(queue.peek());
                    queue.poll();
                    cnt++;
                    continue;
                }
        }
        System.out.println(queue);

    }
}
