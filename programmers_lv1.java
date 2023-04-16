public class programmers_lv1 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int answer = 0;
        int cnt = 0;
        for(int i = left; i <= right; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt % 2 ==0) {
                answer += i;
                cnt = 0;
            }
            else answer -= i; cnt = 0;
        }
        System.out.println(answer);
    }
}
