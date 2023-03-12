// 1. 큰솔 화면에 구구단 출력하기
public class test1 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf(String.format("%02d x %02d = %02d\t", i, j, i * j));
            }
            System.out.println();
        }
    }
}
