import java.util.Random;

public class test6 {
    public static void main(String[] args) {
        Random rd = new Random();
        String[] president = {"이재명","윤석열", "심상정", "안철수"};
        int[] candidate = new int[4];
        final int TOTAL_COUNT = 10000;

        for (int i = 1; i <= TOTAL_COUNT; i++){
            int vote = (int)(Math.random() * 4);
            candidate[vote]++;
            System.out.println();
            System.out.printf("[투표진행율]: %05.02f%c, %d명 투표 => %s\n",((double) candidate[vote] / (double)TOTAL_COUNT) * 100.0f,'%', (int)candidate[vote], president[vote]);
            System.out.printf("[기호:1] 이재명: %02.02f%c, (투표수: %d)\n",((double) candidate[0] / (double)TOTAL_COUNT) * 100.0f,'%', candidate[0]);
            System.out.printf("[기호:2] 윤석열: %02.02f%c, (투표수: %d)\n",((double) candidate[1] / (double)TOTAL_COUNT) * 100.0f,'%', candidate[1]);
            System.out.printf("[기호:3] 심상정: %02.02f%c, (투표수: %d)\n",((double) candidate[2] / (double)TOTAL_COUNT) * 100.0f,'%', candidate[2]);
            System.out.printf("[기호:4] 안철수: %02.02f%c, (투표수: %d)\n",((double) candidate[3] / (double)TOTAL_COUNT) * 100.0f,'%', candidate[3]);

        }
    }
}
