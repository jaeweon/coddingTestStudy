public class test1 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf(String.format("%02d x %02d =%02d ", i, j, i * j));
            }
            System.out.println();
        }

    }
}
