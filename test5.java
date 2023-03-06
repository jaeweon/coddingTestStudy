import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.println("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.println("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        LocalDate monthStart = LocalDate.of(year, month, 1);
        int monthDay = monthStart.get(ChronoField.DAY_OF_WEEK);
        int monthEnd = monthStart.lengthOfMonth();

        System.out.printf("[%d년 %02d월]",year,month);
        System.out.println();
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        int totalCount = 0;

        for (int i = 0; i < monthDay; i++) {  // 앞에 빈 공간 공백으로 채워주기
            System.out.print("\t");
        }

        for (int i = 0; i < monthDay; i++) {
            totalCount++;
        }
        for (int j = 1; j <= monthEnd; j++) {
            System.out.printf("%02d\t", j);
            totalCount++;
            if (totalCount % 7 == 0){
                System.out.println();
            }
        }

    }
}
