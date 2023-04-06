import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1254 {
    public static void main(String[] args) throws IOException { //  readLine 사용 시 예외처리 필수
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int answer = str.length();
        for (int i = 0; i < str.length(); i++) {
            if(isPalind(str.substring(i))){ // isPalind로 이동
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
    private static boolean isPalind(String str){
        int start = 0;
        int last = str.length() - 1;
        while (start <= last){
            if(str.charAt(start) != str.charAt(last)) // 양 끝 문자가 같다면 간격 좁히기
            return false;
                start++;
                last--;
        }
        return true;
    }
}
