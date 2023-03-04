import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.println("결제 금액을 입력해 주세요.(금액):");
        int pay =  sc.nextInt();
        int sum = 0;
        int cashBack = 0;

        if(pay > 0){
            sum = (int)(pay * 0.1);
            if(sum > 100){
                cashBack = sum - sum % 100;
            }
        }
        if(cashBack > 300){
            cashBack = 300;
        }
            System.out.println("결제 금액은 " + pay + "원이고, 캐시백은 " + cashBack + "원 입니다.");



    }
}
