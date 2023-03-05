import java.util.Random;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int createNum = 0;
        String ranNum = "";
        int letter = 6;
        String resultNum = "";

        for (int i = 0; i < letter; i++) {
            createNum = rd.nextInt(9);
            ranNum = Integer.toString(createNum);
            resultNum += ranNum;
        }

        String lastNum = "";

        System.out.println("[주민등록번호 계산]");
        System.out.println("출생년도를 입력해 주세요.(yyyy):");
        String yyyy = sc.next();
        System.out.println("출생월을 입력 해주세요.(mm):");
        String mm = sc.next();
        System.out.println("출생일을 입력 해주세요.(dd):");
        String dd = sc.next();
        System.out.println("성별을 입력 해주세요.(m/f):");
        String sex = sc.next();

        if(sex.equals("m")){
            System.out.println(yyyy.substring(2) + mm + dd + "-" + 3 + resultNum);
        } else{
            System.out.println(yyyy.substring(2) + mm + dd + "-" + 4 + resultNum);
        }


    }
}
