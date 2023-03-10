public class test1 {
    public static void main(String[] args) {
        // 구구단 출력 JAVA의 다중 반복문과 format함수를 사용
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf(String.format("%02d x %02d =%02d ", i, j, i * j));
            }
            System.out.println();
        }
    }
}
