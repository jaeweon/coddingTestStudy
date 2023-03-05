import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("[입장권 계산");
        System.out.println("나이를 입력해 주세요.(숫자)");
        int age = sc.nextInt();
        if(age < 3){
            total = 0;
        }else if(3 < age && age < 13){
            total = 4000;
        }else {
            total = 10000;
        }
        System.out.println("입장시간을 입력해 주세요.(숫자입력)");
        int time = sc.nextInt();
        if (time > 17){
            total = 4000;
        }
        System.out.println("국가유공자 여부를 입력해 주세요.(y/n)");
        String soldier = sc.next();
        if(soldier.equals("y")){
            total = 8000;
        }

        System.out.println("복지카드 여부를 입력해 주세요.(y/n)");
        String handy = sc.next();
        if(handy.equals("y")){
            total = 8000;
        }
        System.out.println("입랑료: " + total);




    }
}
