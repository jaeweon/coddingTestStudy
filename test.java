import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        // 문자열 내림차순으로 배치하기
        String s = "Zbcdefg";
        String [] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        String answer = "";
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        System.out.println(answer);

    }
}